package net.cbtltd.client.panel;

import java.util.Date;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;

import net.cbtltd.client.AbstractRoot;
import net.cbtltd.client.Component;
import net.cbtltd.client.GuardedRequest;
import net.cbtltd.client.HasComponents;
import net.cbtltd.client.Razor;
import net.cbtltd.client.field.AbstractField;
import net.cbtltd.client.field.AbstractField.Level;
import net.cbtltd.client.field.CheckField;
import net.cbtltd.client.field.CommandButton;
import net.cbtltd.client.field.PasswordField;
import net.cbtltd.client.field.TextField;
import net.cbtltd.client.form.AccessControl;
import net.cbtltd.client.resource.FieldBundle;
import net.cbtltd.client.resource.FieldCssResource;
import net.cbtltd.client.resource.session.SessionBundle;
import net.cbtltd.client.resource.session.SessionConstants;
import net.cbtltd.client.resource.session.SessionCssResource;
import net.cbtltd.shared.Party;
import net.cbtltd.shared.Session;
import net.cbtltd.shared.Time;
import net.cbtltd.shared.party.PartyExists;
import net.cbtltd.shared.session.PasswordCreate;
import net.cbtltd.shared.session.SessionExists;
import net.cbtltd.shared.session.SessionLogin;

public class LoginWindow extends Composite implements MouseOutHandler, MouseOverHandler,FocusHandler, HasComponents {

	private static final SessionConstants CONSTANTS = GWT.create(SessionConstants.class);
	private static final SessionBundle BUNDLE = SessionBundle.INSTANCE;
	private static final SessionCssResource CSS = BUNDLE.css();
	private static final FieldCssResource FIELDCSS = FieldBundle.INSTANCE.css();

	private GuardedRequest<Party> partyExists;
	private GuardedRequest<Session> passwordCreate;
	private GuardedRequest<Session> sessionExists;
	private GuardedRequest<Session> sessionLogin;
	private boolean isPopup = false;
	private CheckField autologinField;
	
	private AbsolutePanel absolutePanel;
	private Label loginName;
	private TextField emailaddressField;
	private PasswordField passwordField;
	public CommandButton signonButton;
	private Label forgotPasswordButton;

	public LoginWindow()
	{				
		AbstractField.CSS.ensureInjected();
		CSS.ensureInjected();
		createActions();
		
		absolutePanel = new AbsolutePanel();
		absolutePanel.addStyleName(CSS.loginForm());
		initWidget(absolutePanel);

		loginName = new Label("Login");
		loginName.addStyleName(CSS.signLabel());
		absolutePanel.add(loginName);

		//-----------------------------------------------
		// Email address to identify user
		//-----------------------------------------------
		emailaddressField = new TextField(this, null, CONSTANTS.emailaddressLabel(), 1);
		emailaddressField.setDefaultValue(Cookies.getCookie("emailaddress"));
		emailaddressField.setFocus(true);
		emailaddressField.setHelpText(CONSTANTS.emailaddressHelp());		
		emailaddressField.setLabelStyle(CSS.labelText());
		emailaddressField.setFieldStyle(CSS.loginText());
		absolutePanel.add(emailaddressField);
		
		//-----------------------------------------------
		// Password field
		//-----------------------------------------------
		passwordField = new PasswordField(this, null, CONSTANTS.passwordLabel(), 2);
		passwordField.addChangeHandler(new ChangeHandler() {
			@Override
			public void onChange(ChangeEvent event) {
				sessionLogin.execute();
			}
		});
		passwordField.setSecure(true);
		passwordField.setHelpText(CONSTANTS.passwordHelp());
		passwordField.setLabelStyle(CSS.labelText());
		absolutePanel.add(passwordField);

		autologinField = new CheckField(this, null,	CONSTANTS.rememberLabel(), 3);
		autologinField.setReadOption(Session.LOGGED_OUT, true);
		autologinField.setDefaultValue(false);
		absolutePanel.add(autologinField);

		signonButton = new CommandButton(this, CONSTANTS.loginLabel(), sessionLogin, 4);
		signonButton.removeStyleName(FIELDCSS.cbtCommandButton());
		signonButton.setStyleName(CSS.pushButton());
		absolutePanel.add(signonButton);
		
		//-----------------------------------------------
		// Forgot Password button
		//-----------------------------------------------
		forgotPasswordButton = new Label(CONSTANTS.forgotPasswordLabel());
		forgotPasswordButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				passwordCreate.execute();				
			}
		});
		forgotPasswordButton.addStyleName(CSS.passwordcreateStyle());
		absolutePanel.add(forgotPasswordButton);		
	}

	@Override
	public void onFocus(FocusEvent event) {
		Widget sender = (Widget) event.getSource();

		if ((sender == emailaddressField) || (sender == passwordField)) {
			sender.addStyleName("ema-onFocusBorder");
		} 		
	}

	@Override
	public void onMouseOver(MouseOverEvent event) {
		Widget sender = (Widget) event.getSource();
		sender.addStyleName("ema-mouseOverBorder");
	}

	@Override
	public void onMouseOut(MouseOutEvent event) {
		Widget sender = (Widget) event.getSource();
		sender.removeStyleName("ema-mouseOverBorder");
	}



	String validate(String loginName, String password)
	{
		if(loginName.isEmpty())
			return "Username cannot be blank";
		else if (password.isEmpty())
			return "Password field cannot be blank";

		return null;
	}
	
	/* Creates the actions that may be executed. */
	private void createActions() {

		//-----------------------------------------------
		// Check if User Exists
		//-----------------------------------------------
		partyExists = new GuardedRequest<Party>() {
			protected boolean error() {
				return (
						emailaddressField.noValue()
						|| !Party.isEmailAddress(emailaddressField.getValue())
				);
			}
			protected void send() {super.send(getValue(new PartyExists()));}
			protected void receive(Party party){
				ifMessage((party == null), Level.ERROR, CONSTANTS.partyError(), emailaddressField);
			}
		};

		//-----------------------------------------------
		// Check if Session Exists
		//-----------------------------------------------
		sessionExists = new GuardedRequest<Session>() {
			protected boolean error() {return (
					isPopup
					|| Cookies.getCookie("sid") == null 
					|| Cookies.getCookie("sid").isEmpty()
			);}
			protected void send() {super.send(new SessionExists(Cookies.getCookie("sid")));}
			protected void receive(Session session) {if (session != null) {setValue(session);}}
		};

		//-----------------------------------------------
		// Login to Create Session
		//-----------------------------------------------
		sessionLogin = new GuardedRequest<Session>() {
			protected boolean error() {
				return (
						ifMessage(emailaddressField.noValue(), Level.ERROR, CONSTANTS.emailaddressnoneError(), emailaddressField)
						|| ifMessage(!Party.isEmailAddress(emailaddressField.getValue()), Level.ERROR, CONSTANTS.emailaddressinvalidError(), emailaddressField)
						|| ifMessage(passwordField.noValue(), Level.ERROR, CONSTANTS.passwordError(), passwordField)
				);
			}
			protected void send() {super.send(getValue(new SessionLogin()));}
			protected void receive(Session session) {setValue(session);}
		};

		//-----------------------------------------------
		// Create New Password
		//-----------------------------------------------
		passwordCreate = new GuardedRequest<Session>() {
			protected boolean error() {return false;} //return AbstractRoot.noSession() || AbstractRoot.getSession().notState(Session.LOGGED_OUT);}
			protected void send() {super.send(getValue(new PasswordCreate()));}
			protected void receive(Session session) {AbstractField.addMessage(Level.TERSE, CONSTANTS.passwordsentLabel(), passwordField);}
		};
	}

	
	/*
	 * Gets the specified user (party) action with its attributes set.
	 *
	 * @param action the specified action.
	 * @return the action with its attributes set.
	 */
	private Party getValue(Party party) {
		party.setEmailaddress(emailaddressField.getValue());
		return party;
	}

	/**
	 * Displays a pop up message if a condition is satisfied.
	 *
	 * @param condition the condition is true if the message is to be displayed.
	 * @param level the level of the message which dictates its importance and sets its colour.
	 * @param text the text to be displayed in the message.
	 * @param target the field or other widget next to which the message is to be displayed.
	 * @return true, if the condition is satisfied.
	 */
	protected boolean ifMessage(boolean condition, Level level, String text, UIObject target) {
		if (condition) {AbstractField.addMessage(level, text, target);}
		return condition;
	}
	
	/* (non-Javadoc)
	 * @see net.cbtltd.client.panel.AbstractPopup#getValue(java.lang.Object)
	 */
	private Session getValue(Session session) {
//		session.setState(state);
		session.setEmailaddress(emailaddressField.getValue());
		session.setId(passwordField.getValue());
		Log.debug("getValue " + session);
		return session;
	}

	/* (non-Javadoc)
	 * @see net.cbtltd.client.panel.AbstractPopup#getValue()
	 */
	public Session getValue() {return getValue(new Session());}

	/* (non-Javadoc)
	 * @see net.cbtltd.client.panel.AbstractPopup#setValue(java.lang.Object)
	 */
	public void setValue(Session session) {
		Log.debug("setValue " + session);
		if (session == null || session.hasState(Session.LOGGED_OUT)) {
			AbstractField.addMessage(Level.ERROR, CONSTANTS.loginError(), emailaddressField);
			onReset(Session.LOGGED_OUT);
		}
		else if (session.hasState(Session.SUSPENDED)) {
			AbstractField.addMessage(Level.ERROR, CONSTANTS.suspendedError(), emailaddressField);
			onReset(Session.LOGGED_OUT);
		}
		else {
//			onStateChange(session.getState());
			passwordField.clear();
			AbstractRoot.setSession(session);
//			Window.alert("setValue " + session);
			Date expires = new Date(System.currentTimeMillis() + Time.WEEK.milliseconds());//duration remembering login = 7 days
			if (autologinField.getValue()) {Cookies.setCookie("sid", session.getId(), expires);} //, null, "/", false);
			//else {Cookies.removeCookie("sid");}
			if (session.hasPermission(AccessControl.ORGANIZATION_ROLES)) {AbstractRoot.render(Razor.WORKFLOW_TAB);}
			else {AbstractRoot.render(Razor.SEARCH_TAB);}
//			hide();
		}
	}

	/* (non-Javadoc)
	 * @see net.cbtltd.client.panel.AbstractPopup#onChange(com.google.gwt.event.dom.client.ChangeEvent)
	 */
	@Override
	public void onChange(ChangeEvent change) {
		if (emailaddressField.sent(change)) {
			partyExists.execute();
			Cookies.setCookie("emailaddress", emailaddressField.getValue());
		}
	}

	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComponent(Component component) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasChanged() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onReset(String state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRefresh() {
		// TODO Auto-generated method stub
		
	}
}

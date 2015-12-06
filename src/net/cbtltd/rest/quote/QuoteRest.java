package net.cbtltd.rest.quote;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.bookingnet.service.MailService;

import net.cbtltd.shared.Mail;

import org.apache.log4j.Logger;

/**
 * The Class FlipkeyRest.
 */
@Path("/quote")
@Produces("application/xml")
public class QuoteRest {

	private static final Logger LOG = Logger.getLogger(QuoteRest.class.getName());

	@GET
	@Path("/send")
	public static synchronized String send() {

		Mail mail = new Mail();
		mail.setSubject("Quote send endpoint");
		mail.setContent("Testing email");
		mail.setRecipients("mike793@gmail.com, konstantinnvlasov@gmail.com");
		MailService.send(mail);
		
		System.out.println("test email sending");
		
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><sent/>";
	}
}

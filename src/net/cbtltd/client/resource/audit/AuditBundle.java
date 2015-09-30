/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.client.resource.audit;


import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface AuditBundle
extends ClientBundle {

	AuditBundle INSTANCE = GWT.create(AuditBundle.class);

	@Source("Audit.css")	AuditCssResource css();
}
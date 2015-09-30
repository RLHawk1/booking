/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.client.resource.price;


import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface PriceBundle
extends ClientBundle {

	PriceBundle INSTANCE = GWT.create(PriceBundle.class);

	@Source("Price.css")
	PriceCssResource css();
}
/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.client.resource.contract;


import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface ContractBundle
extends ClientBundle {

	ContractBundle INSTANCE = GWT.create(ContractBundle.class);

	@Source("Contract.css")
	ContractCssResource css();
}
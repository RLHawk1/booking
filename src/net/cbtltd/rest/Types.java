/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.rest;

import java.util.Collection;

import net.cbtltd.shared.License;

public class Types {
	public Collection<String> type;
	
	public Types() {}

	public Types(Collection<String> type) {
		super();
		this.type = type;
	}
}

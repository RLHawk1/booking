/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.session;

import net.cbtltd.shared.Session;

public class SessionExists extends Session {
	
	public SessionExists() {}

	public SessionExists(String id) {
		this.id = id;
	}
}

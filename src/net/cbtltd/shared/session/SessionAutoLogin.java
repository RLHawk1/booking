/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.session;

import net.cbtltd.shared.Session;

public class SessionAutoLogin extends Session {

//	private String pos; //point of sale code

	protected SessionAutoLogin() {}
	
	public SessionAutoLogin(String id) {
		this.id = id;
	}
}

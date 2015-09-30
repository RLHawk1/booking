/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

import java.util.Collection;

public class Photos {
	public Collection<String> Photo;

	public Photos(){}
	
	public Photos(Collection<String> photo) {
		this.Photo = photo;
	}
}

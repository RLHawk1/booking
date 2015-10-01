/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

import java.util.Collection;

public class Amenities {
	public Collection<String> Amenity;
	
	public Amenities() {}

	public Amenities(Collection<String> amenity) {
		super();
		this.Amenity = amenity;
	}
}
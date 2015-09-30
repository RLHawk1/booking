/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;

public class PropertyUpdate {
	@XmlAttribute (name = "property_id")
	public String property_id;
	@XmlAttribute (name = "last_update")
	public String last_update;
}

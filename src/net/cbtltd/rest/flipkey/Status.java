/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;

public class Status {
	@XmlAttribute (name = "value")
	public String value;
	
	Status(){}
	
	Status(String value){
		this.value = value;
	}
}

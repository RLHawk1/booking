package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;

public class HandicapAccessible {
	@XmlAttribute (name = "value")
	public String value;
	
	HandicapAccessible(){}

	HandicapAccessible(String value){
		this.value = value;
	}
}

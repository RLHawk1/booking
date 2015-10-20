package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;

public class ElderlyAccessible {
	@XmlAttribute (name = "value")
	public String value;
	
	ElderlyAccessible(){}

	ElderlyAccessible(String value){
		this.value = value;
	}
}

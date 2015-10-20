package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;

public class Pets {
	@XmlAttribute (name = "value")
	public String value;
	
	Pets(){}

	Pets(String value){
		this.value = value;
	}
}

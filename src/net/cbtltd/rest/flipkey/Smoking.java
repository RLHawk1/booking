package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;

public class Smoking {
	@XmlAttribute (name = "value")
	public String value;
	
	Smoking(){}

	Smoking(String value){
		this.value = value;
	}
}

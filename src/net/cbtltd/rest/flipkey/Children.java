package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;

public class Children {
	@XmlAttribute (name = "value")
	public String value;
	
	Children(){}

	Children(String value){
		this.value = value;
	}
}

package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;

public class Bedrooms {
	@XmlAttribute (name = "count")
	public Integer count;
	
	Bedrooms(){}

	Bedrooms(Integer count){
		this.count = count;
	}
}

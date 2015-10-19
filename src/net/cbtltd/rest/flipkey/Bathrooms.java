package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;

public class Bathrooms {
	@XmlAttribute (name = "count")
	public Integer count;
	
	Bathrooms(){}

	Bathrooms(Integer count){
		this.count = count;
	}
}

package net.cbtltd.rest.flipkey;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class PropertyType {
	@XmlAttribute (name = "type")
	public String type;
	@XmlValue
	public String PropertyType;
	
	PropertyType(){}

	PropertyType(String type){
		this.type = type;
	}
	
	PropertyType(String type, String PropertyType){
		this.type = type;
		this.PropertyType = PropertyType;
	}

}

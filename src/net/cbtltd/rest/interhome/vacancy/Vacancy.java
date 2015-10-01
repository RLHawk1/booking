//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.17 at 09:59:42 AM CAT 
//


package net.cbtltd.rest.interhome.vacancy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{}accommodationCodeType"/>
 *         &lt;element name="startday" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="availability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeover" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minstay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flexbooking" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "startday",
    "availability",
    "changeover",
    "minstay",
    "flexbooking"
})
@XmlRootElement(name = "vacancy")
public class Vacancy {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startday;
    @XmlElement(required = true)
    protected String availability;
    @XmlElement(required = true)
    protected String changeover;
    @XmlElement(required = true)
    protected String minstay;
    @XmlElement(required = true)
    protected String flexbooking;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the startday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartday() {
        return startday;
    }

    /**
     * Sets the value of the startday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartday(XMLGregorianCalendar value) {
        this.startday = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Gets the value of the changeover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeover() {
        return changeover;
    }

    /**
     * Sets the value of the changeover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeover(String value) {
        this.changeover = value;
    }

    /**
     * Gets the value of the minstay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinstay() {
        return minstay;
    }

    /**
     * Sets the value of the minstay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinstay(String value) {
        this.minstay = value;
    }

    /**
     * Gets the value of the flexbooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexbooking() {
        return flexbooking;
    }

    /**
     * Sets the value of the flexbooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexbooking(String value) {
        this.flexbooking = value;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vacancy [code=");
		builder.append(code);
		builder.append(", startday=");
		builder.append(startday);
		builder.append(", availability=");
		builder.append(availability);
		builder.append(", changeover=");
		builder.append(changeover);
		builder.append(", minstay=");
		builder.append(minstay);
		builder.append(", flexbooking=");
		builder.append(flexbooking);
		builder.append("]");
		return builder.toString();
	}

}
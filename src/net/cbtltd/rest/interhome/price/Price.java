//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.16 at 03:01:08 PM CAT 
//


package net.cbtltd.rest.interhome.price;

import java.math.BigDecimal;
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
 *         &lt;element name="startdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="rentalprice">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="minrentalprice" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="maxrentalprice" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}specialoffer" minOccurs="0"/>
 *         &lt;element ref="{}services" minOccurs="0"/>
 *         &lt;element name="midweekrentalprice" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="weekendrentalprice" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fixprice" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "startdate",
    "enddate",
    "rentalprice",
    "minrentalprice",
    "maxrentalprice",
    "specialoffer",
    "services",
    "midweekrentalprice",
    "weekendrentalprice",
    "fixprice"
})
@XmlRootElement(name = "price")
public class Price {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enddate;
    @XmlElement(required = true)
    protected BigDecimal rentalprice;
    protected BigDecimal minrentalprice;
    protected BigDecimal maxrentalprice;
    protected Specialoffer specialoffer;
    protected Services services;
    protected BigDecimal midweekrentalprice;
    protected BigDecimal weekendrentalprice;
    protected BigDecimal fixprice;

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
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartdate() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartdate(XMLGregorianCalendar value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnddate() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddate(XMLGregorianCalendar value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the rentalprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRentalprice() {
        return rentalprice;
    }

    /**
     * Sets the value of the rentalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRentalprice(BigDecimal value) {
        this.rentalprice = value;
    }

    /**
     * Gets the value of the minrentalprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinrentalprice() {
        return minrentalprice;
    }

    /**
     * Sets the value of the minrentalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinrentalprice(BigDecimal value) {
        this.minrentalprice = value;
    }

    /**
     * Gets the value of the maxrentalprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxrentalprice() {
        return maxrentalprice;
    }

    /**
     * Sets the value of the maxrentalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxrentalprice(BigDecimal value) {
        this.maxrentalprice = value;
    }

    /**
     * Gets the value of the specialoffer property.
     * 
     * @return
     *     possible object is
     *     {@link Specialoffer }
     *     
     */
    public Specialoffer getSpecialoffer() {
        return specialoffer;
    }

    /**
     * Sets the value of the specialoffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Specialoffer }
     *     
     */
    public void setSpecialoffer(Specialoffer value) {
        this.specialoffer = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link Services }
     *     
     */
    public Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link Services }
     *     
     */
    public void setServices(Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the midweekrentalprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMidweekrentalprice() {
        return midweekrentalprice;
    }

    /**
     * Sets the value of the midweekrentalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMidweekrentalprice(BigDecimal value) {
        this.midweekrentalprice = value;
    }

    /**
     * Gets the value of the weekendrentalprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeekendrentalprice() {
        return weekendrentalprice;
    }

    /**
     * Sets the value of the weekendrentalprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeekendrentalprice(BigDecimal value) {
        this.weekendrentalprice = value;
    }

    /**
     * Gets the value of the fixprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixprice() {
        return fixprice;
    }

    /**
     * Sets the value of the fixprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixprice(BigDecimal value) {
        this.fixprice = value;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Price [code=");
		builder.append(code);
		builder.append(", startdate=");
		builder.append(startdate);
		builder.append(", enddate=");
		builder.append(enddate);
		builder.append(", rentalprice=");
		builder.append(rentalprice);
		builder.append(", minrentalprice=");
		builder.append(minrentalprice);
		builder.append(", maxrentalprice=");
		builder.append(maxrentalprice);
		builder.append(", specialoffer=");
		builder.append(specialoffer);
		builder.append(", services=");
		builder.append(services);
		builder.append(", midweekrentalprice=");
		builder.append(midweekrentalprice);
		builder.append(", weekendrentalprice=");
		builder.append(weekendrentalprice);
		builder.append(", fixprice=");
		builder.append(fixprice);
		builder.append("]");
		return builder.toString();
	}

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.25 at 02:08:22 PM CAT 
//


package net.cbtltd.rest.flipkey.parse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}proplink"/>
 *         &lt;element ref="{}prev"/>
 *         &lt;element ref="{}next"/>
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
    "proplink",
    "prev",
    "next"
})
@XmlRootElement(name = "links")
public class Links {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String proplink;
    @XmlElement(required = true)
    protected Prev prev;
    @XmlElement(required = true)
    protected Next next;

    /**
     * Gets the value of the proplink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProplink() {
        return proplink;
    }

    /**
     * Sets the value of the proplink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProplink(String value) {
        this.proplink = value;
    }

    /**
     * Gets the value of the prev property.
     * 
     * @return
     *     possible object is
     *     {@link Prev }
     *     
     */
    public Prev getPrev() {
        return prev;
    }

    /**
     * Sets the value of the prev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prev }
     *     
     */
    public void setPrev(Prev value) {
        this.prev = value;
    }

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link Next }
     *     
     */
    public Next getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link Next }
     *     
     */
    public void setNext(Next value) {
        this.next = value;
    }

}

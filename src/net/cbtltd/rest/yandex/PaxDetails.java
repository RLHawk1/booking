//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 09:44:01 AM IST 
//


package net.cbtltd.rest.yandex;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paxDescription",
    "contact",
    "homeStay"
})
@XmlRootElement(name = "PaxDetails")
public class PaxDetails {

    @XmlElement(name = "PaxDescription", required = true)
    protected List<PaxDescription> paxDescription;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlElement(name = "HomeStay", required = true)
    protected HomeStay homeStay;

    /**
     * Gets the value of the paxDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxDescription }
     * 
     * 
     */
    public List<PaxDescription> getPaxDescription() {
        if (paxDescription == null) {
            paxDescription = new ArrayList<PaxDescription>();
        }
        return this.paxDescription;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the homeStay property.
     * 
     * @return
     *     possible object is
     *     {@link HomeStay }
     *     
     */
    public HomeStay getHomeStay() {
        return homeStay;
    }

    /**
     * Sets the value of the homeStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeStay }
     *     
     */
    public void setHomeStay(HomeStay value) {
        this.homeStay = value;
    }

}

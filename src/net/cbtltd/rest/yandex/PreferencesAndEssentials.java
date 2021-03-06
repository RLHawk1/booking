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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "peCode",
    "objectID",
    "sequence",
    "paxID"
})
@XmlRootElement(name = "PreferencesAndEssentials")
public class PreferencesAndEssentials {

    @XmlAttribute(name = "PEType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String peType;
    @XmlElement(name = "PECode", required = true)
    protected String peCode;
    @XmlElement(name = "ObjectID")
    protected String objectID;
    @XmlElement(name = "Sequence")
    protected Sequence sequence;
    @XmlElement(name = "PaxID")
    protected List<PaxID> paxID;

    /**
     * Gets the value of the peType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEType() {
        return peType;
    }

    /**
     * Sets the value of the peType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEType(String value) {
        this.peType = value;
    }

    /**
     * Gets the value of the peCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECode() {
        return peCode;
    }

    /**
     * Sets the value of the peCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECode(String value) {
        this.peCode = value;
    }

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Sequence }
     *     
     */
    public Sequence getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sequence }
     *     
     */
    public void setSequence(Sequence value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the paxID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxID }
     * 
     * 
     */
    public List<PaxID> getPaxID() {
        if (paxID == null) {
            paxID = new ArrayList<PaxID>();
        }
        return this.paxID;
    }

}

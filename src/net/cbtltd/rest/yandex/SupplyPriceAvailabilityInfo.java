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
    "departureDate",
    "duration",
    "carrierGroup",
    "supplyPriceAvailability"
})
@XmlRootElement(name = "SupplyPriceAvailabilityInfo")
public class SupplyPriceAvailabilityInfo {

    @XmlElement(name = "DepartureDate", required = true)
    protected DepartureDate departureDate;
    @XmlElement(name = "Duration", required = true)
    protected Duration duration;
    @XmlElement(name = "CarrierGroup")
    protected CarrierGroup carrierGroup;
    @XmlElement(name = "SupplyPriceAvailability", required = true)
    protected List<SupplyPriceAvailability> supplyPriceAvailability;

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureDate }
     *     
     */
    public DepartureDate getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureDate }
     *     
     */
    public void setDepartureDate(DepartureDate value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the carrierGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierGroup }
     *     
     */
    public CarrierGroup getCarrierGroup() {
        return carrierGroup;
    }

    /**
     * Sets the value of the carrierGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierGroup }
     *     
     */
    public void setCarrierGroup(CarrierGroup value) {
        this.carrierGroup = value;
    }

    /**
     * Gets the value of the supplyPriceAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyPriceAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyPriceAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyPriceAvailability }
     * 
     * 
     */
    public List<SupplyPriceAvailability> getSupplyPriceAvailability() {
        if (supplyPriceAvailability == null) {
            supplyPriceAvailability = new ArrayList<SupplyPriceAvailability>();
        }
        return this.supplyPriceAvailability;
    }

}

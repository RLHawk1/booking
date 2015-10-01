//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 09:44:01 AM IST 
//


package net.cbtltd.rest.nextpax;
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
    "mutationType",
    "offerType",
    "brand",
    "packageID",
    "packageInfo",
    "supplyTransportInfo",
    "supplyAccoInfo",
    "supplyPriceAvailabilityInfo"
})
@XmlRootElement(name = "SupplyPackage")
public class SupplyPackage {

    @XmlElement(name = "MutationType", required = true)
    protected String mutationType;
    @XmlElement(name = "OfferType", required = true)
    protected OfferType offerType;
    @XmlElement(name = "Brand", required = true)
    protected Brand brand;
    @XmlElement(name = "PackageID", required = true)
    protected String packageID;
    @XmlElement(name = "PackageInfo")
    protected PackageInfo packageInfo;
    @XmlElement(name = "SupplyTransportInfo")
    protected SupplyTransportInfo supplyTransportInfo;
    @XmlElement(name = "SupplyAccoInfo")
    protected SupplyAccoInfo supplyAccoInfo;
    @XmlElement(name = "SupplyPriceAvailabilityInfo")
    protected List<SupplyPriceAvailabilityInfo> supplyPriceAvailabilityInfo;

    /**
     * Gets the value of the mutationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMutationType() {
        return mutationType;
    }

    /**
     * Sets the value of the mutationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMutationType(String value) {
        this.mutationType = value;
    }

    /**
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setOfferType(OfferType value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link Brand }
     *     
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Brand }
     *     
     */
    public void setBrand(Brand value) {
        this.brand = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageID() {
        return packageID;
    }

    /**
     * Sets the value of the packageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageID(String value) {
        this.packageID = value;
    }

    /**
     * Gets the value of the packageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PackageInfo }
     *     
     */
    public PackageInfo getPackageInfo() {
        return packageInfo;
    }

    /**
     * Sets the value of the packageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageInfo }
     *     
     */
    public void setPackageInfo(PackageInfo value) {
        this.packageInfo = value;
    }

    /**
     * Gets the value of the supplyTransportInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyTransportInfo }
     *     
     */
    public SupplyTransportInfo getSupplyTransportInfo() {
        return supplyTransportInfo;
    }

    /**
     * Sets the value of the supplyTransportInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyTransportInfo }
     *     
     */
    public void setSupplyTransportInfo(SupplyTransportInfo value) {
        this.supplyTransportInfo = value;
    }

    /**
     * Gets the value of the supplyAccoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyAccoInfo }
     *     
     */
    public SupplyAccoInfo getSupplyAccoInfo() {
        return supplyAccoInfo;
    }

    /**
     * Sets the value of the supplyAccoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyAccoInfo }
     *     
     */
    public void setSupplyAccoInfo(SupplyAccoInfo value) {
        this.supplyAccoInfo = value;
    }

    /**
     * Gets the value of the supplyPriceAvailabilityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyPriceAvailabilityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyPriceAvailabilityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyPriceAvailabilityInfo }
     * 
     * 
     */
    public List<SupplyPriceAvailabilityInfo> getSupplyPriceAvailabilityInfo() {
        if (supplyPriceAvailabilityInfo == null) {
            supplyPriceAvailabilityInfo = new ArrayList<SupplyPriceAvailabilityInfo>();
        }
        return this.supplyPriceAvailabilityInfo;
    }

}
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
    "price",
    "totalCommission",
    "priceDetails"
})
@XmlRootElement(name = "PriceInfo")
public class PriceInfo {

    @XmlElement(name = "Price", required = true)
    protected Price price;
    @XmlElement(name = "TotalCommission")
    protected String totalCommission;
    @XmlElement(name = "PriceDetails", required = true)
    protected List<PriceDetails> priceDetails;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the totalCommission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCommission() {
        return totalCommission;
    }

    /**
     * Sets the value of the totalCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCommission(String value) {
        this.totalCommission = value;
    }

    /**
     * Gets the value of the priceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceDetails }
     * 
     * 
     */
    public List<PriceDetails> getPriceDetails() {
        if (priceDetails == null) {
            priceDetails = new ArrayList<PriceDetails>();
        }
        return this.priceDetails;
    }

}

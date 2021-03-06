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
    "unitID",
    "unitType",
    "unitDif",
    "description",
    "text",
    "minOccupancy",
    "maxOccupancy",
    "facilityInfo",
    "boardInfo",
    "priceInfo",
    "priceNotes"
})
@XmlRootElement(name = "UnitInfo")
public class UnitInfo {

    @XmlElement(name = "UnitID", required = true)
    protected String unitID;
    @XmlElement(name = "UnitType", required = true)
    protected String unitType;
    @XmlElement(name = "UnitDif")
    protected String unitDif;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Text")
    protected List<Text> text;
    @XmlElement(name = "MinOccupancy")
    protected String minOccupancy;
    @XmlElement(name = "MaxOccupancy")
    protected String maxOccupancy;
    @XmlElement(name = "FacilityInfo")
    protected List<FacilityInfo> facilityInfo;
    @XmlElement(name = "BoardInfo")
    protected List<BoardInfo> boardInfo;
    @XmlElement(name = "PriceInfo")
    protected List<PriceInfo> priceInfo;
    @XmlElement(name = "PriceNotes")
    protected List<PriceNotes> priceNotes;

    /**
     * Gets the value of the unitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitID() {
        return unitID;
    }

    /**
     * Sets the value of the unitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitID(String value) {
        this.unitID = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the unitDif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitDif() {
        return unitDif;
    }

    /**
     * Sets the value of the unitDif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitDif(String value) {
        this.unitDif = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * 
     * 
     */
    public List<Text> getText() {
        if (text == null) {
            text = new ArrayList<Text>();
        }
        return this.text;
    }

    /**
     * Gets the value of the minOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinOccupancy() {
        return minOccupancy;
    }

    /**
     * Sets the value of the minOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinOccupancy(String value) {
        this.minOccupancy = value;
    }

    /**
     * Gets the value of the maxOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Sets the value of the maxOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxOccupancy(String value) {
        this.maxOccupancy = value;
    }

    /**
     * Gets the value of the facilityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityInfo }
     * 
     * 
     */
    public List<FacilityInfo> getFacilityInfo() {
        if (facilityInfo == null) {
            facilityInfo = new ArrayList<FacilityInfo>();
        }
        return this.facilityInfo;
    }

    /**
     * Gets the value of the boardInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoardInfo }
     * 
     * 
     */
    public List<BoardInfo> getBoardInfo() {
        if (boardInfo == null) {
            boardInfo = new ArrayList<BoardInfo>();
        }
        return this.boardInfo;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceInfo }
     * 
     * 
     */
    public List<PriceInfo> getPriceInfo() {
        if (priceInfo == null) {
            priceInfo = new ArrayList<PriceInfo>();
        }
        return this.priceInfo;
    }

    /**
     * Gets the value of the priceNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceNotes }
     * 
     * 
     */
    public List<PriceNotes> getPriceNotes() {
        if (priceNotes == null) {
            priceNotes = new ArrayList<PriceNotes>();
        }
        return this.priceNotes;
    }

}

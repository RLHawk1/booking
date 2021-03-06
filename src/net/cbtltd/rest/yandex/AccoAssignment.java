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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accommodationIDOrComponentID",
    "sequence",
    "arrivalDate",
    "durationOrDepartureDate",
    "boardAssignment",
    "unitAssignment",
    "arrangementAssignment",
    "extrasAssignment"
})
@XmlRootElement(name = "AccoAssignment")
public class AccoAssignment {

    @XmlElements({
        @XmlElement(name = "AccommodationID", required = true, type = AccommodationID.class),
        @XmlElement(name = "ComponentID", required = true, type = ComponentID.class)
    })
    protected List<Object> accommodationIDOrComponentID;
    @XmlElement(name = "Sequence")
    protected Sequence sequence;
    @XmlElement(name = "ArrivalDate", required = true)
    protected String arrivalDate;
    @XmlElements({
        @XmlElement(name = "Duration", required = true, type = Duration.class),
        @XmlElement(name = "DepartureDate", required = true, type = DepartureDate.class)
    })
    protected List<Object> durationOrDepartureDate;
    @XmlElement(name = "BoardAssignment")
    protected List<BoardAssignment> boardAssignment;
    @XmlElement(name = "UnitAssignment", required = true)
    protected List<UnitAssignment> unitAssignment;
    @XmlElement(name = "ArrangementAssignment")
    protected List<ArrangementAssignment> arrangementAssignment;
    @XmlElement(name = "ExtrasAssignment")
    protected List<ExtrasAssignment> extrasAssignment;

    /**
     * Gets the value of the accommodationIDOrComponentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationIDOrComponentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationIDOrComponentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccommodationID }
     * {@link ComponentID }
     * 
     * 
     */
    public List<Object> getAccommodationIDOrComponentID() {
        if (accommodationIDOrComponentID == null) {
            accommodationIDOrComponentID = new ArrayList<Object>();
        }
        return this.accommodationIDOrComponentID;
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
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the durationOrDepartureDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the durationOrDepartureDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDurationOrDepartureDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Duration }
     * {@link DepartureDate }
     * 
     * 
     */
    public List<Object> getDurationOrDepartureDate() {
        if (durationOrDepartureDate == null) {
            durationOrDepartureDate = new ArrayList<Object>();
        }
        return this.durationOrDepartureDate;
    }

    /**
     * Gets the value of the boardAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoardAssignment }
     * 
     * 
     */
    public List<BoardAssignment> getBoardAssignment() {
        if (boardAssignment == null) {
            boardAssignment = new ArrayList<BoardAssignment>();
        }
        return this.boardAssignment;
    }

    /**
     * Gets the value of the unitAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitAssignment }
     * 
     * 
     */
    public List<UnitAssignment> getUnitAssignment() {
        if (unitAssignment == null) {
            unitAssignment = new ArrayList<UnitAssignment>();
        }
        return this.unitAssignment;
    }

    /**
     * Gets the value of the arrangementAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrangementAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrangementAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrangementAssignment }
     * 
     * 
     */
    public List<ArrangementAssignment> getArrangementAssignment() {
        if (arrangementAssignment == null) {
            arrangementAssignment = new ArrayList<ArrangementAssignment>();
        }
        return this.arrangementAssignment;
    }

    /**
     * Gets the value of the extrasAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrasAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrasAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtrasAssignment }
     * 
     * 
     */
    public List<ExtrasAssignment> getExtrasAssignment() {
        if (extrasAssignment == null) {
            extrasAssignment = new ArrayList<ExtrasAssignment>();
        }
        return this.extrasAssignment;
    }

}

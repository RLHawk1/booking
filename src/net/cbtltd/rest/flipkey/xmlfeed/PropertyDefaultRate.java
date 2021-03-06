//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.03 at 03:35:11 PM IST 
//


package net.cbtltd.rest.flipkey.xmlfeed;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}day_max_rate"/>
 *         &lt;element ref="{}weekend_min_rate"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}changeover_day"/>
 *           &lt;element ref="{}day_min_rate"/>
 *           &lt;element ref="{}is_changeover_day_defined"/>
 *           &lt;element ref="{}min_stay_count"/>
 *           &lt;element ref="{}min_stay_unit"/>
 *           &lt;element ref="{}minimum_length"/>
 *           &lt;element ref="{}month_max_rate"/>
 *           &lt;element ref="{}month_min_rate"/>
 *           &lt;element ref="{}per_person_over_amount"/>
 *           &lt;element ref="{}per_person_per_night"/>
 *           &lt;element ref="{}per_person_per_stay"/>
 *           &lt;element ref="{}week_max_rate"/>
 *           &lt;element ref="{}week_min_rate"/>
 *           &lt;element ref="{}weekend_max_rate"/>
 *           &lt;element ref="{}weekend_nights"/>
 *         &lt;/choice>
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
    "dayMaxRate",
    "weekendMinRate",
    "changeoverDayOrDayMinRateOrIsChangeoverDayDefined"
})
@XmlRootElement(name = "property_default_rate")
public class PropertyDefaultRate {

    @XmlElement(name = "day_max_rate", required = true)
    protected String dayMaxRate;
    @XmlElement(name = "weekend_min_rate", required = true)
    protected String weekendMinRate;
    @XmlElementRefs({
        @XmlElementRef(name = "per_person_per_stay", type = PerPersonPerStay.class),
        @XmlElementRef(name = "is_changeover_day_defined", type = JAXBElement.class),
        @XmlElementRef(name = "month_max_rate", type = JAXBElement.class),
        @XmlElementRef(name = "week_max_rate", type = JAXBElement.class),
        @XmlElementRef(name = "changeover_day", type = JAXBElement.class),
        @XmlElementRef(name = "day_min_rate", type = JAXBElement.class),
        @XmlElementRef(name = "weekend_nights", type = JAXBElement.class),
        @XmlElementRef(name = "weekend_max_rate", type = JAXBElement.class),
        @XmlElementRef(name = "per_person_over_amount", type = JAXBElement.class),
        @XmlElementRef(name = "min_stay_unit", type = JAXBElement.class),
        @XmlElementRef(name = "week_min_rate", type = JAXBElement.class),
        @XmlElementRef(name = "month_min_rate", type = JAXBElement.class),
        @XmlElementRef(name = "min_stay_count", type = JAXBElement.class),
        @XmlElementRef(name = "minimum_length", type = JAXBElement.class),
        @XmlElementRef(name = "per_person_per_night", type = PerPersonPerNight.class)
    })
    protected List<Object> changeoverDayOrDayMinRateOrIsChangeoverDayDefined;

    /**
     * Gets the value of the dayMaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayMaxRate() {
        return dayMaxRate;
    }

    /**
     * Sets the value of the dayMaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayMaxRate(String value) {
        this.dayMaxRate = value;
    }

    /**
     * Gets the value of the weekendMinRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekendMinRate() {
        return weekendMinRate;
    }

    /**
     * Sets the value of the weekendMinRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekendMinRate(String value) {
        this.weekendMinRate = value;
    }

    /**
     * Gets the value of the changeoverDayOrDayMinRateOrIsChangeoverDayDefined property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeoverDayOrDayMinRateOrIsChangeoverDayDefined property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeoverDayOrDayMinRateOrIsChangeoverDayDefined().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerPersonPerStay }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link PerPersonPerNight }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * 
     */
    public List<Object> getChangeoverDayOrDayMinRateOrIsChangeoverDayDefined() {
        if (changeoverDayOrDayMinRateOrIsChangeoverDayDefined == null) {
            changeoverDayOrDayMinRateOrIsChangeoverDayDefined = new ArrayList<Object>();
        }
        return this.changeoverDayOrDayMinRateOrIsChangeoverDayDefined;
    }

}

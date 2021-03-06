//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.03 at 03:35:11 PM IST 
//


package net.cbtltd.rest.flipkey.xmlfeed;

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
 *         &lt;element ref="{}property_details"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}property_calendar"/>
 *           &lt;element ref="{}property_addresses"/>
 *           &lt;element ref="{}property_amenities"/>
 *           &lt;element ref="{}property_attributes"/>
 *           &lt;element ref="{}property_bathrooms"/>
 *           &lt;element ref="{}property_bedrooms"/>
 *           &lt;element ref="{}property_calendars"/>
 *           &lt;element ref="{}property_default_rates"/>
 *           &lt;element ref="{}property_descriptions"/>
 *           &lt;element ref="{}property_fees"/>
 *           &lt;element ref="{}property_flags"/>
 *           &lt;element ref="{}property_nearby_details"/>
 *           &lt;element ref="{}property_photos"/>
 *           &lt;element ref="{}property_rate_summary"/>
 *           &lt;element ref="{}property_rates"/>
 *           &lt;element ref="{}property_seating"/>
 *           &lt;element ref="{}property_special"/>
 *           &lt;element ref="{}property_themes"/>
 *           &lt;element ref="{}review_count"/>
 *           &lt;element ref="{}review_photos"/>
 *           &lt;element ref="{}review_sum"/>
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
    "propertyDetails",
    "propertyCalendarOrPropertyAddressesOrPropertyAmenities"
})
@XmlRootElement(name = "property")
public class Property {

    @XmlElement(name = "property_details", required = true)
    protected PropertyDetails propertyDetails;
    @XmlElementRefs({
        @XmlElementRef(name = "property_descriptions", type = PropertyDescriptions.class),
        @XmlElementRef(name = "property_flags", type = PropertyFlags.class),
        @XmlElementRef(name = "property_bathrooms", type = PropertyBathrooms.class),
        @XmlElementRef(name = "property_amenities", type = PropertyAmenities.class),
        @XmlElementRef(name = "property_attributes", type = PropertyAttributes.class),
        @XmlElementRef(name = "property_nearby_details", type = PropertyNearbyDetails.class),
        @XmlElementRef(name = "property_default_rates", type = PropertyDefaultRates.class),
        @XmlElementRef(name = "review_sum", type = JAXBElement.class),
        @XmlElementRef(name = "property_special", type = PropertySpecial.class),
        @XmlElementRef(name = "property_photos", type = PropertyPhotos.class),
        @XmlElementRef(name = "property_calendars", type = PropertyCalendars.class),
        @XmlElementRef(name = "property_themes", type = PropertyThemes.class),
        @XmlElementRef(name = "property_bedrooms", type = PropertyBedrooms.class),
        @XmlElementRef(name = "property_addresses", type = PropertyAddresses.class),
        @XmlElementRef(name = "review_count", type = JAXBElement.class),
        @XmlElementRef(name = "property_rates", type = PropertyRates.class),
        @XmlElementRef(name = "property_seating", type = PropertySeating.class),
        @XmlElementRef(name = "property_fees", type = PropertyFees.class),
        @XmlElementRef(name = "property_calendar", type = PropertyCalendar.class),
        @XmlElementRef(name = "review_photos", type = ReviewPhotos.class),
        @XmlElementRef(name = "property_rate_summary", type = PropertyRateSummary.class)
    })
    protected List<Object> propertyCalendarOrPropertyAddressesOrPropertyAmenities;

    /**
     * Gets the value of the propertyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyDetails }
     *     
     */
    public PropertyDetails getPropertyDetails() {
        return propertyDetails;
    }

    /**
     * Sets the value of the propertyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDetails }
     *     
     */
    public void setPropertyDetails(PropertyDetails value) {
        this.propertyDetails = value;
    }

    /**
     * Gets the value of the propertyCalendarOrPropertyAddressesOrPropertyAmenities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyCalendarOrPropertyAddressesOrPropertyAmenities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyCalendarOrPropertyAddressesOrPropertyAmenities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyDescriptions }
     * {@link PropertyFlags }
     * {@link PropertyBathrooms }
     * {@link PropertyNearbyDetails }
     * {@link PropertyAttributes }
     * {@link PropertyAmenities }
     * {@link PropertyDefaultRates }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link PropertySpecial }
     * {@link PropertyCalendars }
     * {@link PropertyPhotos }
     * {@link PropertyBedrooms }
     * {@link PropertyThemes }
     * {@link PropertyAddresses }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link PropertyRates }
     * {@link PropertySeating }
     * {@link PropertyFees }
     * {@link PropertyCalendar }
     * {@link ReviewPhotos }
     * {@link PropertyRateSummary }
     * 
     * 
     */
    public List<Object> getPropertyCalendarOrPropertyAddressesOrPropertyAmenities() {
        if (propertyCalendarOrPropertyAddressesOrPropertyAmenities == null) {
            propertyCalendarOrPropertyAddressesOrPropertyAmenities = new ArrayList<Object>();
        }
        return this.propertyCalendarOrPropertyAddressesOrPropertyAmenities;
    }

}

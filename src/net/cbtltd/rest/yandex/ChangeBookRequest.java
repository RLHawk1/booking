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
    "packageDetailsOrTransportOrAccommodationOrRoundTripOrCruiseOrAdditionalProductsOrPaxDetailsOrPreferencesAndEssentials"
})
@XmlRootElement(name = "ChangeBookRequest")
public class ChangeBookRequest {

    @XmlElements({
        @XmlElement(name = "PackageDetails", type = PackageDetails.class),
        @XmlElement(name = "Transport", type = Transport.class),
        @XmlElement(name = "Accommodation", type = Accommodation.class),
        @XmlElement(name = "RoundTrip", type = RoundTrip.class),
        @XmlElement(name = "Cruise", type = Cruise.class),
        @XmlElement(name = "AdditionalProducts", type = AdditionalProducts.class),
        @XmlElement(name = "PaxDetails", type = PaxDetails.class),
        @XmlElement(name = "PreferencesAndEssentials", type = PreferencesAndEssentials.class)
    })
    protected List<Object> packageDetailsOrTransportOrAccommodationOrRoundTripOrCruiseOrAdditionalProductsOrPaxDetailsOrPreferencesAndEssentials;

    /**
     * Gets the value of the packageDetailsOrTransportOrAccommodationOrRoundTripOrCruiseOrAdditionalProductsOrPaxDetailsOrPreferencesAndEssentials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageDetailsOrTransportOrAccommodationOrRoundTripOrCruiseOrAdditionalProductsOrPaxDetailsOrPreferencesAndEssentials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageDetailsOrTransportOrAccommodationOrRoundTripOrCruiseOrAdditionalProductsOrPaxDetailsOrPreferencesAndEssentials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageDetails }
     * {@link Transport }
     * {@link Accommodation }
     * {@link RoundTrip }
     * {@link Cruise }
     * {@link AdditionalProducts }
     * {@link PaxDetails }
     * {@link PreferencesAndEssentials }
     * 
     * 
     */
    public List<Object> getPackageDetailsOrTransportOrAccommodationOrRoundTripOrCruiseOrAdditionalProductsOrPaxDetailsOrPreferencesAndEssentials() {
        if (packageDetailsOrTransportOrAccommodationOrRoundTripOrCruiseOrAdditionalProductsOrPaxDetailsOrPreferencesAndEssentials == null) {
            packageDetailsOrTransportOrAccommodationOrRoundTripOrCruiseOrAdditionalProductsOrPaxDetailsOrPreferencesAndEssentials = new ArrayList<Object>();
        }
        return this.packageDetailsOrTransportOrAccommodationOrRoundTripOrCruiseOrAdditionalProductsOrPaxDetailsOrPreferencesAndEssentials;
    }

}

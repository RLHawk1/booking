//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.03 at 03:35:11 PM IST 
//


package net.cbtltd.rest.flipkey.xmlfeed;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}calendar_export_url"/>
 *         &lt;element ref="{}rates_updated"/>
 *         &lt;element ref="{}last_booked_date"/>
 *         &lt;element ref="{}has_special"/>
 *         &lt;element ref="{}booking_count" minOccurs="0"/>
 *         &lt;element ref="{}photos_updated"/>
 *         &lt;element ref="{}is_tip"/>
 *         &lt;element ref="{}calendar_updated"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}alt_photo_test"/>
 *           &lt;element ref="{}alt_pdp_sprite_filename_v2"/>
 *         &lt;/sequence>
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
    "calendarExportUrl",
    "ratesUpdated",
    "lastBookedDate",
    "hasSpecial",
    "bookingCount",
    "photosUpdated",
    "isTip",
    "calendarUpdated",
    "altPhotoTest",
    "altPdpSpriteFilenameV2"
})
@XmlRootElement(name = "property_flags")
public class PropertyFlags {

    @XmlElement(name = "calendar_export_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String calendarExportUrl;
    @XmlElement(name = "rates_updated", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String ratesUpdated;
    @XmlElement(name = "last_booked_date", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lastBookedDate;
    @XmlElement(name = "has_special", required = true)
    protected String hasSpecial;
    @XmlElement(name = "booking_count")
    protected BookingCount bookingCount;
    @XmlElement(name = "photos_updated", required = true)
    protected String photosUpdated;
    @XmlElement(name = "is_tip", required = true)
    protected IsTip isTip;
    @XmlElement(name = "calendar_updated", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String calendarUpdated;
    @XmlElement(name = "alt_photo_test")
    protected AltPhotoTest altPhotoTest;
    @XmlElement(name = "alt_pdp_sprite_filename_v2")
    protected AltPdpSpriteFilenameV2 altPdpSpriteFilenameV2;

    /**
     * Gets the value of the calendarExportUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarExportUrl() {
        return calendarExportUrl;
    }

    /**
     * Sets the value of the calendarExportUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarExportUrl(String value) {
        this.calendarExportUrl = value;
    }

    /**
     * Gets the value of the ratesUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatesUpdated() {
        return ratesUpdated;
    }

    /**
     * Sets the value of the ratesUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatesUpdated(String value) {
        this.ratesUpdated = value;
    }

    /**
     * Gets the value of the lastBookedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBookedDate() {
        return lastBookedDate;
    }

    /**
     * Sets the value of the lastBookedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBookedDate(String value) {
        this.lastBookedDate = value;
    }

    /**
     * Gets the value of the hasSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasSpecial() {
        return hasSpecial;
    }

    /**
     * Sets the value of the hasSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasSpecial(String value) {
        this.hasSpecial = value;
    }

    /**
     * Gets the value of the bookingCount property.
     * 
     * @return
     *     possible object is
     *     {@link BookingCount }
     *     
     */
    public BookingCount getBookingCount() {
        return bookingCount;
    }

    /**
     * Sets the value of the bookingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingCount }
     *     
     */
    public void setBookingCount(BookingCount value) {
        this.bookingCount = value;
    }

    /**
     * Gets the value of the photosUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotosUpdated() {
        return photosUpdated;
    }

    /**
     * Sets the value of the photosUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotosUpdated(String value) {
        this.photosUpdated = value;
    }

    /**
     * Gets the value of the isTip property.
     * 
     * @return
     *     possible object is
     *     {@link IsTip }
     *     
     */
    public IsTip getIsTip() {
        return isTip;
    }

    /**
     * Sets the value of the isTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsTip }
     *     
     */
    public void setIsTip(IsTip value) {
        this.isTip = value;
    }

    /**
     * Gets the value of the calendarUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarUpdated() {
        return calendarUpdated;
    }

    /**
     * Sets the value of the calendarUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarUpdated(String value) {
        this.calendarUpdated = value;
    }

    /**
     * Gets the value of the altPhotoTest property.
     * 
     * @return
     *     possible object is
     *     {@link AltPhotoTest }
     *     
     */
    public AltPhotoTest getAltPhotoTest() {
        return altPhotoTest;
    }

    /**
     * Sets the value of the altPhotoTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltPhotoTest }
     *     
     */
    public void setAltPhotoTest(AltPhotoTest value) {
        this.altPhotoTest = value;
    }

    /**
     * Gets the value of the altPdpSpriteFilenameV2 property.
     * 
     * @return
     *     possible object is
     *     {@link AltPdpSpriteFilenameV2 }
     *     
     */
    public AltPdpSpriteFilenameV2 getAltPdpSpriteFilenameV2() {
        return altPdpSpriteFilenameV2;
    }

    /**
     * Sets the value of the altPdpSpriteFilenameV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltPdpSpriteFilenameV2 }
     *     
     */
    public void setAltPdpSpriteFilenameV2(AltPdpSpriteFilenameV2 value) {
        this.altPdpSpriteFilenameV2 = value;
    }

}
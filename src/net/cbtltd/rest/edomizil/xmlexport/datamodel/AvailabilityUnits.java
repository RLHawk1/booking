//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.20 at 06:53:05 PM IST 
//


package net.cbtltd.rest.edomizil.xmlexport.datamodel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="unit" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="availability_year" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="availability" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="year" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="start">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;pattern value="[ABCFHNOTV]{365,366}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="unitownerid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="internalunitid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="internalunitid2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="container" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "unit"
})
@XmlRootElement(name = "units")
public class AvailabilityUnits {

    @XmlElement(required = true)
    protected List<AvailabilityUnits.Unit> unit;

    /**
     * Gets the value of the unit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailabilityUnits.Unit }
     * 
     * 
     */
    public List<AvailabilityUnits.Unit> getUnit() {
        if (unit == null) {
            unit = new ArrayList<AvailabilityUnits.Unit>();
        }
        return this.unit;
    }


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
     *         &lt;element name="availability_year" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="availability" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="year" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                           &lt;attribute name="start">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;pattern value="[ABCFHNOTV]{365,366}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="unitownerid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="internalunitid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="internalunitid2" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="container" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "availabilityYear"
    })
    public static class Unit {

        @XmlElement(name = "availability_year")
        protected AvailabilityUnits.Unit.AvailabilityYear availabilityYear;
        @XmlAttribute(name = "unitownerid", required = true)
        protected String unitownerid;
        @XmlAttribute(name = "internalunitid", required = true)
        protected String internalunitid;
        @XmlAttribute(name = "internalunitid2")
        protected String internalunitid2;
        @XmlAttribute(name = "container", required = true)
        protected String container;

        /**
         * Gets the value of the availabilityYear property.
         * 
         * @return
         *     possible object is
         *     {@link AvailabilityUnits.Unit.AvailabilityYear }
         *     
         */
        public AvailabilityUnits.Unit.AvailabilityYear getAvailabilityYear() {
            return availabilityYear;
        }

        /**
         * Sets the value of the availabilityYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailabilityUnits.Unit.AvailabilityYear }
         *     
         */
        public void setAvailabilityYear(AvailabilityUnits.Unit.AvailabilityYear value) {
            this.availabilityYear = value;
        }

        /**
         * Gets the value of the unitownerid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitownerid() {
            return unitownerid;
        }

        /**
         * Sets the value of the unitownerid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitownerid(String value) {
            this.unitownerid = value;
        }

        /**
         * Gets the value of the internalunitid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalunitid() {
            return internalunitid;
        }

        /**
         * Sets the value of the internalunitid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalunitid(String value) {
            this.internalunitid = value;
        }

        /**
         * Gets the value of the internalunitid2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalunitid2() {
            return internalunitid2;
        }

        /**
         * Sets the value of the internalunitid2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalunitid2(String value) {
            this.internalunitid2 = value;
        }

        /**
         * Gets the value of the container property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContainer() {
            return container;
        }

        /**
         * Sets the value of the container property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContainer(String value) {
            this.container = value;
        }


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
         *         &lt;element name="availability" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="year" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                 &lt;attribute name="start">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;pattern value="[ABCFHNOTV]{365,366}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "availability"
        })
        public static class AvailabilityYear {

            protected List<AvailabilityUnits.Unit.AvailabilityYear.Availability> availability;

            /**
             * Gets the value of the availability property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the availability property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAvailability().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AvailabilityUnits.Unit.AvailabilityYear.Availability }
             * 
             * 
             */
            public List<AvailabilityUnits.Unit.AvailabilityYear.Availability> getAvailability() {
                if (availability == null) {
                    availability = new ArrayList<AvailabilityUnits.Unit.AvailabilityYear.Availability>();
                }
                return this.availability;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="year" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *       &lt;attribute name="start">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;pattern value="[ABCFHNOTV]{365,366}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Availability {

                @XmlAttribute(name = "year", required = true)
                protected String year;
                @XmlAttribute(name = "start")
                protected String start;

                /**
                 * Gets the value of the year property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public String getYear() {
                    return year;
                }

                /**
                 * Sets the value of the year property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setYear(String value) {
                    this.year = value;
                }

                /**
                 * Gets the value of the start property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStart() {
                    return start;
                }

                /**
                 * Sets the value of the start property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStart(String value) {
                    this.start = value;
                }

            }

        }

    }

}
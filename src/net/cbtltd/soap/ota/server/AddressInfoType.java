/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */

package net.cbtltd.soap.ota.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about an address that identifies a location for a specific purposes.
 * 
 * <p>Java class for AddressInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DefaultIndGroup"/>
 *       &lt;attribute name="UseType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoType")
@XmlSeeAlso({
    net.cbtltd.soap.ota.server.CustomerType.Address.class,
    net.cbtltd.soap.ota.server.CompanyInfoType.AddressInfo.class,
    net.cbtltd.soap.ota.server.AddressesType.Address.class,
    net.cbtltd.soap.ota.server.RequiredPaymentsType.GuaranteePayment.Address.class
})
public class AddressInfoType
    extends AddressType
{

    @XmlAttribute(name = "UseType")
    protected String useType;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "DefaultInd")
    protected Boolean defaultInd;

    /**
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseType(String value) {
        this.useType = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the defaultInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDefaultInd() {
        if (defaultInd == null) {
            return false;
        } else {
            return defaultInd;
        }
    }

    /**
     * Sets the value of the defaultInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultInd(Boolean value) {
        this.defaultInd = value;
    }

}
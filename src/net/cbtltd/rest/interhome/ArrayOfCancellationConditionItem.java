
package net.cbtltd.rest.interhome;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCancellationConditionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCancellationConditionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancellationConditionItem" type="{http://www.interhome.com/webservice}CancellationConditionItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCancellationConditionItem", propOrder = {
    "cancellationConditionItem"
})
public class ArrayOfCancellationConditionItem {

    @XmlElement(name = "CancellationConditionItem", nillable = true)
    protected List<CancellationConditionItem> cancellationConditionItem;

    /**
     * Gets the value of the cancellationConditionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancellationConditionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancellationConditionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationConditionItem }
     * 
     * 
     */
    public List<CancellationConditionItem> getCancellationConditionItem() {
        if (cancellationConditionItem == null) {
            cancellationConditionItem = new ArrayList<CancellationConditionItem>();
        }
        return this.cancellationConditionItem;
    }

}
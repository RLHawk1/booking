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
    "numberOfAdultsOrNumberOfChildrenOrNumberOfBabiesOrSearchPaxDescription"
})
@XmlRootElement(name = "SearchPaxDetails")
public class SearchPaxDetails {

    @XmlElements({
        @XmlElement(name = "NumberOfAdults", required = true, type = NumberOfAdults.class),
        @XmlElement(name = "NumberOfChildren", required = true, type = NumberOfChildren.class),
        @XmlElement(name = "NumberOfBabies", required = true, type = NumberOfBabies.class),
        @XmlElement(name = "SearchPaxDescription", required = true, type = SearchPaxDescription.class)
    })
    protected List<Object> numberOfAdultsOrNumberOfChildrenOrNumberOfBabiesOrSearchPaxDescription;

    /**
     * Gets the value of the numberOfAdultsOrNumberOfChildrenOrNumberOfBabiesOrSearchPaxDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfAdultsOrNumberOfChildrenOrNumberOfBabiesOrSearchPaxDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfAdultsOrNumberOfChildrenOrNumberOfBabiesOrSearchPaxDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfAdults }
     * {@link NumberOfChildren }
     * {@link NumberOfBabies }
     * {@link SearchPaxDescription }
     * 
     * 
     */
    public List<Object> getNumberOfAdultsOrNumberOfChildrenOrNumberOfBabiesOrSearchPaxDescription() {
        if (numberOfAdultsOrNumberOfChildrenOrNumberOfBabiesOrSearchPaxDescription == null) {
            numberOfAdultsOrNumberOfChildrenOrNumberOfBabiesOrSearchPaxDescription = new ArrayList<Object>();
        }
        return this.numberOfAdultsOrNumberOfChildrenOrNumberOfBabiesOrSearchPaxDescription;
    }

}

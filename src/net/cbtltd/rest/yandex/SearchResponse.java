//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 09:44:01 AM IST 
//


package net.cbtltd.rest.yandex;
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
    "searchRecap",
    "searchResults"
})
@XmlRootElement(name = "SearchResponse")
public class SearchResponse {

    @XmlElement(name = "SearchRecap", required = true)
    protected SearchRecap searchRecap;
    @XmlElement(name = "SearchResults", required = true)
    protected SearchResults searchResults;

    /**
     * Gets the value of the searchRecap property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRecap }
     *     
     */
    public SearchRecap getSearchRecap() {
        return searchRecap;
    }

    /**
     * Sets the value of the searchRecap property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRecap }
     *     
     */
    public void setSearchRecap(SearchRecap value) {
        this.searchRecap = value;
    }

    /**
     * Gets the value of the searchResults property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResults }
     *     
     */
    public SearchResults getSearchResults() {
        return searchResults;
    }

    /**
     * Sets the value of the searchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResults }
     *     
     */
    public void setSearchResults(SearchResults value) {
        this.searchResults = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.25 at 01:21:46 PM IST 
//


package net.cbtltd.rest.odalys.xmlfeed.ceto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="texte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}objet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="entete" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numero" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lg" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "titre",
    "texte",
    "objet"
})
@XmlRootElement(name = "paragraphe")
public class Paragraphe {

    protected String titre;
    protected String texte;
    protected List<Objet> objet;
    @XmlAttribute(name = "entete")
    protected String entete;
    @XmlAttribute(name = "numero")
    protected String numero;
    @XmlAttribute(name = "lg")
    protected String lg;

    /**
     * Gets the value of the titre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Sets the value of the titre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

    /**
     * Gets the value of the texte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Sets the value of the texte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexte(String value) {
        this.texte = value;
    }

    /**
     * Gets the value of the objet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objet }
     * 
     * 
     */
    public List<Objet> getObjet() {
        if (objet == null) {
            objet = new ArrayList<Objet>();
        }
        return this.objet;
    }

    /**
     * Gets the value of the entete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntete() {
        return entete;
    }

    /**
     * Sets the value of the entete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntete(String value) {
        this.entete = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the lg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLg() {
        return lg;
    }

    /**
     * Sets the value of the lg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLg(String value) {
        this.lg = value;
    }

}

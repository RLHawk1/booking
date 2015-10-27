/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import net.cbtltd.shared.api.HasXsl;

@XmlRootElement(name = "Property")
//@XmlType(propOrder={"property_id", "name", "address", "details", "suitability", "amenities", "photos", "rates"})
public class Property
implements HasXsl {
	@XmlAttribute (name = "property_id")
	private String Property_id;
	@XmlAttribute (name = "manager_id")
	private String Manager_id;
	@XmlAttribute (name = "last_update")
	private String lastUpdate = (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date());
	private String Name;
	private Address Address;
	private Details Details;
	private Descriptions Descriptions;
	private Suitability Suitability;
	private Amenities Amenities;
	private Photos Photos;
	private Rates Rates;
	private Fees Fees;
	private String xsl;
	
	public Property(){}
	
	public Property(String property_id){
		this.Property_id = property_id;
	}

	public Property(String property_id, String manager_id, String name, Address address,
			Details details, Descriptions descriptions, Suitability suitability, Amenities amenities,
			Photos photos, Rates rates, Fees fees, String xsl) {
		super();
		Property_id = property_id;
		Manager_id = manager_id;
		Name = name;
		Address = address;
		Details = details;
		Descriptions = descriptions;
		Suitability = suitability;
		Amenities = amenities;
		Photos = photos;
		Rates = rates;
		Fees = fees;
		this.xsl = xsl;
	}
	
	
	@XmlTransient
	public String getProperty_id() {
		return Property_id;
	}

	public void setProperty_id(String property_id) {
		this.Property_id = property_id;
	}

	@XmlTransient
	public String getManager_id() {
		return Manager_id;
	}

	public void setManager_id(String manager_id) {
		this.Manager_id = manager_id;
	}

	@XmlElement( name = "PropertyName" , required = true )
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	@XmlElement( name = "Address" , required = true )
	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		this.Address = address;
	}

	@XmlElement( name = "Details" , required = true )
	public Details getDetails() {
		return Details;
	}

	public void setDetails(Details details) {
		this.Details = details;
	}

	@XmlElement( name = "Descriptions" , required = true )
	public Descriptions getDescriptions() {
		return Descriptions;
	}

	public void setDescriptions(Descriptions descriptions) {
		this.Descriptions = descriptions;
	}

	@XmlElement( name = "Suitability" , required = true )
	public Suitability getSuitability() {
		return Suitability;
	}

	public void setSuitability(Suitability suitability) {
		this.Suitability = suitability;
	}

	@XmlElement( name = "Amenities" , required = true )
	public Amenities getAmenities() {
		return Amenities;
	}

	public void setAmenities(Amenities amenities) {
		this.Amenities = amenities;
	}

	@XmlElement( name = "Photos" , required = true )
	public Photos getPhotos() {
		return Photos;
	}

	public void setPhotos(Photos photos) {
		this.Photos = photos;
	}

	@XmlElement( name = "Rates" , required = true )
	public Rates getRates() {
		return Rates;
	}

	public void setRates(Rates rates) {
		this.Rates = rates;
	}

	@XmlElement( name = "Fees" , required = true )
	public Fees getFees() {
		return Fees;
	}

	public void setFees(Fees fees) {
		this.Fees = fees;
	}

	//---------------------------------------------------------------------------------
	// Implements HasXsl interface
	//---------------------------------------------------------------------------------
	public String getXsl() {
		return xsl;
	}

	public void setXsl(String xsl) {
		this.xsl = xsl;
	}
}

/**
 * @author	bookingnet
 * @
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

public class Details {
	public Integer MaximumOccupancy;
	public PropertyType PropertyType;
	public Bedrooms Bedrooms;
	public Bathrooms Bathrooms;
	public Integer MinimumStayLength;
	public String CheckIn;
	public String CheckOut;
	public String Currency;
	
	public Details(){}
	
	public Details(Integer maximumOccupancy,
			String propertyType, Integer bedrooms, Integer bathrooms,
			Integer minimumStayLength, String checkIn, String checkOut,
			String currency) {
		super();
		this.MaximumOccupancy = maximumOccupancy;
		this.PropertyType = new PropertyType(propertyType);
		this.Bedrooms = new Bedrooms(bedrooms);
		this.Bathrooms = new Bathrooms(bathrooms);
		this.MinimumStayLength = minimumStayLength;
		this.CheckIn = checkIn;
		this.CheckOut = checkOut;
		this.Currency = currency;
	}
}

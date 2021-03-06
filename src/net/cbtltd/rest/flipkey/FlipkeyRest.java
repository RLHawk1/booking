/**
 * @author	bookingnet
 * @
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import net.cbtltd.rest.AbstractProduct;
import net.cbtltd.rest.Attribute;
import net.cbtltd.rest.Constants;
import net.cbtltd.server.MonitorService;
import net.cbtltd.server.ProductService;
import net.cbtltd.server.RazorServer;
import net.cbtltd.server.RelationService;
import net.cbtltd.server.TextService;
import net.cbtltd.server.WebService;
import net.cbtltd.server.api.FeeMapper;
import net.cbtltd.server.api.ImageMapper;
import net.cbtltd.server.api.PartyMapper;
import net.cbtltd.server.api.PriceMapper;
import net.cbtltd.server.api.ProductMapper;
import net.cbtltd.server.api.ReservationMapper;
import net.cbtltd.server.api.TextMapper;
import net.cbtltd.shared.Currency;
import net.cbtltd.shared.Currencyrate;
import net.cbtltd.shared.Language;
import net.cbtltd.shared.Model;
import net.cbtltd.shared.NameId;
import net.cbtltd.shared.Party;
import net.cbtltd.shared.Product;
import net.cbtltd.shared.Relation;
import net.cbtltd.shared.Text;
import net.cbtltd.shared.Time;
import net.cbtltd.shared.api.HasUrls;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 * The Class FlipkeyRest.
 */
@Path("/flipkey")
@Produces("application/xml")
public class FlipkeyRest {

	private static final Logger LOG = Logger.getLogger(FlipkeyRest.class.getName());

	/**
	 * Gets the history list.
	 *
	 * @param xsl the optional XSL to transform this XML to HTML.
	 * @return the history list.
	 */
	@GET
	@Path("/history")
	public static synchronized HistoryList getHistoryList(
			@DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		Date timestamp = new Date();
		String message = "/flipkey/history?xsl=" + xsl;
		LOG.debug(message);
		SqlSession sqlSession = RazorServer.openSession();
		HistoryList result = null;
		try {
			String title = "Historical Email Report for FlipKey";
			String license = "This information may be used only by formal agreement.";
			result = new HistoryList(title, license, "Nox Rentals", new Date(), sqlSession.getMapper(ReservationMapper.class).flipkeyhistory(), xsl);
		} 
		catch (Throwable x) {
			LOG.error(x.getMessage()); 
			result = new HistoryList("Error", x.getMessage(), "Nox Rentals", new Date(), null, xsl);
		}
		finally {sqlSession.close();}
		LOG.debug(result);
		MonitorService.monitor(message, timestamp);
		return result;
	}
	
	
	@GET
	@Path("/testApi")
	public String getTestApi(){
			
		return "Test API";
	}

	/**
	 * Gets the properties name id list.
	 *
	 * @param xsl the optional XSL to transform this XML to HTML.
	 * @return the properties name id list.
	 */
	@GET
	@Path("/getproperties")
	public static synchronized Properties getNameIds(
			@DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		Date timestamp = new Date();
		String message = "/flipkey/getproperties?xsl=" + xsl;
		LOG.debug(message);
		SqlSession sqlSession = RazorServer.openSession();
		Properties result = null;
		try {result = new Properties(sqlSession.getMapper(ReservationMapper.class).flipkeyproperties(), xsl);} 
		catch (Throwable x) {LOG.error(x.getMessage());}
		finally {sqlSession.close();}
		LOG.debug(result);
		MonitorService.monitor(message, timestamp);
		return result;
	}

	/**
	 * Gets a property by its ID.
	 *
	 * @param id the ID of the property.
	 * @param xsl the optional XSL to transform this XML to HTML.
	 * @return the property.
	 */
	@GET
	@Path("/getproperty/{id}")
	public static synchronized Property getById(
			@PathParam("id") String id,
			@DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		Date timestamp = new Date();
		String message = "/flipkey/getproperty/" + id + "?xsl=" + xsl;
		LOG.debug(message);
		SqlSession sqlSession = RazorServer.openSession();
		Property result = null;
		try {
			Product product = sqlSession.getMapper(ProductMapper.class).read(id);
			if (product == null) {
			//if (product == null || !product.hasState(Constants.CREATED)) {
				throw new RuntimeException("The property id is invalid or does not exist");
			}
			//if (product == null ) {throw new RuntimeException("The property id is invalid or does not exist");}
			int bedrooms = product.getRoom();
			int maximumOccupancy = product.getPerson();
			int bathrooms = bedrooms;

			HashMap<String, ArrayList<String>> attributeMap = RelationService.readMap(sqlSession, Relation.PRODUCT_ATTRIBUTE, product.getId(), Attribute.ACCOMMODATION_SEARCH);
			System.out.println("product.getId() = " + product.getId());
			System.out.println("attributeMap size = " + attributeMap.size());
			
			//ArrayList<String> amenity = new ArrayList<String>();

			Pets Pets = null;
			Smoking Smoking = null;
			Children Children = null;
			HandicapAccessible HandicapAccessible = null;
			ElderlyAccessible ElderlyAccessible = null;
			
			if (attributeMap != null) {
				for (String key : attributeMap.keySet()) {
					for (String value :  attributeMap.get(key)) {
						System.out.println("attributeMap.get(" + key + ") = " + value);
//						if (!key.equalsIgnoreCase("Grading")
//								&& !key.equalsIgnoreCase("Accommodation Size")){
//							amenity.add(value);
//						}

						if (net.cbtltd.shared.Attribute.PET.equals(value)) {
							Pets = new Pets("yes");
						}
						if (net.cbtltd.shared.Attribute.SMO.equals(value)) {
							Smoking = new Smoking("yes");
						}
						if (net.cbtltd.shared.Attribute.FAM.equals(value)) {
							Children = new Children("yes");
						}
						if (net.cbtltd.shared.Attribute.PHY.equals(value)) {
							HandicapAccessible = new HandicapAccessible("yes");
						}
					}
				}
			}
			Suitability Suitability = null;
			if (	Pets != null && 
					Smoking != null && 
					Children != null && 
					HandicapAccessible != null) {
				Suitability = new Suitability(Pets, Smoking, Children, HandicapAccessible, ElderlyAccessible);
			}
			
			Amenities Amenities = null;
//			if (amenity.size() > 0) {
//				Amenities = new Amenities(amenity);
//			}
			
//			HashMap<String, ArrayList<String>> attributeMap = RelationService.readMap(sqlSession, Relation.PRODUCT_ATTRIBUTE, product.getId(), Attribute.ACCOMMODATION_SEARCH);
//			ArrayList<String> amenity = new ArrayList<String>();
//			for (String key : attributeMap.keySet()) {
//				ArrayList<String> values = new ArrayList<String>();
//				for (String value : attributeMap.get(key)) {values.add(getValueName(sqlSession, value));}
//				if (attributeMap.get(key).size() > 0) {amenity.add(getValueName(sqlSession, key));}
//			}
			String textid = NameId.Type.Product.name() + id + Text.Code.Public.name();
			String description = TextService.notes(sqlSession, textid, Language.EN);
			Descriptions Descriptions = new Descriptions(description);

			Location location = sqlSession.getMapper(ReservationMapper.class).flipkeylocation(product.getLocationid());
			String city = (location == null) ? "" : location.getName();
			String state = (location == null) ? "none" : location.getSubdivision();
			String country = (location == null) ? "" : location.getCountry();
			String countryname = (location == null) ? "" : location.getCountryname();
			String region = (location == null) ? "" : location.getSubdivisionname();
			String subregion = "";
			
			region = null;
			subregion = null;

			Party party = sqlSession.getMapper(PartyMapper.class).read(product.getOwnerid());
			if (party == null) {party = sqlSession.getMapper(PartyMapper.class).read(product.getSupplierid());}
			String address1 = product.getPhysicaladdress();
			String address2 = null;
			String zipCode = null;
			if (party != null && party.getPostaladdress() != null) {
				//String[] address = party.getPostaladdress().split("\\n", 2);
				//address1 = (address.length > 0)? address[0] : "";
				//address2 = (address.length > 1)? address[1] : "";
				zipCode = party.getPostalcode();
				if ("".equals(zipCode)) {
					zipCode = null;
				}
			}

			ArrayList<String> photosUrl = sqlSession.getMapper(ImageMapper.class).imageurlsbyproductid(new NameId(NameId.Type.Product.name(), product.getId()));
			System.out.println("PHOTOS from DB: " + photosUrl.size());
			ArrayList<Photo> photos = new ArrayList<Photo>();
			for (String url : photosUrl) {
				photos.add(new Photo(url));
			}
			Photos Photos = null;
			if (photos.size() > 0) {
				Photos = new Photos(photos);
			}
			
			Rates Rates = null;
			Collection<Rate> rateCol = getRates(sqlSession, product);
			if (rateCol != null && rateCol.size() > 0) {
				Rates = new Rates(getRates(sqlSession, product));
			}
			
			Fees Fees = null;
			Collection<Fee> feesCol = getFees(sqlSession, product);
			if (feesCol != null && feesCol.size() > 0) {
				Fees = new Fees(feesCol);
			}
			
			result = new Property(
					product.getId(),
					product.getSupplierid(),
					product.getName(),
					new Address(
							address1,					//Address1
							address2,					//Address2
							city,						//City
							state,						//State
							zipCode,					//ZipCode
							country,					//Country
							countryname,				//Country Name
							region,						//Region Name
							subregion,					//SubRegion
							product.getLatitude(),		//Latitude
							product.getLongitude()		//Longitude
					),
					new Details(
							maximumOccupancy, 			//Maximum Occupancy
							"condo",					//PropertyType
							bedrooms, 					//Bedrooms
							bathrooms,					//Bathrooms
							1,							//MinimuStayLength
							null,					    //CheckIn
							null,					    //CheckOut
							product.getCurrency()	    //Currency
					),
					Descriptions, //PropertyDescription (no HTML)
					Suitability,
					Amenities,
					Photos,
					Rates,
					Fees,
					xsl
			);
		} 
		catch (Throwable x) {
			x.printStackTrace();
			LOG.error(message + "\n" + x.getMessage()); 
		}
		finally {sqlSession.close();}
		LOG.debug(result);
		MonitorService.monitor(message, timestamp);
		return result;
	}

//	/**
//	 * Prepend to string list.
//	 *
//	 * @param text to prepend
//	 * @param items the items
//	 * @return string list with text prepended
//	 */
//	private static final ArrayList<String> prependToList(String text, ArrayList<String> items) {
//		if (items == null) {return null;}
//		ArrayList<String> result = new ArrayList<String>();
//		for (String item : items) {if (item != null) result.add(text + item);}
//		return result;
//	}

	/**
	 * Gets the current availability.
	 *
	 * @param xsl the optional XSL to transform this XML to HTML.
	 * @return the current availability.
	 */
	@GET
	@Path("/getavailability")
	public static synchronized Availability getAvailability(
			@DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		Date timestamp = new Date();
		String message = "/flipkey/getavailability?xsl=" + xsl;
		LOG.debug(message);
		SqlSession sqlSession = RazorServer.openSession();
		Availability result = null;
		try {
			ArrayList<ScheduleItem> items = sqlSession.getMapper(ReservationMapper.class).flipkeyavailability();
			Collection<BookedStays> stays = new ArrayList<BookedStays>();
			Collection<BookedStay> stay = null;
			String lastId = null;
			for (ScheduleItem item : items) {
				if (lastId == null || !item.getProperty_id().equals(lastId)) {
					stay = new ArrayList<BookedStay>();
					lastId = item.getProperty_id();
					stays.add(new BookedStays(lastId, stay));
				}
				stay.add(new BookedStay(Constants.formatDate(item.getArrivaldate()), Constants.formatDate(item.getDeparturedate())));
			}
			result = new Availability(stays, xsl);
		} 
		catch (Throwable x) {LOG.error(x);}
		finally {sqlSession.close();}
		LOG.debug(result);
		MonitorService.monitor(message, timestamp);
		return result;
	}

	/**
	 * Gets the availability by product ID.
	 *
	 * @param id the product ID.
	 * @param xsl the optional XSL to transform this XML to HTML.
	 * @return the availability of the product.
	 */
	@GET
	@Path("/getavailability/{id}")
	public static synchronized Availability getAvailabilityProduct(
			@PathParam("id") String id,
			@DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		System.out.println("1111111111111");
		Date timestamp = new Date();
		String message = "/flipkey/getavailability/id=" + id + "?xsl=" + xsl;
		LOG.debug(message);
		SqlSession sqlSession = RazorServer.openSession();
		Availability result = null;
		try {
			ArrayList<ScheduleItem> items = sqlSession.getMapper(ReservationMapper.class).flipkeyavailabilityproduct(id);
			Collection<BookedStays> stays = new ArrayList<BookedStays>();
			Collection<BookedStay> stay = new ArrayList<BookedStay>();
			stays.add(new BookedStays(id, stay));
			for (ScheduleItem item : items) {stay.add(new BookedStay(Constants.formatDate(item.getArrivaldate()), Constants.formatDate(item.getDeparturedate())));}
			result = new Availability(stays, xsl);
		}
		catch (Throwable x) {LOG.error(x.getMessage());}
		finally {sqlSession.close();}
		LOG.debug(result);
		MonitorService.monitor(message, timestamp);
		return result;
	}

	/**
	 * Gets the reservations which departed between the specified dates.
	 *
	 * @param fromdate the start date.
	 * @param todate the end date.
	 * @param xsl the optional XSL to transform this XML to HTML.
	 * @return the reservations which departed between the specified dates.
	 */
	@GET
	@Path("/getreservations/{fromdate}/{todate}")
	public static synchronized Reservations getReservations(
			@PathParam("fromdate") String fromdate,
			@PathParam("todate") String todate,
			@DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		Date timestamp = new Date();
		String message = "/flipkey/getreservations/" + fromdate + "/" + todate + "?xsl=" + xsl;
		LOG.debug(message);
		SqlSession sqlSession = RazorServer.openSession();
		Reservations result = null;
		try {
			ScheduleItem action = new ScheduleItem(Constants.parseDate(fromdate), Constants.parseDate(todate));
			ArrayList<ScheduleItem> items = sqlSession.getMapper(ReservationMapper.class).flipkeyreservation(action);
			Collection<Reservation> reservation = new ArrayList<Reservation>();
			for (ScheduleItem item : items) {reservation.add(new Reservation(item));}
			result = new Reservations(reservation, xsl);
		} 
		catch (Throwable x) {LOG.error(x.getMessage());}
		finally {sqlSession.close();}
		LOG.debug(result);
		MonitorService.monitor(message, timestamp);
		return result;
	}

	/**
	 * Gets the bad request.
	 *
	 * @return the bad request
	 */
	@GET
	@Path("/bad")
	public static synchronized Response getBadRequest() {
		return Response.status(Status.BAD_REQUEST).build();
	}
	
//	private static String getValueName(SqlSession sqlSession, String id) {
//		if (keyvalues == null) {keyvalues = sqlSession.getMapper(AttributeMapper.class).list();}
//		for (NameId keyvalue : keyvalues) {
//			if (keyvalue.hasId(id)) {return keyvalue.getName();}
//		}
//		return null;
//	}

	/*
	 * Checks for attribute.
	 *
	 * @param attributeMap the attribute map.
	 * @param key the attribute key.
	 * @param value the attribute value.
	 * @return yes if the attribute exists, else no.
	 */
	private static final String hasAttribute(HashMap<String, ArrayList<String>> attributeMap, String key, String value) {
		if (attributeMap == null || key == null || attributeMap.get(key) == null) {return "no";}
		for (String item : attributeMap.get(key)){if (item.equalsIgnoreCase(value)) {return "yes";}}
		return "no";
	}

	/**
	 * Gets the rates of the specified product.
	 *
	  * @param sqlSession the current SQL session.
	 * @param product the specified product.
	 * @return the rates.
	 */
	private static final Collection<Rate> getRates(SqlSession sqlSession, Product product) {
		Collection<Rate> rates = new ArrayList<Rate>();
		//Currencyrate currencyrate = new Currencyrate(product.getCurrency(), Currency.Code.USD.name(), Time.getDateStart());
		//currencyrate.setRate(WebService.getRate(sqlSession, currencyrate));
		//double exchangerate = currencyrate.getRate();

		net.cbtltd.shared.Price action = new net.cbtltd.shared.Price();
		action.setPartyid(product.getSupplierid());
		action.setEntitytype(NameId.Type.Product.name());
		action.setEntityid(product.getId());
		ArrayList<net.cbtltd.shared.Price> prices = sqlSession.getMapper(PriceMapper.class).restread(action);
		if (prices == null || prices.isEmpty()) {return null;}
		for (net.cbtltd.shared.Price price : prices){

			System.out.println("PRICE: " + price.getName() + ", " + price.getType() + ", " + price.getValue());

			Rate rate = new Rate();
			
			String name = price.getName();
			String type = price.getType();
			double value = price.getValue();
			if(NameId.Type.Reservation.name().equals(type)) {
				value = value*1.15;
				if("Price per day".equals(name)) {
					rate.setDailyMinRate(value);
				} else
				if("Price per weekend".equals(name)) {
					rate.setWeekendMinRate(value);
				} else
				if("Price per week".equals(name)) {
					rate.setWeeklyMinRate(value);
				} else
				if("Price per month".equals(name)) {
					rate.setMonthlyMinRate(value);
				} else {
					continue;
				}
				rates.add(rate);
			}
		}
		return rates;
	}
	
	private static final Collection<Fee> getFees(SqlSession sqlSession, Product product) {
		Collection<Fee> fees = new ArrayList<Fee>();
		
		net.cbtltd.shared.Fee feeParams = new net.cbtltd.shared.Fee();
		feeParams.setPartyId(product.getSupplierid());
		feeParams.setState(net.cbtltd.shared.Fee.CREATED);
		feeParams.setProductId(product.getId());
		
		ArrayList<net.cbtltd.shared.Fee> feeList = sqlSession.getMapper(FeeMapper.class).readbyproductandstate(feeParams);
		if (feeList == null || feeList.isEmpty()) {return null;}
		
		for (net.cbtltd.shared.Fee feeObject : feeList){

			System.out.println("FEE: " + feeObject.getName() + ", " + feeObject.getValue());
			Fee fee = new Fee(feeObject.getName(), feeObject.getValue()*1.15);
			fees.add(fee);
		}
		return fees;
	}
}

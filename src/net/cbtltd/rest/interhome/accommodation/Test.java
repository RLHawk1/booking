
package net.cbtltd.rest.interhome.accommodation;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import net.cbtltd.server.PartnerService;
import net.cbtltd.server.RazorServer;
import net.cbtltd.server.RelationService;
import net.cbtltd.server.TextService;
import net.cbtltd.server.api.CountryMapper;
import net.cbtltd.server.api.LocationMapper;
import net.cbtltd.server.api.ProductMapper;
import net.cbtltd.server.project.PartyIds;
import net.cbtltd.shared.Country;
import net.cbtltd.shared.Language;
import net.cbtltd.shared.Location;
import net.cbtltd.shared.Product;
import net.cbtltd.shared.Relation;
import net.cbtltd.shared.Text;
import net.cbtltd.shared.Unit;
import net.cbtltd.shared.api.HasUrls;

import org.apache.ibatis.session.SqlSession;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-08-09T13:20:11.648+02:00
 * Generated source version: 2.4.0
 * 
 */
public final class Test {

	private static HashMap<String,String> ATTRIBUTES = null;
	private static HashMap<String,String> DETAILS = null;
	private static HashMap<String,String> THEMES = null;
	private static HashMap<String,String> TYPES = null;

	private Test() {}


	public static void main(String args[]) throws Exception {
		SqlSession sqlSession = RazorServer.openSession();
		try {
			JAXBContext jc = JAXBContext.newInstance("net.cbtltd.rest.interhome.accommodation");
			Unmarshaller um = jc.createUnmarshaller();
			Accommodations accommodations = (Accommodations) um.unmarshal(new java.io.FileInputStream( "C:/accommodation.xml" ));

			int i = 0;
			for (Accommodation accommodation : accommodations.getAccommodation()) {
				System.out.println(i++ + " " + accommodation);
				Product product = PartnerService.getProduct(sqlSession, PartyIds.PARTY_INTERHOME_ID, accommodation.getCode());
				product.setBathroom(accommodation.getBathrooms() == null ? 2 : accommodation.getBathrooms().intValue());
				product.setRoom(accommodation.getBedrooms() == null ? 2 : accommodation.getBedrooms().intValue());
				Country country = sqlSession.getMapper(CountryMapper.class).read(accommodation.getCountry());
				
				Location location = new Location();
				location.setCountry(country.getId());
				location.setName(accommodation.getPlace());
				Location exists = sqlSession.getMapper(LocationMapper.class).name(location);
				if (exists == null) {sqlSession.getMapper(LocationMapper.class).create(location);}
				else {location = exists;}
				Geodata geodata = accommodation.getGeodata();
				if (geodata != null) {
					product.setLatitude(geodata.getLat().doubleValue());
					product.setLongitude(geodata.getLng().doubleValue());
					location.setLatitude(geodata.getLat().doubleValue());
					location.setLongitude(geodata.getLng().doubleValue());
					sqlSession.getMapper(LocationMapper.class).update(location);
				}

				product.setLocationid(location.getId());

				//				Distances distances = accommodation.getDistances();
				//				for (Distance distance : distances.getDistance()) {
				//					distance.getType();
				//					distance.getValue();
				//				}
				//accommodation.getFloor();
				product.setName(accommodation.getCode() + " " + accommodation.getName());
				product.setPerson(accommodation.getPax() == null ? 2 : accommodation.getPax().intValue());

				product.setRoom(accommodation.getRooms() == null ? 1 : accommodation.getRooms().intValue());
				product.setToilet(accommodation.getToilets() == null ? 2 : accommodation.getToilets().intValue());
				product.setWebaddress(accommodation.getUrl());

				product.setChild(0);
				product.setCommission(20.0);
				product.setCurrency(country.getCurrency());
				product.setDiscount(20.0);
				product.setInfant(0);
				product.setOrganizationid(PartyIds.PARTY_INTERHOME_ID);
				product.setOwnerid(PartyIds.PARTY_INTERHOME_ID);
				//TODO: product.setPartofid(partofid);
				product.setRank(0.0);
				product.setState(Product.CREATED);
				product.setSupplierid(PartyIds.PARTY_INTERHOME_ID);
				product.setType(Product.Type.Accommodation.name());
				product.setUnit(Unit.DAY);

				//accommodation.getBrand();
				//accommodation.getMaxrentalprice();
				//accommodation.getMinrentalprice();
				//accommodation.getSqm();
				//accommodation.getRegion();
				//accommodation.getZip();

				sqlSession.getMapper(ProductMapper.class).update(product);
				
				product.setPublicText(new Text(product.getPublicId(), product.getName(), Text.Type.HTML, new Date(), accommodation.getText(), Language.EN));
				TextService.update(sqlSession, product.getTexts());
				
				if (accommodation.getPictures() != null && accommodation.getPictures().getPicture() != null) {
					ArrayList<String> images = new ArrayList<String>();
					for (Picture picture : accommodation.getPictures().getPicture()) {
						images.add(picture.getUrl()); //TODO; upload to Razor Cloud or set relation
					}
					product.setImageurls(images);
				}
				
				ArrayList<String> attributes = new ArrayList<String>();
				addType(attributes, accommodation.getType());

				if (accommodation.getAttributes() != null && accommodation.getAttributes().getAttribute() != null) {
					for (String attribute : accommodation.getAttributes().getAttribute()) {
						addAttribute(attributes, attribute);
					}
				}

				if (accommodation.getDetails() != null) {
					addDetail(attributes, accommodation.getDetails());
				}

				addQuality(attributes, String.valueOf(accommodation.getQuality()));

				if (accommodation.getThemes() != null && accommodation.getThemes().getTheme() != null) {
					for (String theme : accommodation.getThemes().getTheme()) {
						addTheme(attributes, theme);
					}
				}
				RelationService.create(sqlSession, Relation.PRODUCT_ATTRIBUTE, product.getId(), attributes);
				//TODO: handle images
				sqlSession.commit();
				//System.out.println(product + "\n" + attributes);
			}
		} catch (Throwable x) {x.printStackTrace();}

		System.out.println("Finished...");
		System.exit(0);
	}

	/**
	 * Gets the product or creates it if it does not exist.
	 *
	 * @param sqlSession the current SQL session.
	 * @param altproductid the foreign ID
	 * @param organizationid the organizationid
	 * @return the product
	 */
//	private static Product getProduct(SqlSession sqlSession, String altproductid, String organizationid) {
//		Product product = sqlSession.getMapper(ProductMapper.class).altread(new NameId(HasUrls.PARTY_INTERHOME_ID, altproductid));
//		if (product == null) {
//			if (organizationid == null || organizationid.isEmpty()) {throw new ServiceException(Error.party_id, altproductid);}
//			product = new Product();
//			sqlSession.getMapper(ProductMapper.class).create(product);
//			product.setAltpartyid(HasUrls.PARTY_INTERHOME_ID);
//			product.setAltid(altproductid);
//			product.setState(Product.CREATED);
//			product.setOrganizationid(HasUrls.PARTY_INTERHOME_ID);
//			sqlSession.getMapper(ProductMapper.class).update(product);
//			RelationService.create(sqlSession, Relation.ORGANIZATION_PRODUCT, HasUrls.PARTY_INTERHOME_ID, product.getId());
//			RelationService.create(sqlSession, Relation.ORGANIZATION_PRODUCT, organizationid, product.getId());
//		}
//		return product;
//	}

	/**
	 * Creates the map of property types to OTA codes.
	 *
	 * [Detached: D, Townhouse: T, Apts: A]
	 * @param attributes the attributes
	 * @param type the type
	 */
	private static final void addType(ArrayList<String> attributes, String type) {
		if (TYPES == null) {
			TYPES = new HashMap<String, String>();
			TYPES.put("A","PCT3");
			TYPES.put("D","PCT16");
			TYPES.put("T","PCT8");
		}
		if (TYPES.get(type) != null) {attributes.add(TYPES.get(type));}
	}

	/**
	 * Creates the map of property detail to OTA codes.
	 *
	A : Apart- Hotel
	B : Bungalow
	C : Chalet
	D : Divers
	F : Farmhouse
	H : Holiday Village
	R : Residence
	S : Castle / Mansion
	V : Villa
	Y : Yacht
	 * @param attributes the attributes
	 * @param detail the type
	 */
	private static final void addDetail(ArrayList<String> attributes, String detail) {
		if (DETAILS == null) {
			DETAILS = new HashMap<String, String>();
			DETAILS.put("A","PCT3");
			DETAILS.put("B","PCT5");
			DETAILS.put("C","PCT7");
			DETAILS.put("D","RSP82");
			DETAILS.put("F","PCT15");
			DETAILS.put("H","PCT18");
			DETAILS.put("R","PCT16");
			DETAILS.put("S","PCT37");
			DETAILS.put("V","PCT35");
			DETAILS.put("Y","PCT53");
		}
		if (DETAILS.get(detail) != null) {attributes.add(DETAILS.get(detail));}
	}

	/**
	 * Creates the map of property quality to OTA codes.
	 *
0: not rated yet
1: basic
2: average
3: above average
4: top quality
5: luxurious
	 * @param attributes the attributes
	 * @param quality the type
	 */
	private static final void addQuality(ArrayList<String> attributes, String quality) {
		attributes.add("GRD" + quality);
	}

	/**
	*/
	
	private static final void addTheme(ArrayList<String> attributes, String detail) {
		if (THEMES == null) {
			THEMES = new HashMap<String, String>();
			THEMES.put("citytrips", "LOC3");
			THEMES.put("country", "LOC23");
			THEMES.put("lakes and mountains", "LOC7");
			THEMES.put("sun and beach", "RSN1");
			THEMES.put("ski / winter", "RSN6");
			THEMES.put("in a lakeside town", "LOC7");
			THEMES.put("villas with pool", "PCT35");
			THEMES.put("family", "GRP3");
			THEMES.put("nightlife", "ACC64");
			THEMES.put("somewherequiet", "RLT20");
			THEMES.put("special property", "SIZ32");
			THEMES.put("farmhouse", "ACC21");
		}
		if (THEMES.get(detail) != null) {attributes.add(THEMES.get(detail));}
	}
	/**
	 * Attributes
	 */
	private static final void addAttribute(ArrayList<String> attributes, String attribute) {

		if (ATTRIBUTES == null) {
			ATTRIBUTES = new HashMap<String, String>();
			ATTRIBUTES.put("bathandshower", "CBF3");
			ATTRIBUTES.put("bath", "CBF2");
			ATTRIBUTES.put("shower", "CBF18");
			ATTRIBUTES.put("nonsmoking", "GRI2");
			ATTRIBUTES.put("petsallowed", "PET7");
			ATTRIBUTES.put("hikingmountains", "RSP60");
			ATTRIBUTES.put("hikingplains", "RSP60");
			ATTRIBUTES.put("mountainbike", "RSP68");
			ATTRIBUTES.put("bikingplains", "RSP6");
			ATTRIBUTES.put("sailing", "RSP80");
			ATTRIBUTES.put("surfing", "RSP116");
			ATTRIBUTES.put("crosscountryski", "RSP88");
			ATTRIBUTES.put("icerink", "RST84 ");
			ATTRIBUTES.put("skiaera", "ACC45 ");
			ATTRIBUTES.put("snowboard", "RSP87 ");
			ATTRIBUTES.put("winterwalking", "RST113 ");
			ATTRIBUTES.put("golfing", "RSP27 ");
			ATTRIBUTES.put("riding", "RSP61 ");
			ATTRIBUTES.put("tennis", "RSP94 ");
			ATTRIBUTES.put("themepark", "RSN2 ");
			ATTRIBUTES.put("breakfast", "PCP4 ");
			ATTRIBUTES.put("elevator", "HAC33 ");
			ATTRIBUTES.put("garden", "RST134");
			ATTRIBUTES.put("solarium", "RST90");
			ATTRIBUTES.put("fitness", "RST21");
			ATTRIBUTES.put("massage", "REC22");
			ATTRIBUTES.put("whirlpool", "REC33 ");
			ATTRIBUTES.put("seaview", "ENV3 ");
			ATTRIBUTES.put("childrenplayground", "RSP74");
			ATTRIBUTES.put("airconditionning", "HAC5");
			ATTRIBUTES.put("balcony", "FAC2");
			ATTRIBUTES.put("terrace", "PMA7");
			ATTRIBUTES.put("bbq", "FAC3");
			ATTRIBUTES.put("babycot", "CBF6 ");
			ATTRIBUTES.put("dishwasher", "RMA32");
			ATTRIBUTES.put("fireplace", "RMA41 ");
			ATTRIBUTES.put("parking", "PHP8 ");
			ATTRIBUTES.put("parkingprivate", "PHP8 ");
			ATTRIBUTES.put("parkingcovered", "HAC53");
			ATTRIBUTES.put("sauna", "HAC79 ");
			ATTRIBUTES.put("pool", "HAC71 ");
			ATTRIBUTES.put("poolprivat", "HAC253 ");
			ATTRIBUTES.put("poolindor", "HAC54 ");
			ATTRIBUTES.put("poolheated", "HAC49 ");
			ATTRIBUTES.put("poolchildren", "RST129 ");
			ATTRIBUTES.put("tv", "RMP90 ");
			ATTRIBUTES.put("washingmachine", "RMA149 ");
			ATTRIBUTES.put("internet", "RMP54 ");
			ATTRIBUTES.put("isdn", "BUS14 ");
			ATTRIBUTES.put("wlan", "RMA123 ");
			ATTRIBUTES.put("cleaning", "USC3 ");
			ATTRIBUTES.put("dvdplayer", "RMA163 ");
			ATTRIBUTES.put("tabletennis", "RST117");
			ATTRIBUTES.put("microwave", "RMA68");
			ATTRIBUTES.put("oven", "RMA77");
			ATTRIBUTES.put("telephon", "RMA107");
		}
		if (ATTRIBUTES.get(attribute) != null) {attributes.add(ATTRIBUTES.get(attribute));}
	}
}

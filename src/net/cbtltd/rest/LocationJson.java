/**
 * @author	bookingnet
 * @
 * @version	3.0.10
 */
package net.cbtltd.rest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import net.cbtltd.rest.response.LocationsResponse;
import net.cbtltd.shared.License;

import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.Descriptions;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

/** The Class LocationRest implements REST services for customers, suppliers, employees, guests etc. */

@Path("/location")
@Produces(MediaType.APPLICATION_JSON)
public class LocationJson extends AbstractLocation {

	@GET
	@Path("/countries")
	@Descriptions({ 
	   @Description(value = "Lists country names and codes", target = DocTarget.METHOD),
	   @Description(value = "Country List", target = DocTarget.RETURN),
	   @Description(value = "Request", target = DocTarget.REQUEST),
	   @Description(value = "Response", target = DocTarget.RESPONSE),
	   @Description(value = "Resource", target = DocTarget.RESOURCE)
	})	
	public Countries getCountryNameIdsJSON(
			@Description("Optional XSLT") @DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		return getCountryNameIds(xsl);
	}
	
	@GET
	@Path("/list/{country}")
	@Descriptions({ 
	   @Description(value = "Lists location names and codes for specified country code", target = DocTarget.METHOD),
	   @Description(value = "Location List", target = DocTarget.RETURN),
	   @Description(value = "Request", target = DocTarget.REQUEST),
	   @Description(value = "Response", target = DocTarget.RESPONSE),
	   @Description(value = "Resource", target = DocTarget.RESOURCE)
	})
	public Items getLocationNameIdsByCountryJSON(
			@Description("Country Code") @PathParam("country") String country,
			@Description("Optional Number of Rows") @DefaultValue("1000") @QueryParam("rows") Integer rows,
			@Description("Optional XSLT") @DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		return getLocationNameIdsByCountry(country, rows, xsl);
	}
	
	@GET
	@Path("/subdivisions/{country}")
	@Descriptions({ 
	   @Description(value = "Lists region names and codes for specified country code", target = DocTarget.METHOD),
	   @Description(value = "Region List", target = DocTarget.RETURN),
	   @Description(value = "Request", target = DocTarget.REQUEST),
	   @Description(value = "Response", target = DocTarget.RESPONSE),
	   @Description(value = "Resource", target = DocTarget.RESOURCE)
	})
		public Subdivisions getSubdivisionNameIdsByCountryJSON(
			@Description("Country Code") @PathParam("country") String country,
			@Description("Optional Number of Rows") @DefaultValue("1000") @QueryParam("rows") Integer rows,
			@Description("Optional XSLT") @DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		return getSubdivisionNameIdsByCountry(country, rows, xsl);
	}
	
	@GET
	@Path("/list/{country}/{subdivision}")
	@Descriptions({ 
	   @Description(value = "Lists location names and codes for specified country and region codes", target = DocTarget.METHOD),
	   @Description(value = "Location List", target = DocTarget.RETURN),
	   @Description(value = "Request", target = DocTarget.REQUEST),
	   @Description(value = "Response", target = DocTarget.RESPONSE),
	   @Description(value = "Resource", target = DocTarget.RESOURCE)
	})
	public Items getLocationNameIdsBySubdivisionJSON(
			@Description("Country Code") @PathParam("country") String country,
			@Description("Region Code") @PathParam("subdivision") String subdivision,
			@Description("Optional Number of Rows") @DefaultValue("1000") @QueryParam("rows") Integer rows,
			@Description("Optional XSLT") @DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		return getLocationNameIdsBySubdivision(country, subdivision, rows, xsl);
	}
	
	@GET
	@Path("/units")
	@Descriptions({ 
	   @Description(value = "Lists allowed distance units of measure", target = DocTarget.METHOD),
	   @Description(value = "Distance Unit List", target = DocTarget.RETURN),
	   @Description(value = "Request", target = DocTarget.REQUEST),
	   @Description(value = "Response", target = DocTarget.RESPONSE),
	   @Description(value = "Resource", target = DocTarget.RESOURCE)
	})
	public Units getLocationUnitsJSON(
			@Description("Optional XSLT") @DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		return getLocationUnits(xsl);
	}
	
	@GET
	@Path("/list/{latitude}/{longitude}/{distance}/{unit}")
	@Descriptions({ 
	   @Description(value = "Lists locations near to a position", target = DocTarget.METHOD),
	   @Description(value = "Location List", target = DocTarget.RETURN),
	   @Description(value = "Request", target = DocTarget.REQUEST),
	   @Description(value = "Response", target = DocTarget.RESPONSE),
	   @Description(value = "Resource", target = DocTarget.RESOURCE)
	})
	public Items getNameIdsNearToJSON(
			@Description("Latitude of Position") @PathParam("latitude") Double latitude,
			@Description("Longitude of Position") @PathParam("longitude") Double longitude,
			@Description("Maximum Distance from Position") @DefaultValue("50") @PathParam("distance") Double distance,
			@Description("Distance Unit") @DefaultValue("KMT") @PathParam("unit") String unit,
			@Description("Optional XSLT") @DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		return getNameIdsNearTo(latitude, longitude, distance, unit, xsl);
	}
	
	@GET
	@Path("/list/{locationid}/{distance}/{unit}")
	@Descriptions({ 
	   @Description(value = "Lists locations near to another location", target = DocTarget.METHOD),
	   @Description(value = "Location List", target = DocTarget.RETURN),
	   @Description(value = "Request", target = DocTarget.REQUEST),
	   @Description(value = "Response", target = DocTarget.RESPONSE),
	   @Description(value = "Resource", target = DocTarget.RESOURCE)
	})
	public Items getNameIdsByLocationJSON(
			@Description("Location ID") @PathParam("locationid") String locationid,
			@Description("Maximum Distance from Location") @DefaultValue("50") @PathParam("distance") Double distance,
			@Description("Distance Unit") @DefaultValue("KMT") @PathParam("unit") String unit,
			@Description("Optional XSLT") @DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		return getNameIdsByLocation(locationid, distance, unit, xsl);
	}
	
	@GET
	@Path("/{locationid}")
	@Descriptions({ 
	   @Description(value = "Lists details of a location", target = DocTarget.METHOD),
	   @Description(value = "Location Details", target = DocTarget.RETURN),
	   @Description(value = "Request", target = DocTarget.REQUEST),
	   @Description(value = "Response", target = DocTarget.RESPONSE),
	   @Description(value = "Resource", target = DocTarget.RESOURCE)
	})
	public Location getByIdJSON(
			@Description("Location ID") @PathParam("locationid") String locationid,
			@Description("Optional XSLT") @DefaultValue(Constants.NO_XSL) @QueryParam("xsl") String xsl) {
		return getById(locationid, xsl);
	}

	
	@GET
	@Path("/getlocations")
	@Descriptions({ 
	   @Description(value = "Location list", target = DocTarget.METHOD),
	   @Description(value = "Location Details", target = DocTarget.RETURN),
	   @Description(value = "Request", target = DocTarget.REQUEST),
	   @Description(value = "Response", target = DocTarget.RESPONSE),
	   @Description(value = "Resource", target = DocTarget.RESOURCE)
	})
	public LocationsResponse getLabelByName(
			@Description("Term") @QueryParam("term") String name,
			@Description("Cahnnel partner") @QueryParam("pos") String pos, 
			@Description("Include sublocations") @QueryParam("include_sublocation") Boolean sublocation) {
		return getLabelIdByName(name, pos, sublocation);
	}
	
}

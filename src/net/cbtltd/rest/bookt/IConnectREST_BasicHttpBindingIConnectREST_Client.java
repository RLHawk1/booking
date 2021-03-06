
package net.cbtltd.rest.bookt;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2013-01-22T19:00:24.664+02:00
 * Generated source version: 2.4.0
 * 
 */
public final class IConnectREST_BasicHttpBindingIConnectREST_Client {

    private static final QName SERVICE_NAME = new QName("https://connect.bookt.com/svc", "ConnectREST");

    private IConnectREST_BasicHttpBindingIConnectREST_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ConnectREST.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ConnectREST ss = new ConnectREST(wsdlURL, SERVICE_NAME);
        IConnectREST port = ss.getBasicHttpBindingIConnectREST();  
        
        {
        System.out.println("Invoking createReview...");
        java.lang.String _createReview_apiKey = "";
        net.cbtltd.rest.bookt.Review _createReview_review = null;
        net.cbtltd.rest.bookt.Review _createReview__return = port.createReview(_createReview_apiKey, _createReview_review);
        System.out.println("createReview.result=" + _createReview__return);


        }
        {
        System.out.println("Invoking getReviews...");
        java.lang.String _getReviews_apiKey = "";
        java.lang.String _getReviews_id = "";
        java.lang.String _getReviews_reviewType = "";
        java.lang.Boolean _getReviews_useInternalID = null;
        net.cbtltd.rest.bookt.ArrayOfReview _getReviews__return = port.getReviews(_getReviews_apiKey, _getReviews_id, _getReviews_reviewType, _getReviews_useInternalID);
        System.out.println("getReviews.result=" + _getReviews__return);


        }
        {
        System.out.println("Invoking getReviewIDs...");
        java.lang.String _getReviewIDs_apiKey = "";
        java.lang.String _getReviewIDs_reviewType = "";
        javax.xml.datatype.XMLGregorianCalendar _getReviewIDs_lastMod = null;
        java.lang.Boolean _getReviewIDs_useInternalID = null;
        net.cbtltd.rest.bookt.ArrayOfstring _getReviewIDs__return = port.getReviewIDs(_getReviewIDs_apiKey, _getReviewIDs_reviewType, _getReviewIDs_lastMod, _getReviewIDs_useInternalID);
        System.out.println("getReviewIDs.result=" + _getReviewIDs__return);


        }
        {
        System.out.println("Invoking cancelBooking...");
        java.lang.String _cancelBooking_apiKey = "";
        java.lang.String _cancelBooking_bookingID = "";
        java.lang.Boolean _cancelBooking_useInternalID = null;
        java.math.BigDecimal _cancelBooking_refundAmount = new java.math.BigDecimal("0");
        java.lang.Integer _cancelBooking_options = null;
        net.cbtltd.rest.bookt.Booking _cancelBooking__return = port.cancelBooking(_cancelBooking_apiKey, _cancelBooking_bookingID, _cancelBooking_useInternalID, _cancelBooking_refundAmount, _cancelBooking_options);
        System.out.println("cancelBooking.result=" + _cancelBooking__return);


        }
        {
        System.out.println("Invoking getBusinessRules...");
        java.lang.String _getBusinessRules_apiKey = "";
        net.cbtltd.rest.bookt.ArrayOfKeyValueOfstringstring _getBusinessRules__return = port.getBusinessRules(_getBusinessRules_apiKey);
        System.out.println("getBusinessRules.result=" + _getBusinessRules__return);


        }
        {
        System.out.println("Invoking setAvailability...");
        java.lang.String _setAvailability_apiKey = "";
        java.lang.Integer _setAvailability_propertyID = null;
        net.cbtltd.rest.bookt.ArrayOfdateTime _setAvailability_effDates = null;
        net.cbtltd.rest.bookt.ArrayOfint _setAvailability_numAvailabile = null;
        port.setAvailability(_setAvailability_apiKey, _setAvailability_propertyID, _setAvailability_effDates, _setAvailability_numAvailabile);


        }
        {
        System.out.println("Invoking createEvent...");
        java.lang.String _createEvent_apiKey = "";
        net.cbtltd.rest.bookt.Event _createEvent_eventInfo = null;
        java.lang.Integer _createEvent_mode = null;
        net.cbtltd.rest.bookt.Event _createEvent__return = port.createEvent(_createEvent_apiKey, _createEvent_eventInfo, _createEvent_mode);
        System.out.println("createEvent.result=" + _createEvent__return);


        }
        {
        System.out.println("Invoking setRatesAndAvailability...");
        java.lang.String _setRatesAndAvailability_apiKey = "";
        java.lang.Integer _setRatesAndAvailability_propertyID = null;
        java.lang.String _setRatesAndAvailability_rateType = "";
        java.lang.Integer _setRatesAndAvailability_los = null;
        net.cbtltd.rest.bookt.ArrayOfdateTime _setRatesAndAvailability_effDates = null;
        net.cbtltd.rest.bookt.ArrayOfdecimal _setRatesAndAvailability_rates = null;
        java.lang.String _setRatesAndAvailability_currency = "";
        net.cbtltd.rest.bookt.ArrayOfint _setRatesAndAvailability_numAvailabile = null;
        port.setRatesAndAvailability(_setRatesAndAvailability_apiKey, _setRatesAndAvailability_propertyID, _setRatesAndAvailability_rateType, _setRatesAndAvailability_los, _setRatesAndAvailability_effDates, _setRatesAndAvailability_rates, _setRatesAndAvailability_currency, _setRatesAndAvailability_numAvailabile);


        }
        {
        System.out.println("Invoking getLead...");
        java.lang.String _getLead_apiKey = "";
        java.lang.String _getLead_id = "";
        java.lang.Boolean _getLead_useInternalID = null;
        net.cbtltd.rest.bookt.Person _getLead__return = port.getLead(_getLead_apiKey, _getLead_id, _getLead_useInternalID);
        System.out.println("getLead.result=" + _getLead__return);


        }
        {
        System.out.println("Invoking getRates...");
        java.lang.String _getRates_apiKey = "";
        java.lang.Integer _getRates_propertyID = null;
        java.lang.String _getRates_rateType = "";
        java.lang.Integer _getRates_los = null;
        javax.xml.datatype.XMLGregorianCalendar _getRates_startDate = null;
        javax.xml.datatype.XMLGregorianCalendar _getRates_endDate = null;
        java.lang.String _getRates_currency = "";
        net.cbtltd.rest.bookt.ArrayOfKeyValueOfdateTimedecimal _getRates__return = port.getRates(_getRates_apiKey, _getRates_propertyID, _getRates_rateType, _getRates_los, _getRates_startDate, _getRates_endDate, _getRates_currency);
        System.out.println("getRates.result=" + _getRates__return);


        }
        {
        System.out.println("Invoking getEvent...");
        java.lang.String _getEvent_apiKey = "";
        java.lang.String _getEvent_id = "";
        java.lang.Boolean _getEvent_useInternalID = null;
        net.cbtltd.rest.bookt.Event _getEvent__return = port.getEvent(_getEvent_apiKey, _getEvent_id, _getEvent_useInternalID);
        System.out.println("getEvent.result=" + _getEvent__return);


        }
        {
        System.out.println("Invoking getProperty...");
        java.lang.String _getProperty_apiKey = "";
        java.lang.String _getProperty_id = "";
        java.lang.String _getProperty_useInternalID = "";
        net.cbtltd.rest.bookt.Property _getProperty__return = port.getProperty(_getProperty_apiKey, _getProperty_id, _getProperty_useInternalID);
        System.out.println("getProperty.result=" + _getProperty__return);


        }
        {
        System.out.println("Invoking getPropertyIDs...");
        java.lang.String _getPropertyIDs_apiKey = "";
        java.lang.String _getPropertyIDs_lastMod = "";
        net.cbtltd.rest.bookt.ArrayOfint _getPropertyIDs__return = port.getPropertyIDs(_getPropertyIDs_apiKey, _getPropertyIDs_lastMod);
        System.out.println("getPropertyIDs.result=" + _getPropertyIDs__return);


        }
        {
        System.out.println("Invoking getAvailability...");
        java.lang.String _getAvailability_apiKey = "";
        java.lang.Integer _getAvailability_propertyID = null;
        java.lang.String _getAvailability_rateType = "";
        javax.xml.datatype.XMLGregorianCalendar _getAvailability_startDate = null;
        javax.xml.datatype.XMLGregorianCalendar _getAvailability_endDate = null;
        net.cbtltd.rest.bookt.ArrayOfKeyValueOfdateTimeint _getAvailability__return = port.getAvailability(_getAvailability_apiKey, _getAvailability_propertyID, _getAvailability_rateType, _getAvailability_startDate, _getAvailability_endDate);
        System.out.println("getAvailability.result=" + _getAvailability__return);


        }
        {
        System.out.println("Invoking getReview...");
        java.lang.String _getReview_apiKey = "";
        java.lang.String _getReview_id = "";
        java.lang.Boolean _getReview_useInternalID = null;
        net.cbtltd.rest.bookt.Review _getReview__return = port.getReview(_getReview_apiKey, _getReview_id, _getReview_useInternalID);
        System.out.println("getReview.result=" + _getReview__return);


        }
        {
        System.out.println("Invoking createLead...");
        java.lang.String _createLead_apiKey = "";
        net.cbtltd.rest.bookt.Person _createLead_lead = null;
        java.lang.Integer _createLead_mode = null;
        net.cbtltd.rest.bookt.Person _createLead__return = port.createLead(_createLead_apiKey, _createLead_lead, _createLead_mode);
        System.out.println("createLead.result=" + _createLead__return);


        }
        {
        System.out.println("Invoking getBooking...");
        java.lang.String _getBooking_apiKey = "";
        java.lang.String _getBooking_bookingID = "";
        java.lang.Boolean _getBooking_useInternalID = null;
        net.cbtltd.rest.bookt.Booking _getBooking__return = port.getBooking(_getBooking_apiKey, _getBooking_bookingID, _getBooking_useInternalID);
        System.out.println("getBooking.result=" + _getBooking__return);


        }
        {
        System.out.println("Invoking setRates...");
        java.lang.String _setRates_apiKey = "";
        java.lang.Integer _setRates_propertyID = null;
        java.lang.String _setRates_rateType = "";
        java.lang.Integer _setRates_los = null;
        net.cbtltd.rest.bookt.ArrayOfdateTime _setRates_effDates = null;
        net.cbtltd.rest.bookt.ArrayOfdecimal _setRates_rates = null;
        java.lang.String _setRates_currency = "";
        port.setRates(_setRates_apiKey, _setRates_propertyID, _setRates_rateType, _setRates_los, _setRates_effDates, _setRates_rates, _setRates_currency);


        }
        {
        System.out.println("Invoking modifyBooking...");
        java.lang.String _modifyBooking_apiKey = "";
        net.cbtltd.rest.bookt.Booking _modifyBooking_booking = null;
        java.lang.Boolean _modifyBooking_infoOnly = null;
        net.cbtltd.rest.bookt.Booking _modifyBooking__return = port.modifyBooking(_modifyBooking_apiKey, _modifyBooking_booking, _modifyBooking_infoOnly);
        System.out.println("modifyBooking.result=" + _modifyBooking__return);


        }
        {
        System.out.println("Invoking deleteReview...");
        java.lang.String _deleteReview_apiKey = "";
        java.lang.String _deleteReview_id = "";
        java.lang.Boolean _deleteReview_useInternalID = null;
        java.lang.String _deleteReview__return = port.deleteReview(_deleteReview_apiKey, _deleteReview_id, _deleteReview_useInternalID);
        System.out.println("deleteReview.result=" + _deleteReview__return);


        }
        {
        System.out.println("Invoking getPropertyCategories...");
        java.lang.String _getPropertyCategories_apiKey = "";
        net.cbtltd.rest.bookt.ArrayOfstring _getPropertyCategories__return = port.getPropertyCategories(_getPropertyCategories_apiKey);
        System.out.println("getPropertyCategories.result=" + _getPropertyCategories__return);


        }
        {
        System.out.println("Invoking getEventCategories...");
        java.lang.String _getEventCategories_apiKey = "";
        net.cbtltd.rest.bookt.ArrayOfstring _getEventCategories__return = port.getEventCategories(_getEventCategories_apiKey);
        System.out.println("getEventCategories.result=" + _getEventCategories__return);


        }
        {
        System.out.println("Invoking makeBooking...");
        java.lang.String _makeBooking_apiKey = "";
        net.cbtltd.rest.bookt.Booking _makeBooking_booking = null;
        java.lang.Boolean _makeBooking_infoOnly = null;
        net.cbtltd.rest.bookt.Booking _makeBooking__return = port.makeBooking(_makeBooking_apiKey, _makeBooking_booking, _makeBooking_infoOnly);
        System.out.println("makeBooking.result=" + _makeBooking__return);


        }
        {
        System.out.println("Invoking getPropertyIDsByCategory...");
        java.lang.String _getPropertyIDsByCategory_apiKey = "";
        java.lang.String _getPropertyIDsByCategory_propertyCategory = "";
        net.cbtltd.rest.bookt.ArrayOfint _getPropertyIDsByCategory__return = port.getPropertyIDsByCategory(_getPropertyIDsByCategory_apiKey, _getPropertyIDsByCategory_propertyCategory);
        System.out.println("getPropertyIDsByCategory.result=" + _getPropertyIDsByCategory__return);


        }

        System.exit(0);
    }

}

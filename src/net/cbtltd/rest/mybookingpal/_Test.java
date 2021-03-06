
package net.cbtltd.rest.mybookingpal;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import net.cbtltd.rest.AbstractProduct;
import net.cbtltd.server.AttributeService;
import net.cbtltd.server.RazorServer;
import net.cbtltd.server.ServiceException;
import net.cbtltd.server.TextService;
import net.cbtltd.server.UploadFileService;
import net.cbtltd.server.api.PartnerMapper;
import net.cbtltd.server.api.ProductMapper;
import net.cbtltd.server.script.Handleable;
import net.cbtltd.shared.Error;
import net.cbtltd.shared.Language;
import net.cbtltd.shared.Model;
import net.cbtltd.shared.Partner;
import net.cbtltd.shared.Product;
import net.cbtltd.shared.Reservation;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.bookingnet.feed.service.ReservationFeedGenerator;
import com.thoughtworks.xstream.XStream;


import net.cbtltd.shared.finance.gateway.CreditCard;
import net.cbtltd.shared.finance.gateway.CreditCardType;


/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-08-09T13:20:11.648+02:00
 * Generated source version: 2.4.0
 * 
 */
public final class _Test implements Handleable {

	private static AttributeService d;
	private String altpartyid;
	
	public	_Test(String altpartyid)
	{
		this.altpartyid = altpartyid;
	}
	
	public _Test() {}
	
	private static final Logger LOG = Logger.getLogger(_Test.class.getName());

	/**
	 * The main test method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String args[]) throws Exception {
		
		
	
	//	System.out.println(TextService.translatez("House: Deze",Language.NL,Language.EN));;
	
	//	System.out.println(CreditCardType.VISA.name().split("").length);
	//	System.out.println(CreditCardType.VISA.name());
		
		LOG.error("XML writer Started");
		SqlSession sqlSession = RazorServer.openSession();
		try {
			
		
			
			//if(true)return; 
			String altpartyid = "90640"; 
//			String altpartyid = "205124"; //NextPax partner Production
			String reservationid = "4937617"; //NextPax reservation
			
		
			
			Partner partner = sqlSession.getMapper(PartnerMapper.class).exists(altpartyid);
			if (partner == null) {throw new ServiceException(Error.party_id, altpartyid);}
			A_Handler handler = new A_Handler(partner);
		
			
			///////////////////final -set to be ran/////////////////////////////////////
	    	
		//	handler.wrietActiveLocations(); 

		//	ReservationFeedGenerator reservationfeedgenerator = null ;
		//	reservationfeedgenerator = reservationfeedgenerator.getInstance();
		//	reservationfeedgenerator.getWeeklyPrices( "834a55a7680c79fe" , "34559", "EUR" , sqlSession );
			
		//	if(true){System.out.println("Program Done!!!!");return;}
			
			
			//////////////////////////////////////////////////
			 handler.writeDetailInformation("315122");
			  // handler.writePricePerWeeklyRate("315122");
			   handler.writeAvailableSchedule("330293");
		/////////////////////////////////////////////////////////
			   
			   
		//	handler.writeDetailInformation("330293");
			
		//	handler.writeAvailableSchedule("330293");
			
			
			//handler.writeCountryNamesAndCode(); 
			
	     //	handler.writePricePerWeeklyRate("315122");//GOOD 
			
		
			
			//handler.readSchedule();  //done. 
			
		
		
			
			//handler.writeAvailableSchedule("315122");
			
			//handler.writeDetailInformation("315122"); //this one. 
		////////////////////////////////////////////////////////////////////////////////////////////
			
		//	handler.writeAvailableSchedule();
			
			
		//	handler.writePriceList();      //Done 
			//handler.wrietActiveLocations(); Done
		
			/////////////////////////////////////////////////////////////////////////////////
			//handler.writeSummaryInformation();
			
		//////////RAN///////////////////////////////
		//  handler.readSchedule();
		//	handler.writeAttributes();
		//  handler.writeReviews();
		//  handler.writePriceList(); 
	   //      handler.writeListOrganizations(); 
		// handler.writePropertyList();
	    // 	handler.writeDetailInformation();
		//	handler.writeSummaryInformation();
		////////////////////////////////////////////
			// handler.readRatings();//does not work. 
			
			
			
			
			
			//handler.readImages(); 
	
			
			//schedule and images.
		//	handler.writeScheduleUsingAPI();// To much data. Do not understand what is happeing. 
		//	
		//	handler.readschedule2();
			//
	  
		//	 //  
		    //  // NEED TO TEST 
		//	// 
	
		//;//  NEED TO TEST
			//handler.readImages();
		//	handler.writePropertyList();
			//handler.writeProductValues();
		  //          //works. 
		   
			//handler.writeImagesFromAPI(); //work on next. s 
		//	handler.readImages();
		//	handler.writeProductRegularImageURLs(); 
		//	
			//
			//handler.readAttributes();
	     	//handler.readImages(); 
			
			//handler.readImages();
			//handler.readProducts();
		//	handler.readPrices();
		} 
		catch (Throwable x) {
			//sqlSession.rollback(); want to have a record of a missed transaction. 
			x.printStackTrace();
			LOG.error(x.getMessage());
		} 
//		finally {sqlSession.close();}
		LOG.error("bookingnet Terminated not an error. ");
		System.exit(0);
	}

	private A_Handler getHandler() {
		SqlSession sqlSession = RazorServer.openSession();
		//String altpartyid = "179769";
		Partner partner = sqlSession.getMapper(PartnerMapper.class).exists(altpartyid);
		if (partner == null) {throw new ServiceException(Error.party_id, altpartyid);}
		A_Handler handler = new A_Handler(partner);
		return handler;
	}
	
	private A_Handler setHandler(String altpartyid) {
		SqlSession sqlSession = RazorServer.openSession();
		//String altpartyid = "179769";
		Partner partner = sqlSession.getMapper(PartnerMapper.class).exists(altpartyid);
		if (partner == null) {throw new ServiceException(Error.party_id, altpartyid);}
		A_Handler handler = new A_Handler(partner);
		return handler;
	}
	
	
	public void readProductReviews(){
		
	}
	@Override
	public void readProducts() {
		getHandler().readProducts();
	}

	@Override
	public void readPrices() {
		getHandler().readPrices();
	}

	@Override
	public void readSchedules() {
		getHandler().readSchedule();
	}

	@Override
	public void readAlerts() {
		getHandler().readAlerts();
	}


	
	@Override
	public void readSpecials() {
		getHandler().readSpecials();
	}
	
	@Override
	public void readLocations() {
		throw new ServiceException(Error.service_absent, "Nextpax readLocations()");
	}

	@Override
	public void readDescriptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readImages() {
		// TODO Auto-generated method stub
		
	}
}

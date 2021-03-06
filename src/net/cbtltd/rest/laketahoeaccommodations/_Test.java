package net.cbtltd.rest.laketahoeaccommodations;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import net.cbtltd.rest.Items;
import net.cbtltd.rest.laketahoeaccommodations.A_Handler;
import net.cbtltd.rest.payment.ReservationPrice;
import net.cbtltd.server.PartnerService;
import net.cbtltd.server.PartyService;
import net.cbtltd.server.RazorServer;
import net.cbtltd.server.ServiceException;
import net.cbtltd.server.api.PartnerMapper;
import net.cbtltd.server.api.PartyMapper;
import net.cbtltd.server.api.ProductMapper;
import net.cbtltd.server.script.Handleable;
import net.cbtltd.shared.Error;
import net.cbtltd.shared.Model;
import net.cbtltd.shared.Partner;
import net.cbtltd.shared.Party;
import net.cbtltd.shared.Product;
import net.cbtltd.shared.Reservation;
import net.cbtltd.shared.finance.gateway.CreditCard;
import net.cbtltd.shared.finance.gateway.CreditCardType;

import org.apache.derby.impl.sql.compile.GetCurrentConnectionNode;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;


/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-08-09T13:20:11.648+02:00
 * Generated source version: 2.4.0
 * 
 */
public final class _Test implements Handleable {

	public static String altpartyid;
	
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
		try {
			//String reservationid = ""; // To be created...
			_Test t = new _Test();
			A_Handler handler = t.getHandler();
			
			handler.readProducts();
			
			//	handler.readDescriptions();
			//handler.readPrices();
		//	handler.readSchedule(); 
//			handler.readProducts();
//			handler.readDescriptions();
//			handler.readSchedule();
//			handler.readPrices();
//			handler.readImages();

		} catch (Throwable x) {
			x.printStackTrace();
		} finally {
			System.exit(0);
		}
	
	}

	private A_Handler getHandler() {
		SqlSession sqlSession = RazorServer.openSession();
//		String altpartyid = "189790";
		altpartyid = sqlSession.getMapper(PartnerMapper.class).partyIDFromEmail("api@laketahoeaccommodations.com");
		System.out.println(altpartyid);
		Partner partner = sqlSession.getMapper(PartnerMapper.class).exists(altpartyid);
		if (partner == null) {throw new ServiceException(Error.party_id, altpartyid);}
		A_Handler handler = new A_Handler(partner);
		return handler;
	}
	
	private A_Handler setHandler(String altpartyid) {
		SqlSession sqlSession = RazorServer.openSession();
		Partner partner = sqlSession.getMapper(PartnerMapper.class).exists(altpartyid);
		if (partner == null) {throw new ServiceException(Error.party_id, altpartyid);}
		A_Handler handler = new A_Handler(partner);
		return handler;
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
		throw new ServiceException(Error.service_absent, "Lake Tahoe Accomodations readLocations()");
	}

	@Override
	public void readDescriptions() {
		getHandler().readDescriptions();
		
	}

	@Override
	public void readImages() {
		getHandler().readImages();
		
	}
}

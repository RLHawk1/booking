/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.reservation;

import java.util.Date;

public class AvailableWidget
extends Available {
	
	public AvailableWidget() {}
	
	public AvailableWidget(String productid, Date fromdate, Date todate) {
		setProductid(productid);
		setFromdate(fromdate);
		setTodate(todate);
	}

}
/**
 * @author	bookingnet
 * @
 * @version	4.0.0
 */
package net.cbtltd.shared.rate;

import net.cbtltd.shared.Rate;
import net.cbtltd.shared.api.HasTableService;

public class RateNoteTable extends Rate 
implements HasTableService {

	private String orderby;
	private int startrow;
	private int numrows;
	
	public RateNoteTable() {}

	public RateNoteTable(
			String productid, 
			String orderby,
			int startrow,
			int numrows) {
		this.productid = productid;
		this.orderby = orderby;
		this.startrow = startrow;
		this.numrows = numrows;
	}

	public String getOrderby() {
		return orderby;
	}

	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}

	public boolean noOrderby() {
		return orderby == null || orderby.isEmpty();
	}
	
	public int getStartrow() {
		return startrow;
	}

	public void setStartrow(int startrow) {
		this.startrow = startrow;
	}

	public int getNumrows() {
		return numrows;
	}

	public void setNumrows(int numrows) {
		this.numrows = numrows;
	}
}

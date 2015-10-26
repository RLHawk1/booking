package net.cbtltd.shared.finance.gateway;

/**
 * Who hold the funds enum.
 */
public enum FundsHolderEnum {
	
	External(0), 	/* Another payment gateway selected (PayPal, Authorize .NET) or PMS support credit card processing */
	bookingnet(1); 	/* bookingnet selected to process payments */

	private Integer value;
	
	FundsHolderEnum(Integer value) {
		this.value = value;
	}
	
	public Integer value() {return this.value;}
	public static FundsHolderEnum getByInt(Integer value) {
		switch(value) {
		case 0 : return External;
		case 1 : return bookingnet;
		default : return null;
		}
	}
	
}

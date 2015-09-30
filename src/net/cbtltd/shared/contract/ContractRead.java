/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.contract;

import net.cbtltd.shared.Contract;

public class ContractRead extends Contract {

	public ContractRead(){}
	
	public ContractRead(String name, String organizationid, String partyid) {
		super(name, organizationid, partyid);
	}

}

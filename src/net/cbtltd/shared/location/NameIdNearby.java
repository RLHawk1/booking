/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.location;

import net.cbtltd.shared.Area;
import net.cbtltd.shared.Service;
import net.cbtltd.shared.api.HasService;

public class NameIdNearby
extends Area
implements HasService {
	
	public NameIdNearby() {}
	
	public Service service() {return Service.LOCATION;}	

}

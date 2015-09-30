/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.api;

public interface HasPosition {
	void setLocationid(String locationid);
	String getLocationid();
	boolean hasLocationid();
	boolean hasLatLng();
}

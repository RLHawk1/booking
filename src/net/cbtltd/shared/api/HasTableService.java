/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.api;

public interface HasTableService
extends HasTable, HasService {
	String getId();
	void setId(String id);
}

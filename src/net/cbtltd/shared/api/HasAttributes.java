/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.api;

import java.util.ArrayList;
import java.util.HashMap;

public interface HasAttributes {
	HashMap<String, ArrayList<String>> getAttributemap();
	void setAttributemap(HashMap<String, ArrayList<String>> attributes);
	boolean noAttributemap();
	boolean hasAttributemap();
}

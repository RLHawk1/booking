/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.api;

import java.util.ArrayList;

public interface HasImages {
	void setImageurls(ArrayList<String> images);
	ArrayList<String> getImageurls();
}

/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	3.0.8
 */
package net.cbtltd.rest.kigo;

import java.util.Arrays;

public class PropertyTypeRS extends Response {

	private PropertyType[] API_REPLY;

	PropertyTypeRS () {}	//no args constructor
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropertyTypeRS [API_REPLY=");
		builder.append(Arrays.toString(API_REPLY));
		builder.append("]");
		return builder.toString();
	}
}
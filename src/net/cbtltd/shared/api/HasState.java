/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared.api;

public interface HasState {
//	String INITIAL = "Initial";
//	String FINAL = "Final";
	void setState(String state);
	String getState();	
}
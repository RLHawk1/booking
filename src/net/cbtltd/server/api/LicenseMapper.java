/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.server.api;

import java.util.ArrayList;

import net.cbtltd.shared.License;
import net.cbtltd.shared.license.LicenseTable;

public interface LicenseMapper
extends AbstractMapper<License> {
	void delete(String id);
	License exists(License action);
	Integer count(LicenseTable action);
	ArrayList<License> list(LicenseTable action);
}
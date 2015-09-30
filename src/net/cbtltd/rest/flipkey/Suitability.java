/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

public class Suitability {
	public String Pets;
	public String Smoking;
	public String HandicapAccessible;
	public String ElderlyAccessible;
	
	public Suitability(){}
	
	public Suitability(String pets, String smoking, String handicapAccessible, String elderlyAccessible) {
		super();
		this.Pets = pets;
		this.Smoking = smoking;
		this.HandicapAccessible = handicapAccessible;
		this.ElderlyAccessible = elderlyAccessible;
	}
}

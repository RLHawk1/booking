/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

public class Suitability {
	public Pets Pets;
	public Smoking Smoking;
	public Children Children;
	public HandicapAccessible HandicapAccessible;
	public ElderlyAccessible ElderlyAccessible;
	
	public Suitability(){}
	
	public Suitability(Pets pets, Smoking smoking, Children children, HandicapAccessible handicapAccessible, ElderlyAccessible elderlyAccessible) {
		super();
		this.Pets = pets;
		this.Smoking = smoking;
		this.Children = children;
		this.HandicapAccessible = handicapAccessible;
		this.ElderlyAccessible = elderlyAccessible;
	}
}

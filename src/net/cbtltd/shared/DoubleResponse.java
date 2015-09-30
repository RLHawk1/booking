/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.shared;

public class DoubleResponse
extends AbstractResponse {

	protected Double value;
	
	public Double getValue() {
		return value == null ? 0.0 : value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public boolean noValue() {
		return value == null;
	}
	
	public boolean hasValue() {
		return !noValue();
	}
}

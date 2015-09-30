/**
 * @author	Chris Marshall
 * @see		License at http://razor-cloud.com/razor/License.html
 * @version	4.0.0
 */
package net.cbtltd.client.field.table;

import net.cbtltd.shared.api.HasTableService;

public interface TableExecutor<T extends HasTableService> {
	void execute(T action);
}

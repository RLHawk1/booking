/**
 * @author	bookingnet
 * @
 * @version	4.0.0
 */
package net.cbtltd.server.api;

import net.cbtltd.shared.Currencyrate;

public interface CurrencyrateMapper
extends AbstractMapper<Currencyrate> {
	Currencyrate readbyexample(Currencyrate currencyrate);
}

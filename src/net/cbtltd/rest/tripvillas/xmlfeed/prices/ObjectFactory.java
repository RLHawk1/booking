//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.07 at 11:32:17 AM IST 
//


package net.cbtltd.rest.tripvillas.xmlfeed.prices;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.cbtltd.rest.tripvillas.xmlfeed.prices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.cbtltd.rest.tripvillas.xmlfeed.prices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Prices }
     * 
     */
    public Prices createPrices() {
        return new Prices();
    }

    /**
     * Create an instance of {@link Prices.Price }
     * 
     */
    public Prices.Price createPricesPrice() {
        return new Prices.Price();
    }

    /**
     * Create an instance of {@link Prices.Price.Rooms }
     * 
     */
    public Prices.Price.Rooms createPricesPriceRooms() {
        return new Prices.Price.Rooms();
    }

    /**
     * Create an instance of {@link Prices.Price.Rooms.Room }
     * 
     */
    public Prices.Price.Rooms.Room createPricesPriceRoomsRoom() {
        return new Prices.Price.Rooms.Room();
    }

    /**
     * Create an instance of {@link Prices.Price.Rooms.Room.SpecialRates }
     * 
     */
    public Prices.Price.Rooms.Room.SpecialRates createPricesPriceRoomsRoomSpecialRates() {
        return new Prices.Price.Rooms.Room.SpecialRates();
    }

    /**
     * Create an instance of {@link Prices.Price.Rooms.Room.SpecialRates.SpecialRate }
     * 
     */
    public Prices.Price.Rooms.Room.SpecialRates.SpecialRate createPricesPriceRoomsRoomSpecialRatesSpecialRate() {
        return new Prices.Price.Rooms.Room.SpecialRates.SpecialRate();
    }

}

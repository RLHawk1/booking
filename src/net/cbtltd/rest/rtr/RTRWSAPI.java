
/*
 * 
 */

package net.cbtltd.rest.rtr;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2012-07-01T12:13:31.675+02:00
 * Generated source version: 2.4.0
 * 
 */


@WebServiceClient(name = "RTRWSAPI", 
                  wsdlLocation = "file:/C:/wsdl/rtr.wsdl",
                  targetNamespace = "http://realtimerental.com/webservice") 
public class RTRWSAPI extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://realtimerental.com/webservice", "RTRWSAPI");
    public final static QName RTRWSAPISoap12 = new QName("http://realtimerental.com/webservice", "RTRWSAPISoap12");
    public final static QName RTRWSAPISoap = new QName("http://realtimerental.com/webservice", "RTRWSAPISoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/wsdl/rtr.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RTRWSAPI.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/wsdl/rtr.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RTRWSAPI(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RTRWSAPI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RTRWSAPI() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns RTRWSAPISoap
     */
    @WebEndpoint(name = "RTRWSAPISoap12")
    public RTRWSAPISoap getRTRWSAPISoap12() {
        return super.getPort(RTRWSAPISoap12, RTRWSAPISoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RTRWSAPISoap
     */
    @WebEndpoint(name = "RTRWSAPISoap12")
    public RTRWSAPISoap getRTRWSAPISoap12(WebServiceFeature... features) {
        return super.getPort(RTRWSAPISoap12, RTRWSAPISoap.class, features);
    }
    /**
     * 
     * @return
     *     returns RTRWSAPISoap
     */
    @WebEndpoint(name = "RTRWSAPISoap")
    public RTRWSAPISoap getRTRWSAPISoap() {
        return super.getPort(RTRWSAPISoap, RTRWSAPISoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RTRWSAPISoap
     */
    @WebEndpoint(name = "RTRWSAPISoap")
    public RTRWSAPISoap getRTRWSAPISoap(WebServiceFeature... features) {
        return super.getPort(RTRWSAPISoap, RTRWSAPISoap.class, features);
    }

}
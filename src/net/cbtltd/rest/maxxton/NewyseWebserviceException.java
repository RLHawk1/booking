
package net.cbtltd.rest.maxxton;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.0
 * 2014-12-01T12:16:43.215+01:00
 * Generated source version: 2.4.0
 * 
 */

@WebFault(name = "NewyseWebserviceError", targetNamespace = "http://service.newyse.ws.services.newyse.maxxton/")
public class NewyseWebserviceException extends Exception {
    public static final long serialVersionUID = 20141201121643L;
    
    private net.cbtltd.rest.maxxton.NewyseWebserviceError newyseWebserviceError;

    public NewyseWebserviceException() {
        super();
    }
    
    public NewyseWebserviceException(String message) {
        super(message);
    }
    
    public NewyseWebserviceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NewyseWebserviceException(String message, net.cbtltd.rest.maxxton.NewyseWebserviceError newyseWebserviceError) {
        super(message);
        this.newyseWebserviceError = newyseWebserviceError;
    }

    public NewyseWebserviceException(String message, net.cbtltd.rest.maxxton.NewyseWebserviceError newyseWebserviceError, Throwable cause) {
        super(message, cause);
        this.newyseWebserviceError = newyseWebserviceError;
    }

    public net.cbtltd.rest.maxxton.NewyseWebserviceError getFaultInfo() {
        return this.newyseWebserviceError;
    }
}

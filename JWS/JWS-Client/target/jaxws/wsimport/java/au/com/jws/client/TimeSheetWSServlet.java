
package au.com.jws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TimeSheetWSServlet", targetNamespace = "http://timesheet.jws.au/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeSheetWSServlet {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getTimeSheet(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

}
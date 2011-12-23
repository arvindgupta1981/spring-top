package au.com.jws.client;

import au.com.jws.timesheet.tools.artifect.PNSCustomerFaultMessage;
import au.com.jws.timesheet.tools.artifect.PNSCustomerRequest;
import au.com.jws.timesheet.tools.artifect.PNSCustomerResponse;
import au.com.jws.timesheet.tools.artifect.PnsCustomerService_Service;



public class TimeSheetClient {

	public static void main(String... g) throws PNSCustomerFaultMessage {
		
		PNSCustomerRequest pnsReq=new PNSCustomerRequest();
		PNSCustomerResponse pnsRes=	new PnsCustomerService_Service().getPnsCustomerServiceSOAP().pnsCustomer(pnsReq);
		System.out.println(pnsRes.toString());
	}
	
}

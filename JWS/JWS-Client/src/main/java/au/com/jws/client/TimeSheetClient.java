package au.com.jws.client;

import au.com.jws.timesheet.tools.artifect.TimeSheetWSServletService;


public class TimeSheetClient {
	
	public static void main(String...g){
		//WebServiceClient client=TimeSheetWSServletService.class.getAnnotation(WebServiceClient.class);
		System.out.println(new TimeSheetWSServletService().getTimeSheetWSServletPort().getTimeSheet(1));
	}
}

package au.com.jws.client;

import au.com.jws.timesheet.tools.artifect.TimeSheetWSServiceService;


public class TimeSheetClient {

	public static void main(String... g) {
		System.out.println(new TimeSheetWSServiceService().getTimeSheetWSServicePort().getTimeSheet("1"));
	}
	
}

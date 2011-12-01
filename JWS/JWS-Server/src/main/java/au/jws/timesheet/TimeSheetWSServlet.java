package au.jws.timesheet;



import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class TimeSheetWSServlet  {
	
	public String getTimeSheet(int personId) {
		return "Hello List";
	}
	
}

package au.jws.timesheet;



import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class TimeSheetWSServlet  {
	
	public List<String> getTimeSheet(int personId) {
		List<String> list=new ArrayList<String>();
		list.add("Arvind");
		list.add("Gupta");
		return list;
	}	
}

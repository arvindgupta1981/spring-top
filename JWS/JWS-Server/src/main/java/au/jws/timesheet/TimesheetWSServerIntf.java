package au.jws.timesheet;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace="http://arvind.com",name="timesheet")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface TimesheetWSServerIntf {
	@WebMethod
	public List<String> getTimeSheet(int personId);
}

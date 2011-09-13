package au.com.avr.junit.tests;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import au.com.arv.junit.dao.employee.EmployeeDAO;
import au.com.arv.junit.pojo.employee.Employee;
import au.com.arv.junit.services.employee.EmployeeService;
import au.com.arv.junit.services.employee.EmployeeServiceImpl;

public class EmployeeServiceTest {
	EmployeeService employeeService;
	EmployeeDAO employeeDAO;
	@BeforeClass
	public static void construct(){
		System.out.println("construct");
	}
	public EmployeeServiceTest() {
		System.out.println("constructor");
	}
	
	@Before
	public void setUp(){
		System.out.println("setup");
		employeeService=new EmployeeServiceImpl();
		employeeDAO=EasyMock.createMock(EmployeeDAO.class);
		employeeService.setEmployeeDAO(employeeDAO);
	}
	
	@Test	
	public void testAdd(){
		System.out.println("test");
		try {
			Employee employee = new Employee();
			
			EasyMock.expect(employeeService.add(employee)).andReturn(true);
			EasyMock.replay(employeeDAO);
			Assert.assertEquals(true, employeeService.add(employee));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void cleanUp(){
		System.out.println("cleanup");
	}
	
	@AfterClass
	public static void destroy(){
		System.out.println("destroy");
	}

}

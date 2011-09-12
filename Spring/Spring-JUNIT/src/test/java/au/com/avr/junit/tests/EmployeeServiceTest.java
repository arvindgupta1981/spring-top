package au.com.avr.junit.tests;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeServiceTest {
	
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
	}
	
	@Test	
	public void testAdd(){
		System.out.println("test");
		Assert.assertEquals(5, 5);
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

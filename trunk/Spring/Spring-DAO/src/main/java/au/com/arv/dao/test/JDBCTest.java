package au.com.arv.dao.test;

import au.com.arv.configuration.MyBeansUtility;

public class JDBCTest {
	public static void main(String...k){
		MyBeansUtility.getInstance().getBean("userDAO");
	}
}

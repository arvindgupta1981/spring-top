package au.com.avr.junit.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection con=null;
	private DBConnection(){}
	public Connection getConnection(){
		if(con==null){
			try {
				Class.forName(ConnectionParameters.dbClass);
				Connection con=DriverManager.getConnection(ConnectionParameters.dbUrl);
				return con;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return con;
	}
	private interface ConnectionParameters{
		String dbUrl = "jdbc:mysql://localhost:3306/junittest";
		String dbClass = "com.mysql.jdbc.Driver";
	}	
}

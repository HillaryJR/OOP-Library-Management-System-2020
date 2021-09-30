package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	//create database connection
	//we create the methods static thats why we make these variablles stsaatic as well
	private static String 	url = "jdbc:mysql://localhost:3306/payment";
	private static String userName = "root";
	private static String password = "M@ng@th@9093";
	private static Connection con; 
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
			
		}catch(Exception e) {
			System.out.println("Database connection is not succesful!!!");
		}
		
		return con;
	}
	
}

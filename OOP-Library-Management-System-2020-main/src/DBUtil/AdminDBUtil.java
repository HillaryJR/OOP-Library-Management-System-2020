package DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBUtil.DBConnect;
import model.Admin;

public class AdminDBUtil {

	//Database connection form DBConnect
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	//Mehtod to insert a new admin to the data base
	public static boolean insertAdmin(String fname,String lname,String mobile,String email,String address,
			String username,String password,String filename , String path) {
		boolean isSuccess = false;
		
		
		
		try {
			//creating the connection with the database
			con = DBConnect.getConnection();
			//Insert query
			stmt = con.createStatement();
			
			String sql = "Insert into admin values( 0,'"+fname+"','"+lname+"','"+mobile+"','"+email+"','"+address+"','"+username+"','"+password+"','"+filename+"','"+path+"')";
			
			int rs = stmt.executeUpdate(sql);
			//if rs > 0 assign true to isSuccess boolean value
			if(rs > 0) {
				isSuccess = true;
			}else {
				//if rs < 0 assign false to isSuccess boolean value
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		//return isSucces value to AdminInsertServlet
		return isSuccess;
	}
	
	//method to validata the admin details when logging in
	public static boolean validate (String username, String password)
	{
		//creaitng boolean type variable and intilaizing it to false
		boolean isSuccess = false ;
		
		try
		{
		
			//creating the connection
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			//querry
			String sql = "select * from admin where username ='"+username+"' and password ='"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			//if rs > 0 assign true to isSuccess boolean value
			if(rs.next()) 
			{
				 isSuccess = true;
			}
			
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		//returning the voolean value
		return isSuccess;
	}
	
	
	//Method to retrive all rows and display from the book table in database
		//Return type list of the admin with all data
	public static List<Admin> getAdminDetails(String username)
	{
		
		//creatting an array list type object of admin
		ArrayList<Admin> admin = new ArrayList<>();
		
		try {
			//creating connection with the database
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			//query
			String sql = "select * from admin where username='"+username+"'";
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				//Assigning all retrieved values to the respective variables . if the next boolean value is true
				
				int id=rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String mobile = rs.getString(4);
				String email = rs.getString(5);
				String address = rs.getString(6);	
				String username1 = rs.getString(7);
				String password = rs.getString(8);
				String filename = rs.getString(9);
				String path = rs.getString(10);
		
				//crrating an obect of admin and pass all values to the constructor in the book class
				
				Admin a = new Admin(id,fname,lname,mobile,email,address,username1,password,filename);
				//passing admin object to the array list object
				admin.add(a);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		//Returning the customer array list object
		return admin;
	}
	
	
	//Method to update the admin data. This return a boolean value weather the data has been updated to the databse or not	

public static boolean updateAdmin(String id,String fname,String lname,String mobile,String email,String address,
		String username,String password,String filename , String path) {
		
		try {
			
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//Querry
			String sql = "update book set fname = '"+fname+"',lname = '"+lname+"',mobile = '"+mobile+"',email = '"+email+"',address = '"+address+"',username = '"+username+"',password = '"+password+"',filename = '"+filename+"',path = '"+path+"'"
					+ "where username = '"+username+"'";

			
			int rs = stmt.executeUpdate(sql);
			//if result set value is greater than zero data has been updated
			
			if( rs > 0 ) {
				isSuccess =  true;
			}//if result set value is less than zero data has not been updated
			else {
				isSuccess =  false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//return the boolean value
		return isSuccess;
	}




	
}

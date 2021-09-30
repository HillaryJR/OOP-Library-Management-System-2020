package DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBUtil.DBConnect;
import model.User;


public class UserDBUtil {
	//Database connection form DBConnect
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
	
	//Mehtod to insert a new book to the data base
	
	public static boolean insertUser(String fname,String lname,String mobile,String email,String address,
			String username,String password,String filename , String path) {
		boolean isSuccess = false;
		
		
		
		try {
			//creating the connection with the database
			
			con = DBConnect.getConnection();
			
			stmt = con.createStatement();
			//Insert query
			String sql = "Insert into customer values( 0,'"+fname+"','"+lname+"','"+mobile+"','"+email+"','"+address+"','"+username+"','"+password+"','"+filename+"','"+path+"')";
			//if rs > 0 assign true to isSuccess boolean value
			
			int rs = stmt.executeUpdate(sql);
			 
			if(rs > 0) {
				isSuccess = true;
			}else {
				//if rs < 0 assign false to isSuccess boolean value
				
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		//if rs < 0 assign false to isSuccess boolean value
		
		return isSuccess;
	}
	
	
	//Method to retrive all rows and display from the user tabe in database
		//Return type list of the book with all data
public static List<User> getUserList(){

	//creatting an array list type object of book
	
		ArrayList<User> user = new ArrayList<>();
		
		
		try {
			//creating connection with the database
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			//query
			String sql = "select * from customer";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//Assigning all retrieved values to the respective variables . if the next boolean value is true
				
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String mobile = rs.getString(4);
				String email = rs.getString(5);
				String address = rs.getString(6);
				String username = rs.getString(7);
				String password = rs.getString(8);
				String filename = rs.getString(9);

				//crrating an obect of user and pass all values to the constructor in the book class
				
				User u = new User(id,fname,lname,mobile,email,address,username,password,filename);
				//passing user object to the array list object
				
				user.add(u);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Returning the user array list object
		return user;
		
	}
	
	
	

}

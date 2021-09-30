package DBUtil;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBUtil.DBConnect;
import model.Staff;

public class StaffDBUtil {
	
	
	//Database connection form DBConnect
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	

	
	public static boolean insertStaff(String fname,String lname,String mobile,String email,String address,
			String role,String filename , String path) { 
		boolean isSuccess = false;
		
		
		
		try {

			con = DBConnect.getConnection();
			
			stmt = con.createStatement();
			//Insert query
			String sql = "Insert into staff values( 0,'"+fname+"','"+lname+"','"+mobile+"','"+email+"','"+address+"','"+role+"','"+filename+"','"+path+"')";
			
			int rs = stmt.executeUpdate(sql);
			 
			if(rs > 0) {
				//if rs > 0 assign true to isSuccess boolean value
				isSuccess = true;
			}else {
				//if rs < 0 assign false to isSuccess boolean value
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		//return isSucces value to BookInsertServlet
		return isSuccess;
	}
	
	
	
	
	
	public static List<Staff> getStaffList(){

		//creatting an array list type object of book
		ArrayList<Staff> staff = new ArrayList<>();
		
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//query
			String sql = "select * from staff";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//Assigning all retrieved values to the respective variables . if the next boolean value is true
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String mobile = rs.getString(4);
				String email = rs.getString(5);
				String address = rs.getString(6);
				String role = rs.getString(7);
				String filename = rs.getString(8);


				//creating an obect of book and pass all values to the constructor in the book class
				Staff s = new Staff(id,fname,lname,mobile,email,address,role,filename);
				
				//passing book object to the array list object
				staff.add(s);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Returning the customer array list object
		return staff;
		
	}
	
	
	
	
public static boolean updateStaff(String id,String fname,String lname,String mobile,String email,String address,String role,String filename , String path) {
		
		try {
			
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//Querry
			String sql = "update staff set fname = '"+fname+"',lname = '"+lname+"',mobile = '"+mobile+"',email = '"+email+"',address = '"+address+"',role = '"+role+"',filename = '"+filename+"',path = '"+path+"'"
					+ "where id = '"+id+"'";

			
			int rs = stmt.executeUpdate(sql);
			
			if( rs > 0 ) {
				isSuccess =  true;
			}
			else {
				isSuccess =  false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}


	
	
	
public static boolean deleteStaff(String id) {
	
	int convID = Integer.parseInt(id);
	
	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "delete from staff where id = '"+convID+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}

	
}

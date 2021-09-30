package DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBUtil.DBConnect;
import model.Periodical;


public class PeriodicalDBUtil {

	//Database connection form DBConnect
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//Mehtod to insert a new periodical to the data base
	public static boolean insertPeriodical(String type,String name,String publication,String edition,String price,
			String year,String filename , String path) {
		boolean isSuccess = false;
		
		
		
		try {
			//creating the connection with the database
			con = DBConnect.getConnection();
			
			stmt = con.createStatement();
			//Insert query
			String sql = "Insert into periodical values( 0,'"+type+"','"+name+"','"+publication+"','"+edition+"','"+price+"','"+year+"','"+filename+"','"+path+"')";
			//if rs > 0 assign true to isSuccess boolean value
			
			int rs = stmt.executeUpdate(sql);
			 
			if(rs > 0) {
				isSuccess = true;
			}else {//if rs < 0 assign false to isSuccess boolean value
				
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		//return isSucces value to PeriodicalInsertServlet
		return isSuccess;
	}
	
	
	//Method to retrive all rows and display from the periodical tabe in database
		//Return type list of the book with all data
public static List<Periodical> getPeriodicalList(){

	//creatting an array list type object of book
		ArrayList<Periodical> periodical = new ArrayList<>();
		
		
		try {//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//query
			String sql = "select * from periodical";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//Assigning all retrieved values to the respective variables . if the next boolean value is true
				
				int id = rs.getInt(1);
				String type = rs.getString(2);
				String name = rs.getString(3);
				String publication = rs.getString(4);
				String edition = rs.getString(5);
				String price = rs.getString(6);
				String year = rs.getString(7);
				String filename = rs.getString(8);

				//crrating an obect of book and pass all values to the constructor in the book class
				
				Periodical p = new Periodical(id,type,name,publication,edition,price,year,filename);
				//passing book object to the array list object
				
				periodical.add(p);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Returning the customer array list object
		return periodical;
		
	}
	

   

//Method to update the book data. This return a boolean value weather the data has been updated to the databse or not	

public static boolean updatePeriodical(String id,String type,String name,String publication,String edition,String price,String year,String filename , String path) {
	
	try {
		//creating connection with the database
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		//Querry
String sql = "update periodical set type = '"+type+"',name = '"+name+"',publication = '"+publication+"',edition = '"+edition+"',price= '"+price+"',year = '"+year+"',filename = '"+filename+"',path = '"+path+"'"
				+ "where id = '"+id+"'";

		int rs = stmt.executeUpdate(sql);
		//if result set value is greater than zero data has been updated
		
		if( rs > 0 ) {
			isSuccess =  true;
		}
		else {//if result set value is less than zero data has not been updated
			
			isSuccess =  false;
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	//return the boolean value
	return isSuccess;
}




//Method to delete a specific data from the table using the passed id

public static boolean deletePeriodical(String id) {
	
	int convID = Integer.parseInt(id);
	
	try {//creating the connection
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		//query
		String sql = "delete from periodical where id = '"+convID+"'";
		int rs = stmt.executeUpdate(sql);
		//if result set value is greater than zero data has been deleted
		
		if(rs > 0) {
			isSuccess = true;
		}else {
			//if result set value is less than zero data has not been deleted
			isSuccess = false;
		}
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	//returning the boolean value
	return isSuccess;
}


	
}

package DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBUtil.DBConnect;
import model.News;

public class NewsDBUtil {
	//Database connection form DBConnect
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	//Mehtod to insert a new news to the data base
	public static boolean insertNews(String topic,String description,String date ,String filename , String path) {
		boolean isSuccess = false;

		
		try {
			//creating the connection with the database
			con = DBConnect.getConnection();
			
			stmt = con.createStatement();
			//Insert query
			String sql = "Insert into news values( 0,'"+topic+"','"+description+"','"+date+"','"+filename+"','"+path+"')";
			
			int rs = stmt.executeUpdate(sql);
			//if rs > 0 assign true to isSuccess boolean value
			if(rs > 0) {
				isSuccess = true;
			}else {
				//if rs > 0 assign true to isSuccess boolean value
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		//return isSucces value to NewsInsertServlet
		return isSuccess;
	}
	
	
	
	

	
	//Method to retrive all rows and display from the book tabe in database
		//Return type list of the news with all data
	public static List<News> getNewsList(){

		//creatting an array list type object of book
		ArrayList<News> news = new ArrayList<>();
		
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//query
			String sql = "select * from news";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//Assigning all retrieved values to the respective variables . if the next boolean value is true
				
				int id = rs.getInt(1);
				String topic = rs.getString(2);
				String description = rs.getString(3);
				String date = rs.getString(4);
				String filename = rs.getString(5);

				//crrating an obect of news and pass all values to the constructor in the book class
				
				News n = new News(id,topic,description,date,filename);
				
				//crrating an obect of news and pass all values to the constructor in the book class
				news.add(n);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Returning the customer array list object   
		return news;
		
	}
	
	
	
	
	
	//Method to update the news data. This return a boolean value weather the data has been updated to the databse or not	
public static boolean updateNews(String id,String topic,String description,String date,String filename , String path) {
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			//Querry
			String sql = "update news set topic = '"+topic+"',description = '"+description+"',date = '"+date+"',filename = '"+filename+"',path = '"+path+"'"
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
public static boolean deleteNews(String id) {
	
	int convID = Integer.parseInt(id);
	
	try {//creating the connection
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		//query
		String sql = "delete from news where id = '"+convID+"'";
		int rs = stmt.executeUpdate(sql);
		//if result set value is greater than zero data has been deleted
		if(rs > 0) {
			isSuccess = true;
		}else {//if result set value is less than zero data has not been deleted
			isSuccess = false;
		}
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	//returning the boolean value
	return isSuccess;
}




}

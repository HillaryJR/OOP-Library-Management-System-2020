package DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DBUtil.DBConnect;
import model.Book;
import model.Periodical;
import model.User;





public class QADBUtil {

	//Database connection form DBConnect
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static int countBook() {
		  int count = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//query
			String sql = "select * from book";
			rs = stmt.executeQuery(sql);
			
			
		      while (rs.next()) {
		    	  //xount each row
		        count++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//return the count value
		return count;
	}
	
	
	
	
	public static int countBookC1() {
		  int count = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String BC1 = "Information Technology";
			
			//query
			String sql = "select * from book where categoryNum ='"+BC1 +"'";
			rs = stmt.executeQuery(sql);
			
			//int count = 0;
		      while (rs.next()) {
		        count++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return count;
	}
	
	
	public static int countBookC2() {
		  int count = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String BC1 = "Engineering-Architecture";
			
			//query
			String sql = "select * from book where categoryNum ='"+BC1 +"'";
			rs = stmt.executeQuery(sql);
			
			//int count = 0;
		      while (rs.next()) {
		        count++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return count;
	}
	
	
	public static int countBookC3() {
		  int count = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String BC1 = "Business Management";
			
			//query
			String sql = "select * from book where categoryNum ='"+BC1 +"'";
			rs = stmt.executeQuery(sql);
			
			//int count = 0;
		      while (rs.next()) {
		        count++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return count;
	}
	
	
	
	public static int countBookC4() {
		  int count = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String BC1 = "Hotel Management";
			
			//query
			String sql = "select * from book where categoryNum ='"+BC1 +"'";
			rs = stmt.executeQuery(sql);
			
			//int count = 0;
		      while (rs.next()) {
		        count++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return count;
	}
	
	

	public static int countPeriodical() {
		  int countP = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//query
			String sql = "select * from periodical";
			rs = stmt.executeQuery(sql);
			
			//int count = 0;
		      while (rs.next()) {
		        countP++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return countP;
	}
	
	
	public static int countMagazine() {
		  int countM = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String Magazine = "Magazine";
			//query
			String sql = "select * from periodical where type ='"+Magazine +"'";
			rs = stmt.executeQuery(sql);
			
			//int count = 0;
		      while (rs.next()) {
		        countM++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return countM;
	}
	
	
	public static int countNews() {
		  int countM = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String Newspaper = "Newspaper";
			//query
			String sql = "select * from periodical where type ='"+Newspaper +"'";
			rs = stmt.executeQuery(sql);
			
			//int count = 0;
		      while (rs.next()) {
		        countM++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return countM;
	}
	
	
	
	
	
	
	public static int countUser() {
		  int countU = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//query
			String sql = "select * from customer";
			rs = stmt.executeQuery(sql);
			
			//int count = 0;
		      while (rs.next()) {
		        countU++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return countU;
	}
	
	

	public static int countStaff() {
		  int countU = 0;
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//query
			String sql = "select * from staff";
			rs = stmt.executeQuery(sql);
			
			//int count = 0;
		      while (rs.next()) {
		        countU++;
		      }  
		    
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return countU;
	}
}

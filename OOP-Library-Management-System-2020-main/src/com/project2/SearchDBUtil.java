package com.project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project2.Search;
import Payment.DBConnect;

public class SearchDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//public static List<Search> validate(String name , String author) {
		
		//ArrayList<Search> srh = new ArrayList<>();
		//create database connection
		
				
		//validate
		//try {
			
			//con = DBConnect.getConnection();
			//stmt = con.createStatement();
			
			//String sql = "select * from book where bookname='"+name+"' or bookauthor='"+author+"'";
			//rs = stmt.executeQuery(sql);
			
			//if(rs.next()) {
				//int id = rs.getInt(1);
				//String bname = rs.getString(2);
				//String bauthor = rs.getString(3);
				//int year = rs.getInt(4);
				//double price = rs.getDouble(5);
				
				
				//Search s = new Search(id,bname,bauthor,year,price);
				//srh.add(s);
			//}
		//}
		//catch(Exception e) {
			//e.printStackTrace();
		//}
		
		//return srh;
	//}
	
	public static List<Search> displayCategory1() {
		
		ArrayList<Search> search = new ArrayList<>();
		//create database connection
		
				
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM book where categoryNum='1'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				int categoryNum = rs.getInt(2);
				String bookname = rs.getString(3);
				String bookauthor = rs.getString(4);
				String edition = rs.getString(5);
				double price = rs.getDouble(6);
				int year = rs.getInt(7);
				String filename = rs.getString(8);
			
				Search s = new Search(id,categoryNum,bookname,bookauthor,edition,price,year,filename);
				search.add(s);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return search;
	}
	
	public static List<Search> displayCategory2() {
		
		ArrayList<Search> search = new ArrayList<>();
		//create database connection
		
				
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM book where categoryNum='2'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				int categoryNum = rs.getInt(2);
				String bookname = rs.getString(3);
				String bookauthor = rs.getString(4);
				String edition = rs.getString(5);
				double price = rs.getDouble(6);
				int year = rs.getInt(7);
				String filename = rs.getString(8);
				
				Search s = new Search(id,categoryNum,bookname,bookauthor,edition,price,year,filename);
				search.add(s);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return search;
	}
	
	public static List<Search> displayCategory3() {
		
		ArrayList<Search> search = new ArrayList<>();
		//create database connection
		
				
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM book where categoryNum='3'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				int categoryNum = rs.getInt(2);
				String bookname = rs.getString(3);
				String bookauthor = rs.getString(4);
				String edition = rs.getString(5);
				double price = rs.getDouble(6);
				int year = rs.getInt(7);
				String filename = rs.getString(8);
			
				Search s = new Search(id,categoryNum,bookname,bookauthor,edition,price,year,filename);
				search.add(s);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return search;
	}
	
	public static List<Search> displayCategory4() {
		
		ArrayList<Search> search = new ArrayList<>();
		//create database connection
		
				
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM book where categoryNum='4'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				int categoryNum = rs.getInt(2);
				String bookname = rs.getString(3);
				String bookauthor = rs.getString(4);
				String edition = rs.getString(5);
				double price = rs.getDouble(6);
				int year = rs.getInt(7);
				String filename = rs.getString(8);
			
				Search s = new Search(id,categoryNum,bookname,bookauthor,edition,price,year,filename);
				search.add(s);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return search;
	}

}

package com.project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project2.Periodic;
import Payment.DBConnect;

public class PeriodicDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Periodic> displayNewspaper() {
		
		ArrayList<Periodic> period = new ArrayList<>();
		//create database connection
		
				
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM periodic where periodicNum='1'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				int periodicNum = rs.getInt(2);
				String periodicname = rs.getString(3);
				String publication = rs.getString(4);
				String edition = rs.getString(5);
				double price = rs.getDouble(6);
				String filename = rs.getString(7);
				
			
				Periodic p = new Periodic(id,periodicNum,periodicname,publication,edition,price,filename);
				period.add(p);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return period;
	}
	
	public static List<Periodic> displayMagazine() {
		
		ArrayList<Periodic> period = new ArrayList<>();
		//create database connection
		
				
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM periodic where periodicNum='2'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				int periodicNum = rs.getInt(2);
				String periodicname = rs.getString(3);
				String publication = rs.getString(4);
				String edition = rs.getString(5);
				double price = rs.getDouble(6);
				String filename = rs.getString(8);
				
			
				Periodic p = new Periodic(id,periodicNum,periodicname,publication,edition,price,filename);
				period.add(p);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return period;
	}
}

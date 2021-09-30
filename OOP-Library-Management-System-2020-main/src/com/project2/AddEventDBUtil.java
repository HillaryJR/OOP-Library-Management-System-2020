package com.project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project2.Event;
import Payment.DBConnect;

public class AddEventDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean insertevent(int code , String ageLimit , String eventname , String edescription , String date , String time , String filename , String path) {
			
		boolean isSuccess = false;
		
		//create database connection
		
		
		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into ex1 values ('"+code+"' , '"+ageLimit+"' , '"+eventname+"' , '"+edescription+"' , '"+date+"' , '"+time+"','"+filename+"','"+path+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static List<Event> displayevent() {
		
		ArrayList<Event> event = new ArrayList<>();
		//create database connection
		
				
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from ex1";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String agelimit = rs.getString(2);
				String eventname = rs.getString(3);
				String eventdes = rs.getString(4);
				String date = rs.getString(5);
				String time = rs.getString(6);
				String filename = rs.getString(7);
			
				Event e = new Event(id,agelimit,eventname,eventdes,date,time,filename);
				event.add(e);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return event;
	}
	
	public static boolean updateEvent(String id , String agelimit , String eventname , String eventdes , String date, String time) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "update ex1 set agelimit='"+agelimit+"' , eventname='"+eventname+"' ,eventdes='"+eventdes+"' ,date='"+date+"' ,time='"+time+"'"
						+"where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static List<Event> displayUpdateEvent(String id) {
		
		int convertedID = Integer.parseInt(id);
	
		ArrayList<Event> event = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from ex1 where id='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int Id = rs.getInt(1);
				String agelimit = rs.getString(2);
				String eventname = rs.getString(3);
				String eventdes = rs.getString(4);
				String date = rs.getString(5);
				String time = rs.getString(6);
				String filename = rs.getString(7);
			
			
				Event e = new Event(Id,agelimit,eventname,eventdes,date,time,filename);
				event.add(e);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return event;
	}

	public static List<Event> displayeventPage() {
	
		ArrayList<Event> event = new ArrayList<>();
		//create database connection
		
				
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from ex1";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String agelimit = rs.getString(2);
				String eventname = rs.getString(3);
				String eventdes = rs.getString(4);
				String date = rs.getString(5);
				String time = rs.getString(6);
				String filename = rs.getString(7);
			
				Event e = new Event(id,agelimit,eventname,eventdes,date,time,filename);
				event.add(e);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return event;
	}
	
	public static boolean deleteEvent(String id) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "delete from ex1 where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}



}	
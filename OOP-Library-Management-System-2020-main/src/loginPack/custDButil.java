package loginPack;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import Payment.DBConnect;


public class custDButil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static Statement stmt2 = null;
	private static ResultSet rs = null;
	
	public static boolean validate (String username, String password)
	{
		
		boolean isSuccess = false ;
		
		try
		{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer_details where username ='"+username+"' and password ='"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			
					
			
			if(rs.next()) 
			{
				 isSuccess = true;
				 stmt2 = con.createStatement();
				 String sql1 = "CREATE TABLE `john` (`id` int NOT NULL AUTO_INCREMENT, `itemName` varchar(45) DEFAULT NULL, PRIMARY KEY (`id`) );";
				 stmt2.executeQuery(sql1);
			
			}
			
			stmt.close();
			stmt2.close();
		}
		
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		
		return isSuccess;
	}
	

	

	public static boolean insertCustDetail (String fname, String lname, String mobile, String email, String address, String username, String password)
	{
		
		boolean isSuccess = false;
		String nopic = "none.jpg";
		String path = "C:\\Users\\Pradeep\\Desktop\\oop-practical\\LibrarySystem\\WebContent\\img\\"+File.separator + nopic;
		
		try{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into customer_details values (0,'"+fname+"','"+lname+"','"+mobile+"','"+email+"','"+address+"','"+username+"','"+password+"','"+nopic+"','"+path+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return isSuccess;
	}


	public static List<Customer> getCustDetails(String username)
	{
		ArrayList<Customer> cust = new ArrayList<>();
		
		try {
			
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "select * from customer_details where username='"+username+"'";
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String mobile = rs.getString(4);
				String email = rs.getString(5);
				String address = rs.getString(6);	
				String un = rs.getString(7);
				String pwd = rs.getString(8);
				String filename = rs.getString(9);
				
				if(filename == null ) {
					filename = "none.jpg";
				}
	
				Customer c1 = new Customer(id,fname,lname,mobile,email,address,username,filename);
				cust.add(c1);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return cust;
	}
	
	public static boolean updatecustomer(String fname, String lname, String mobile, String email, String address,String username) {
    	
		boolean isSuccess = false;
		
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update customer_details set fname='"+fname+"',lname='"+lname+"',mobile='"+mobile+"',email='"+email+"',address='"+address+"'"
    					+"where username='"+username+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
	
	public static boolean updatecustomer2(String username,String fileName,String savepath) {
    	
		boolean isSuccess = false;
		
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql ="update customer_details set filename='"+fileName+"',path='"+savepath+"'where username='"+username+"'";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
	
	public static boolean emailValidate (String femail)
	{
		
		boolean isSuccess = false ;
		
		try
		{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer_details where email ='"+femail+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) 
			{
				 isSuccess = true;
			}
			
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean setNewPassword (String nPassw, String email)
	{
		
		boolean isSuccess = false ;
		
		try
		{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update customer_details set password='"+nPassw+"' where email ='"+email+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) 
			{
				 isSuccess = true;
			}
			
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean deletePhoto (String username)
	{
		
		boolean isSuccess = false;
		
		try{	
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update customer_details set filename = null  where username ='"+username+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return isSuccess;
	}
	
	/*public static boolean deleteAccount (String username)
	{
		
		boolean isSuccess = false;
		
		try{	
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customer_details where username ='"+username+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return isSuccess;
	}*/
	
	public static String getPhoto(String username)
	{
		String img = null;
		
		try {
			
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "select * from customer_details where username='"+username+"'";
			ResultSet image = stmt.executeQuery(sql);
			
			
			while(image.next())
			{
				int id=rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String mobile = rs.getString(4);
				String email = rs.getString(5);
				String address = rs.getString(6);	
				String un = rs.getString(7);
				String pwd = rs.getString(8);
				String filename = rs.getString(9);
				String path = rs.getString(10);
	
				img = filename;
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return img;
	}	

	public static List<Customer> getViewCustDetails()
	{
		ArrayList<Customer> cust = new ArrayList<>();
	
		try {
		
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "select * from customer_details";
			ResultSet rs=stmt.executeQuery(sql);
		
			while(rs.next())
			{
				int id=rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String mobile = rs.getString(4);
				String email = rs.getString(5);
				String address = rs.getString(6);	
				String un = rs.getString(7);
				String pwd = rs.getString(8);
				String filename = rs.getString(9);
			
				if(filename == null ) {
					filename = "none.jpg";
				}

				Customer c1 = new Customer(id,fname,lname,mobile,email,address,un,filename);
				cust.add(c1);
			}
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	
		return cust;
	}
	
	public static boolean deleteCust(String id)
	{
		
		boolean isSuccess = false;
		
		try{	
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customer_details where id ='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return isSuccess;
	}

}
package Cart;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Payment.DBConnect;

public class CartDBUtil {
	
	/**
	 * Initializing Variables for connection
	 */
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	/**
	 * Insert Shopping cart details to a temporary Database.
	 */
	public static boolean insertCartDetails(String UserName, String itemName) {
		
		boolean isSuccess = false;
		
		try{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "INSERT INTO preordered VALUES (null,'"+UserName+"','"+itemName+"','350')";
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
	

	public static boolean cartCreation(String username) {
		
		boolean isSuccess = true;
		
		String cartname = username;
		
		final String Drop_table = "DROP TABLE IF EXISTS payment.shoo ";
		
		final String CREATE_TABLE_SQL = "CREATE TABLE payment.shoo ("
                + "id INT NOT NULL AUTO_INCREMENT,"
                + "Iname VARCHAR(45) NOT NULL,"
                + "PRIMARY KEY (id))";
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			stmt.executeUpdate(Drop_table);
			stmt.executeUpdate(CREATE_TABLE_SQL);
			System.out.println("Table created");
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}

	/**
	 * Retrieve Shopping cart details from the temporary Database.
	 */

	public static List<ShoppingCart> retreiveData(String username)
	{
		ArrayList<ShoppingCart> shop = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String retrieve = "SELECT * FROM preordered WHERE username = '"+username+"'";
			ResultSet rs=stmt.executeQuery(retrieve);
			
			int total = 0;
			while(rs.next())
			{
				
				String userName = rs.getString(2);
				String itemname = rs.getString(3);
				total=total+350;
					
				ShoppingCart sc = new ShoppingCart(userName, itemname, total);
				shop.add(sc);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return shop;
	}

	/**
	 * delete Shopping cart details from the temporary Database.
	 */
	public static boolean deleteCartDetails(String username, String itemName) {
		
		boolean isSuccess = false;
		
		try{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String deleteData = "DELETE FROM preordered WHERE username = '"+username+"' AND bookName = '"+itemName+"' ";
			int rs = stmt.executeUpdate(deleteData);
			
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

	/**
	 * delete all the Shopping cart details from the temporary Database.
	 */
	public static boolean deleteallCartDetails(String username) {
		boolean isSuccess = false;
		
		try{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String deleteallData="DELETE FROM preordered WHERE username='"+username+"'";
			int rs2 = stmt.executeUpdate(deleteallData);
			
			
			if(rs2 > 0) {
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

	/**
	 * insert Shopping cart details to the final preorderd Database.
	 */
	public static void inserDatatoFinal(String username) {
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String selectPreOrderdData = "SELECT * FROM preordered WHERE username = '"+username+"' "; 
			ResultSet results = stmt.executeQuery(selectPreOrderdData);
			
			while(results.next())
			{
				String userName = results.getString(2);
				String itemname = results.getString(3);
				
				String finalInsertCart = "INSERT INTO finalpreordered VALUES (0, '"+userName+"' , '"+itemname+"', null)";
				stmt.executeUpdate(finalInsertCart);
			}
		} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
		
}

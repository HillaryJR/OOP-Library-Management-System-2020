package Payment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Payment.DBConnect;
import Payment.Payment;

public class PaymentDButil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	/**
	 * To insert payment details to the database
	 */
	
	public static boolean insertPaymentDetails (String username, String name, String type, String cardNo, int expMonth, int expYear, int cvv, String payName)
	{
		
		boolean isSuccess = false;
		
		try{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "INSERT INTO paymentinfo VALUES (0,'"+username+"','"+name+"','"+type+"','"+cardNo+"', '"+expMonth+"','"+expYear+"','"+cvv+"', '"+payName+"' )";
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

	/**
	 * To retrieve payment details from the database using payment name 
	 */
	public static List<Payment> getPaymentDetails(String username, String pN) {
		
		ArrayList<Payment> payment = new ArrayList<>();
		
		try {
			
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "SELECT * FROM Paymentinfo WHERE username='"+username+"' AND paymenName = '"+pN+"'";
			
			 rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
		 		String name = rs.getString(3);
				String type = rs.getString(4);
				String cardNo = rs.getString(5);
				int expMonth = rs.getInt(6);
				int expYear = rs.getInt(7);
				int cvv = rs.getInt(8);
				String payName = rs.getString(9);
			
				Payment c1 = new Payment(type, name, cardNo, expMonth, expYear, cvv, payName);
				payment.add(c1);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return payment;
		
	}
	
	/**
	 * To update payment details to the database
	 */
	public static boolean updatePaymentDetails (String username, String name, String cardNo, int expMonth, int expYear, int cvv, String payName)
	{
		
		boolean isSuccess = false;
		
		try{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String update="UPDATE paymentinfo "
					+ "set Cname='"+name+"', cardNumber='"+cardNo+"',expMonth='"+expMonth+"', expYear='"+expYear+"', cvv='"+cvv+"'"
					+ " WHERE paymenName = '"+payName+"'";
			int rs = stmt.executeUpdate(update);
			
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
	
	/**
	 * To Retrieve payment details from the database using username
	 */
	public static List<Payment> getPaymentDetails1(String username) {
		
		ArrayList<Payment> payment = new ArrayList<>();
		
		try {
			
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "SELECT * FROM Paymentinfo WHERE username='"+username+"'";
			
			 rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
		 		String name = rs.getString(3);
				String type = rs.getString(4);
				String cardNo = rs.getString(5);
				int expMonth = rs.getInt(6);
				int expYear = rs.getInt(7);
				int cvv = rs.getInt(8);
				String payName = rs.getString(9);
			
				Payment c1 = new Payment(type, name, cardNo, expMonth, expYear, cvv, payName);
				payment.add(c1);
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return payment;
		
	}

	/**
	 * To delete payment details from the database
	 */
	public static boolean deletePayment(String username, String pN) {
		
		boolean isSuccess = false;
		
		try{
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String deleteData = "DELETE FROM paymentinfo WHERE userName = '"+username+"' AND paymenName = '"+pN+"' ";
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

}

	


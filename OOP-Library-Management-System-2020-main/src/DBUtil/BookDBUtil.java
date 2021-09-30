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



public class BookDBUtil {

	//Database connection form DBConnect
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	//Mehtod to insert a new book to the data base
	public static boolean insertBook(String categoryNum,String bookname,String bookauthor,String edition,String price,
			String year,String filename , String path) {
		boolean isSuccess = false;
		
		
		
		try {
			//creating the connection with the database
			con = DBConnect.getConnection();
			
			stmt = con.createStatement();
			//Insert query
			String sql = "Insert into book values( 0,'"+categoryNum+"','"+bookname+"','"+bookauthor+"','"+edition+"','"+price+"','"+year+"','"+filename+"','"+path+"')";
			
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
	
	
	
	
	//Method to retrive all rows and display from the book tabe in database
	//Return type list of the book with all data
	public static List<Book> getBookList(){

		//creatting an array list type object of book
		ArrayList<Book> book = new ArrayList<>();
		
		
		try {
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//query
			String sql = "select * from book";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//Assigning all retrieved values to the respective variables . if the next boolean value is true
				int id = rs.getInt(1);
				String categoryNum = rs.getString(2);
				String bookname = rs.getString(3);
				String bookauthor = rs.getString(4);
				String edition = rs.getString(5);
				String price = rs.getString(6);
				String year = rs.getString(7);
				String filename = rs.getString(8);


				//crrating an obect of book and pass all values to the constructor in the book class
				Book b = new Book(id,categoryNum,bookname,bookauthor,edition,price,year,filename);
				
				//passing book object to the array list object
				book.add(b);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Returning the book array list object
		return book;
		
	}
	
	
	
	
	
//Method to update the book data. This return a boolean value weather the data has been updated to the databse or not	
public static boolean updateBook(String id,String categoryNum,String bookname,String bookauthor,String edition,String price,String year,String filename , String path) {
		
		try {
			
			//creating connection with the database
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//Querry
			String sql = "update book set categoryNum = '"+categoryNum+"',bookname = '"+bookname+"',bookauthor = '"+bookauthor+"',edition = '"+edition+"',price= '"+price+"',year = '"+year+"',filename = '"+filename+"',path = '"+path+"'"
					+ "where id = '"+id+"'";

			
			int rs = stmt.executeUpdate(sql);
			
			//if result set value is greater than zero data has been updated
			if( rs > 0 ) {
				isSuccess =  true;
			}//if result set value is less than zero data has not been updated
			else {
				isSuccess =  false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//return the boolean value
		return isSuccess;
	}





//Method to delete a specific data from the table using the passed id
public static boolean deleteBook(String id) {
	
	int convID = Integer.parseInt(id);
	
	try {
		//creating the connection
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		//query
		String sql = "delete from book where id = '"+convID+"'";
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

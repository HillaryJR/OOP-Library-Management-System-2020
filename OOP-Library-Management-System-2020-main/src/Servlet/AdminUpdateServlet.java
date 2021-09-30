package Servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DBUtil.AdminDBUtil;
import model.Admin;

/**
 * Servlet implementation class BookUpdateServlet
 */
@WebServlet("/AdminUpdateServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 *
1024 * 10, maxRequestSize= 1024 * 1024 * 50)

public class AdminUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset-UTF-5"); 
		PrintWriter out = response.getWriter();
		
		
		//Assging the data to variables of the values in the jsp file		 
		String id  =  request.getParameter("id");
		String fname =  request.getParameter("fname");
	    String lname =  request.getParameter("lname");
	    String mobile =  request.getParameter("mobile");
	    String email =  request.getParameter("email");
	    String address =  request.getParameter("address");
	    String username =  request.getParameter("username");
	    String password =  request.getParameter("password");
		
	    
	    
	    //Declaring the variables to store path and filename
	    Part part = request.getPart("filename"); 
	    String savepath = null; 
	    String fileName = null;
		  
	    
	    //extracting the file name aand saing the path of the file
		  fileName = extractFileName(part); 
		  savepath = "C:\\Users\\RADESH\\Downloads\\SLIIT\\sliit 1st semester 2nd year\\OSSA - Opperating System & System Administration\\OOP\\Jproject2\\WebContent\\images" +File.separator+ fileName; File fileSaveDir = new File(savepath);
		  part.write(savepath+File.separator);
		  
		  
		  
		  //declaring boolean type variable
		  boolean isTrue;
			
		  //returning weather true or false and assiging it to a boolean type vraibel isTrue
		  //pAssing the data to the DbUtil to update in the database
			isTrue = AdminDBUtil.updateAdmin( id ,fname, lname,mobile,email,address, username,password, fileName , savepath);
			
			if(isTrue == true) {
				//If the db connection is a success and the data is been inserted DB
				List<Admin> adminDetails = AdminDBUtil.getAdminDetails(username);
		      	  request.setAttribute("adminDetails", adminDetails);
				RequestDispatcher dis = request.getRequestDispatcher("AdminUpdateSuccess.jsp");
				
				dis.forward(request, response);
			}else {
				//If our DB connection is not a success.
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
		  
		  
	    
	}

	//Mthod to exctract the file name
	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";"); 
		for (String s : items) {
			if(s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
			  
	}
			 
}

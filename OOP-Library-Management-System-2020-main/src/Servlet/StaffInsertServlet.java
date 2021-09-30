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

import DBUtil.StaffDBUtil;

@WebServlet("/StaffInsertServlet")

  @MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 *
  1024 * 10, maxRequestSize= 1024 * 1024 * 50)
 
public class StaffInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		  response.setContentType("text/html;charset-UTF-5"); 
		  PrintWriter out = response.getWriter();
		 
		//Assiging the values in the jsp file variables to paramters to be passed to the Dbutil
			
	    String fname =  request.getParameter("fname");
	    String lname =  request.getParameter("lname");
	    String mobile =  request.getParameter("mobile");
	    String email =  request.getParameter("email");
	    String address =  request.getParameter("address");
	    String role =  request.getParameter("role");
	    
	  //Declaring string ttype variable to store the path and fileName
		  //extract file name and save the path
			
		  Part part = request.getPart("filename"); String savepath = null; String
		  fileName = null;
		  
		  fileName = extractFileName(part); savepath =
		  "C:\\Users\\RADESH\\Downloads\\SLIIT\\sliit 1st semester 2nd year\\OSSA - Opperating System & System Administration\\OOP\\Jproject2\\WebContent\\images"
		  +File.separator+ fileName; File fileSaveDir = new File(savepath);
		  part.write(savepath+File.separator);
		 
		//declaring boolean type variable
		 boolean isTrue;
		//aassging the retrun type to boolean type variable weather true or false
			
		isTrue = StaffDBUtil.insertStaff( fname, lname,mobile,email,address, role, fileName , savepath);
			
			if(isTrue == true) {
				//If the db connection is a success and the data is been inserted DB

				//rediereting to the jsp page	
				
				
			
				RequestDispatcher dis = request.getRequestDispatcher("StaffInsertSuccess.jsp");
				dis.forward(request, response);
			}else {
				//if boolean type is false
				
				
				//If our DB connection is not a success.
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
			
	    
	}

	
	//method to extract file name
	  private String extractFileName(Part part) { String contentDisp =
	  part.getHeader("content-disposition"); String[] items =
	  contentDisp.split(";"); for (String s : items) {
	  if(s.trim().startsWith("filename")) { return s.substring(s.indexOf("=") + 2,
	  s.length() - 1); } } return ""; }
	 
}

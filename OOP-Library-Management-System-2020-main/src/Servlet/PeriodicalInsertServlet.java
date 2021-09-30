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

import DBUtil.PeriodicalDBUtil;


@WebServlet("/PeriodicalInsertServlet")

  @MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 *
  1024 * 10, maxRequestSize= 1024 * 1024 * 50)
 
public class PeriodicalInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		  response.setContentType("text/html;charset-UTF-5"); PrintWriter out =
		  response.getWriter();
		 
		//Assiginf the values to paramaters which are passed from the jsp page
		    
	    String type =  request.getParameter("type");
	    String name =  request.getParameter("name");
	    String publication =  request.getParameter("publication");
	    String edition =  request.getParameter("edition");
	    String price =  request.getParameter("price");
	    String year =  request.getParameter("year");
	    
		
		  Part part = request.getPart("filename"); 
		//Svaing the path where file to be stored
		  String savepath = null; 
		  String fileName = null;
		  
		  fileName = extractFileName(part); savepath =
		  "C:\\Users\\RADESH\\Downloads\\SLIIT\\sliit 1st semester 2nd year\\OSSA - Opperating System & System Administration\\OOP\\Jproject2\\WebContent\\images"
		  +File.separator+ fileName; File fileSaveDir = new File(savepath);
		  part.write(savepath+File.separator);
		 
		//siTrue boolean values
		 boolean isTrue;
		//returning boolean value from isnert weather true or false
			
			isTrue = PeriodicalDBUtil.insertPeriodical( type, name,publication,edition,price, year, fileName , savepath);
			
			if(isTrue == true) {
				//If the db connection is a success and the data is been inserted DB
				
				RequestDispatcher dis = request.getRequestDispatcher("PeriodicalInsertSuccess.jsp");
				dis.forward(request, response);
			}else {
				//If our DB connection is not a success.
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
			
	    
	}

	
	//method to exxtract file name ffrom the file
	  private String extractFileName(Part part) { String contentDisp =
	  part.getHeader("content-disposition"); String[] items =
	  contentDisp.split(";"); for (String s : items) {
	  if(s.trim().startsWith("filename")) { return s.substring(s.indexOf("=") + 2,
	  s.length() - 1); } } return ""; }
	 
}

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
import model.Periodical;

/**
 * Servlet implementation class BookUpdateServlet
 */
@WebServlet("/PeriodicalUpdateServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 *
1024 * 10, maxRequestSize= 1024 * 1024 * 50)

public class PeriodicalUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset-UTF-5"); 
		PrintWriter out = response.getWriter();
		//Assging the valuse to the parameter form the variables in jsp page
				 
		String id  =  request.getParameter("id");
		String type =  request.getParameter("type");
	    String name =  request.getParameter("name");
	    String publication =  request.getParameter("publication");
	    String edition =  request.getParameter("edition");
	    String price =  request.getParameter("price");
	    String year =  request.getParameter("year");
		
	    //declaring string type varibales to save the path and the file name of the file
		   
	    
	    Part part = request.getPart("filename"); 
	    String savepath = null; 
	    String fileName = null;
	  //saving the file nname and the path
		 
		  fileName = extractFileName(part); 
		  savepath = "C:\\Users\\RADESH\\Downloads\\SLIIT\\sliit 1st semester 2nd year\\OSSA - Opperating System & System Administration\\OOP\\Jproject2\\WebContent\\images" +File.separator+ fileName; File fileSaveDir = new File(savepath);
		  part.write(savepath+File.separator);
		  
		  
		  //declaring the boolan type varibel to store the return type from the dbutil
			 
		  
		  boolean isTrue;
			
			isTrue = PeriodicalDBUtil.updatePeriodical( id ,type, name,publication,edition,price, year, fileName , savepath);
			
			if(isTrue == true) {
				//If the db connection is a success and the data is been inserted DB
				List<Periodical> listPeriodical = PeriodicalDBUtil.getPeriodicalList();
				request.setAttribute("listPeriodical", listPeriodical);
				RequestDispatcher dis = request.getRequestDispatcher("PeriodicalUpdateSuccess.jsp");
				
				dis.forward(request, response);
			}else {
				//If our DB connection is not a success.
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
		  
		  
	    
	}

	//extracting the filename from the part file
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

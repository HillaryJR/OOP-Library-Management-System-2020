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

import DBUtil.NewsDBUtil;
import model.News;

/**
 * Servlet implementation class BookUpdateServlet
 */
@WebServlet("/NewsUpdateServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 *
1024 * 10, maxRequestSize= 1024 * 1024 * 50)

public class NewsUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset-UTF-5"); 
		PrintWriter out = response.getWriter();
		
		//Assging the data to variables of the values in the jsp file		 
		
		String id  =  request.getParameter("id");
		String topic =  request.getParameter("topic");
	    String description =  request.getParameter("description");
	    String date =  request.getParameter("date");
		

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
			
			isTrue = NewsDBUtil.updateNews( id ,topic, description,date,fileName , savepath);
			
			if(isTrue == true) {
				//If the db connection is a success and the data is been inserted DB
				List<News> listNews = NewsDBUtil.getNewsList();
				request.setAttribute("listNews", listNews);
				RequestDispatcher dis = request.getRequestDispatcher("NewsUpdateSuccess.jsp");
				
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

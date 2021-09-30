package com.project2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.project2.AddEventDBUtil;

/**
 * Servlet implementation class AddbookServlet
 */
@WebServlet("/AddbookServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
		maxFileSize = 1024 * 1024 * 10,
		maxRequestSize= 1024 * 1024 * 50)
public class AddEventServlet extends HttpServlet {
	/*private static final long serialVersionUID = 1L;*/


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset-UTF-5");
	    PrintWriter out = response.getWriter();
	    
		int code = Integer.parseInt(request.getParameter("eCode"));
		String ageLimit = request.getParameter("aLimit");
		String eventname = request.getParameter("eName");
		String edescription = request.getParameter("eDes");
		String date = request.getParameter("eDate");
		String time = request.getParameter("eTime");
		
		Part part = request.getPart("filename");
		String savepath = null;
		String fileName = null;
	
		
		 
			 fileName = extractFileName(part);
			 savepath = "C:\\Users\\Pradeep\\Desktop\\oop-practical\\Project2\\WebContent\\img\\"+File.separator+ fileName;
			 File fileSaveDir = new File(savepath);
			 part.write(savepath+File.separator);
			
		
		
		
		boolean isTrue;
		
		isTrue = AddEventDBUtil.insertevent(code , ageLimit, eventname, edescription , date , time , fileName , savepath);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	
	}

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

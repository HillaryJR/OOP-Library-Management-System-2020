package com.project2;

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

import com.project2.Event;
import com.project2.AddEventDBUtil;

/**
 * Servlet implementation class UpdateEventServlet
 */
@WebServlet("/UpdateEventServlet")

public class UpdateEventServlet extends HttpServlet {
	/*private static final long serialVersionUID = 1L;*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	response.setContentType("text/html;charset-UTF-5");
	    PrintWriter out = response.getWriter();
	
		String id = request.getParameter("eCode");
		String agelimit = request.getParameter("aLimit");
		String eventname = request.getParameter("eName");
		String eventdes = request.getParameter("eDes");
		String date = request.getParameter("eDate");
		String time = request.getParameter("eTime");
		
		boolean isTrue;
		
		
		isTrue = AddEventDBUtil.updateEvent(id, agelimit, eventname, eventdes , date , time);
		
		if(isTrue == true) {
			
			List<Event> eventDetails = AddEventDBUtil.displayUpdateEvent(id);
			request.setAttribute("eventDetails" , eventDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
			dis.forward(request , response);
		}
		else {
			List<Event> eventDetails = AddEventDBUtil.displayUpdateEvent(id);
			request.setAttribute("eventDetails" , eventDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
			dis.forward(request , response);
		}
	}
	
	

}

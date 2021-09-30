package com.project2;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEventServlet
 */
@WebServlet("/DeleteEventServlet")
public class DeleteEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("eCode");
		
		boolean isTrue;
		
		isTrue = AddEventDBUtil.deleteEvent(id);
		
		if(isTrue == true) {
			
			//List<Event> eventDetails = AddEventDBUtil.displayUpdateEvent(id);
			//request.setAttribute("eventDetails" , eventDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
			dis.forward(request , response);
		}
		else {
			//List<Event> eventDetails = AddEventDBUtil.displayUpdateEvent(id);
			//request.setAttribute("eventDetails" , eventDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request , response);
		}
	}
}

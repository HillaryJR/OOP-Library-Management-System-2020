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
 * Servlet implementation class DisplayEventServlet
 */
@WebServlet("/DisplayEventServlet")
public class DisplayEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List <Event> eventDetails = AddEventDBUtil.displayevent();
			request.setAttribute("eventDetails" , eventDetails);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("viewEvent.jsp");
		dis.forward(request , response);
	}

}

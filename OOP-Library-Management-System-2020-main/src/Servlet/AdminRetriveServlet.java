package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBUtil.AdminDBUtil;
import model.Admin;

/**
 * Servlet implementation class custRetreiveServlet
 */
@WebServlet("/AdminRetriveServlet")
public class AdminRetriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("username");

		username = "ananda123";
		
		try {
		//List type value retriveing of admin details array list	
      	  List<Admin> adminDetails = AdminDBUtil.getAdminDetails(username);
      	  request.setAttribute("adminDetails", adminDetails);
	    }
	    catch (Exception e) {
		e.printStackTrace();
	    }
	    
	    //Navigating the data to Adminrofile.jsp
	    RequestDispatcher dis = request.getRequestDispatcher("AdminProfile.jsp");
	    dis.forward(request, response);
	}

}

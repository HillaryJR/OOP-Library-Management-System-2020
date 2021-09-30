package loginPack;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class deleteCustServlet
 */
@WebServlet("/deleteCustServlet")
public class deleteCustServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id= (String) session.getAttribute("id");
		
		boolean isTrue ;
		
		isTrue = custDButil.deleteCust(id);
	
		if (isTrue == true) {
			List<Customer> custDet = custDButil.getViewCustDetails();
	      	request.setAttribute("custDetail", custDet);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewUser.jsp");
			dis.forward(request, response);
		}
		else 
		{	
			RequestDispatcher dis2 = request.getRequestDispatcher("ndUser.jsp");
			dis2.forward(request, response);
		}
	}

}

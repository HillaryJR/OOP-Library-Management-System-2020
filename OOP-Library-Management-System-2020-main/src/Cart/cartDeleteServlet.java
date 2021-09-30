package Cart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class cartDeleteServlet
 */
@WebServlet("/cartDeleteServlet")
public class cartDeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		
		String itemName = request.getParameter("BookName");
		
		boolean isTrue;
		
		isTrue = CartDBUtil.deleteCartDetails(username, itemName);
		
		try {	    	
	    	if(isTrue == true) {
				RequestDispatcher dis = request.getRequestDispatcher("successcartItemdelete.jsp");
				dis.forward(request, response);
			}
			else {
				RequestDispatcher dis1 = request.getRequestDispatcher("unsuccesspay.jsp");
				dis1.forward(request, response);
			}

		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

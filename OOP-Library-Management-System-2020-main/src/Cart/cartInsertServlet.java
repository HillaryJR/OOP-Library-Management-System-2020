package Cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import loginPack.Customer;
import loginPack.custDButil;

/**
 * Servlet implementation class cartInsertServlet
 */
@WebServlet("/cartInsertServlet")
public class cartInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		
		String itemName = request.getParameter("BookName");
		float price = Float.parseFloat(request.getParameter("Price"));
		
		boolean isTrue;
		
		isTrue = CartDBUtil.insertCartDetails(username, itemName);
		
		try {	    	
	    	if(isTrue == true) {
				RequestDispatcher dis = request.getRequestDispatcher("successcart.jsp");
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
	
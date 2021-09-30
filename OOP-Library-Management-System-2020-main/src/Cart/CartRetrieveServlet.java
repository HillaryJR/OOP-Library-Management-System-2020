package Cart;

import java.io.IOException;
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
 * Servlet implementation class CartRetrieveServlet
 */
@WebServlet("/CartRetrieveServlet")
public class CartRetrieveServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		
		try {
				
			List<ShoppingCart> shop = CartDBUtil.retreiveData(username);
	    	request.setAttribute("cartDetails", shop);

	    	if(shop.isEmpty()) {
	    		List<Customer> custDet = custDButil.getCustDetails(username);
			    request.setAttribute("custDetail", custDet);
			    
	    		RequestDispatcher dis = request.getRequestDispatcher("emptycart.jsp");
				dis.forward(request, response);
	    	}

	    	else {
				List<Customer> custDet = custDButil.getCustDetails(username);
			    request.setAttribute("custDetail", custDet);
				
				RequestDispatcher dis = request.getRequestDispatcher("cart.jsp");
				dis.forward(request, response);
			}
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

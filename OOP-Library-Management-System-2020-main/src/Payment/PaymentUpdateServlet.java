package Payment;

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
 * Servlet implementation class PaymentUpdateServlet
 */
@WebServlet("/PaymentUpdateServlet")
public class PaymentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

 		String name = request.getParameter("name");
		String cardNo = request.getParameter("Cnumber");
		int expMonth = Integer.parseInt(request.getParameter("expmonth"));
		int expYear = Integer.parseInt(request.getParameter("expyear"));
		int cvv = Integer.parseInt(request.getParameter("cvv"));
		String payName = request.getParameter("payName");
		
		
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		
		boolean isTrue;
		
		isTrue = PaymentDButil.updatePaymentDetails(username, name, cardNo, expMonth, expYear, cvv, payName);
		
		if(isTrue == true) {
			List<Customer> custDet = custDButil.getCustDetails(username);
		    request.setAttribute("custDetail", custDet);
			
			RequestDispatcher dis = request.getRequestDispatcher("successPaymentEdited.jsp");
			dis.forward(request, response);
		}
		else {			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccesspay.jsp");
			dis.forward(request, response);
		}
	
	}

}

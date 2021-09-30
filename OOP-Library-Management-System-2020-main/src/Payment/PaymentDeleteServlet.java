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
 * Servlet implementation class PaymentDeleteServlet
 */
@WebServlet("/PaymentDeleteServlet")
public class PaymentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		
		String PN =request.getParameter("PN");
		
		boolean isTrue;
		
		isTrue = PaymentDButil.deletePayment(username , PN);
		
		if(isTrue == true) {
			List<Customer> custDet = custDButil.getCustDetails(username);
		    request.setAttribute("custDetail", custDet);
			
			RequestDispatcher dis = request.getRequestDispatcher("successPaymentDeleted.jsp");
			dis.forward(request, response);
		}
		else {			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccesspay.jsp");
			dis.forward(request, response);
		}
		
	}

}

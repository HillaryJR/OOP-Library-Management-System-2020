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
 * Servlet implementation class PaymentDetailsUpdateServlet
 */
@WebServlet("/PaymentDetailsUpdateServlet")
public class PaymentDetailsUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		
		String PN =request.getParameter("PN");
		
		try {
      	
				List<Payment> paymentDetail = PaymentDButil.getPaymentDetails(username, PN);
				request.setAttribute("paymentDetail", paymentDetail);
				
				List<Customer> custDet = custDButil.getCustDetails(username);
			    request.setAttribute("custDetail", custDet);
				
		}
	   
		catch (Exception e) {
				
			e.printStackTrace();
	   
		}
	        
	    RequestDispatcher dis = request.getRequestDispatcher("updatePayment.jsp");
	    dis.forward(request, response);
		
	}
}

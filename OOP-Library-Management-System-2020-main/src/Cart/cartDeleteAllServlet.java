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

import Payment.Payment;
import Payment.PaymentDButil;
import loginPack.Customer;
import loginPack.custDButil;

/**
 * Servlet implementation class cartDeleteAllServlet
 */
@WebServlet("/cartDeleteAllServlet")
public class cartDeleteAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		
		
		boolean isTrue;
		
		CartDBUtil.inserDatatoFinal(username);
		isTrue = CartDBUtil.deleteallCartDetails(username);
		
		try {
	      	  List<Customer> custDet = custDButil.getCustDetails(username);
	      	  request.setAttribute("custDetail", custDet);
		}
		
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
		
		try {	
				List<Payment> paymentDetail = PaymentDButil.getPaymentDetails1(username);
				
				if(paymentDetail.isEmpty()){
					
					if(isTrue == true) {
						RequestDispatcher dis = request.getRequestDispatcher("Payment.jsp");
						dis.forward(request, response);
					}
				}

				else {
					RequestDispatcher dis1 = request.getRequestDispatcher("sucessviewpay.jsp");
					dis1.forward(request, response);
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

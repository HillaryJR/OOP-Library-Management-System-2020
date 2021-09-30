package location;

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
 * Servlet implementation class viewPaymentServlet
 */
@WebServlet("/viewPaymentServlet")
public class viewPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		
		List<Customer> custDet = custDButil.getCustDetails(username);
      	request.setAttribute("custDetail", custDet);
		
		RequestDispatcher dis = request.getRequestDispatcher("viewPayment.jsp");
		dis.forward(request, response);
		
	}

}

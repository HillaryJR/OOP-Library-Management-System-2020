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
 * Servlet implementation class cartcreationServlet
 */
@WebServlet("/cartcreationServlet")
public class cartcreationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
			
		boolean isTrue = CartDBUtil.cartCreation(username);
		
		if(isTrue == true){
			RequestDispatcher dis = request.getRequestDispatcher("Category1.jsp");
			dis.forward(request, response);
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccesspay.jsp");
			dis.forward(request, response);
		}
		
	}

}

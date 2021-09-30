package loginPack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class confirmEmailServlet
 */
@WebServlet("/confirmEmailServlet")
public class confirmEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String femail = request.getParameter("femail");
		
		boolean isTrue ;
		
		isTrue = custDButil.emailValidate(femail);
	
		if (isTrue == true) {
			HttpSession session = request.getSession();	    
	        session.setAttribute("conEmail",femail);
			
			RequestDispatcher dis = request.getRequestDispatcher("forgotPwd2.jsp");
			dis.forward(request, response);
		}
		else 
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("failEmail.jsp");
			dis2.forward(request, response);
		}
		
	}

}

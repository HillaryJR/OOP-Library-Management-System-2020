package loginPack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registrationServlet
 */
@WebServlet("/registrationServlet")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String username = request.getParameter("username");
		String password = request.getParameter("passw");
		String cpassword = request.getParameter("cpassw");
		
		if(password.equals(cpassword))
		{
			boolean isTrue;
			
			isTrue = custDButil.insertCustDetail(fname, lname, mobile, email, address, username, password);
			
			if (isTrue == true) {
				RequestDispatcher dis = request.getRequestDispatcher("successReg.jsp");
				dis.forward(request, response);
			}
			else{
				RequestDispatcher dis2 = request.getRequestDispatcher("failRegistration.jsp");
				dis2.forward(request, response);
			}
		}
		else
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("failPwdReg.jsp");
			dis2.forward(request, response);
		}
	}

}

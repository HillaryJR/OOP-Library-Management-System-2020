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
 * Servlet implementation class newPasswordServlet
 */
@WebServlet("/newPasswordServlet")
public class newPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String newPassword = request.getParameter("nPass");
			String cPassword = request.getParameter("cnPass");
			
			HttpSession session = request.getSession();
			String email= (String) session.getAttribute("conEmail");
			
			if(newPassword.equals(cPassword))
			{
				boolean isTrue ;
				
				isTrue = custDButil.setNewPassword(newPassword,email);
			
				if (isTrue == true) {
					session.invalidate();
					
					RequestDispatcher dis = request.getRequestDispatcher("pwdChange.jsp");
					dis.forward(request, response);
				}
				else 
				{
					session.invalidate();
					
					RequestDispatcher dis2 = request.getRequestDispatcher("notPwdChange.jsp");
					dis2.forward(request, response);
				}
			}
			else {
				session.invalidate();
				
				RequestDispatcher dis2 = request.getRequestDispatcher("notPwdChange.jsp");
				dis2.forward(request, response);
			}
		
	}

}

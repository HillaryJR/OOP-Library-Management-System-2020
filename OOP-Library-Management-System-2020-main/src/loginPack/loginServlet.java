package loginPack;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un = request.getParameter("username");
		String pwd = request.getParameter("password");
		
			boolean isTrue ;
			
			isTrue = custDButil.validate(un,pwd);
			
		try {
			if (isTrue == true) {
				
				 HttpSession session = request.getSession();	    
		         session.setAttribute("uname",un);
		         session.setAttribute("pwd", pwd);
		         String username= (String) session.getAttribute("uname");
		         
		         List<Customer> custDet = custDButil.getCustDetails(username);
		      	  request.setAttribute("custDetail", custDet);
				
		      	  
		      	  
				RequestDispatcher dis = request.getRequestDispatcher("Home1.jsp");
				dis.forward(request, response);
			}
			else 
			{
				RequestDispatcher dis2 = request.getRequestDispatcher("failLogin.jsp");
				dis2.forward(request, response);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
					
	}	

}

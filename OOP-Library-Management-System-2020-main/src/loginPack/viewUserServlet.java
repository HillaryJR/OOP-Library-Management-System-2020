package loginPack;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewUserServlet
 */
@WebServlet("/viewUserServlet")
public class viewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
	      	  List<Customer> custDet = custDButil.getViewCustDetails();
	      	  request.setAttribute("custDetail", custDet);
		    }
		    catch (Exception e) {
			e.printStackTrace();
		    }
		    
		    
		    RequestDispatcher dis = request.getRequestDispatcher("viewUser.jsp");
		    dis.forward(request, response);
		}
		
	}


package loginPack;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import loginPack.Customer;
import loginPack.custDButil;

/**
 * Servlet implementation class updateCustServlet
 */
@WebServlet("/updateCustServlet")
public class updateCustServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset-UTF-5");
		PrintWriter out = response.getWriter();
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		
		boolean isTrue;
	
		isTrue = custDButil.updatecustomer(fname, lname, mobile, email, address, username);
		
		
		
		if(isTrue == true) {
			
			List<Customer> custDetail = custDButil.getCustDetails(username);
			request.setAttribute("custDetail", custDetail);
			
			RequestDispatcher dis = request.getRequestDispatcher("UserProfile.jsp");
			dis.forward(request, response);
		}
		else {
			List<Customer> custDetail = custDButil.getCustDetails(username);
			request.setAttribute("custDetail", custDetail);
			
			RequestDispatcher dis = request.getRequestDispatcher("UserProfile.jsp");
			dis.forward(request, response);
		}
		
	}

	/*private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";"); 
		for (String s : items) {
			if(s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
	}*/

}

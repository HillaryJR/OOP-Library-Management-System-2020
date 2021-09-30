package loginPack;

import java.io.File;
import java.io.IOException;
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

/**
 * Servlet implementation class updatePhotoServlet
 */
@WebServlet("/updatePhotoServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
		maxFileSize = 1024 *1024 * 10,
		maxRequestSize = 1024 * 1024 * 50)
public class updatePhotoServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset-UTF-5");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String username= (String) session.getAttribute("uname");
		String pwd =(String) session.getAttribute("pwd");
		
		boolean isTrue;
		
		String chk = request.getParameter("filename");
		Part part = request.getPart("filename");
		
		if(chk == null)
		{
			List<Customer> custDetail = custDButil.getCustDetails(username);
			request.setAttribute("custDetail", custDetail);
			
			RequestDispatcher dis = request.getRequestDispatcher("UserProfile.jsp");
			dis.forward(request, response);
		}
	
		String fileName = extractFileName(part);
		String savepath = "C:\\Users\\Pradeep\\Desktop\\oop-practical\\LibrarySystem\\WebContent\\img\\"+File.separator + fileName;
		File fileSaveDir = new File(savepath);
			
		part.write(savepath + File.separator); 
			
		isTrue = custDButil.updatecustomer2(username, fileName, savepath);
		
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

	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";"); 
		for (String s : items) {
			if(s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
	}


}

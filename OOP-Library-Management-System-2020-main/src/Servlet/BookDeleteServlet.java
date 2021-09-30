package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.BookDBUtil;
import model.Book;




@WebServlet("/BookDeleteServlet")
public class BookDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Store paramter passed by the jsp file 
		String id = request.getParameter("id");
		
		//declare boolran type variable
		boolean isTrue;
		
		//passing the id as a parameter to the data base to delete form the data base
		isTrue = BookDBUtil.deleteBook(id);
		
		
		
		if(isTrue == true) {
			//returns an arary type value from bookList
			List<Book> listBook = BookDBUtil.getBookList();
			request.setAttribute("listBook", listBook);
			RequestDispatcher dis = request.getRequestDispatcher("BookDeleteSuccess.jsp");
		
			dis.forward(request, response);
			
		}else {
			
			//if boolean values is false not enterde succesfully
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

}

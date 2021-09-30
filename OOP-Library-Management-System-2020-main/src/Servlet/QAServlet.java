package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.QADBUtil;
import model.Book;


@WebServlet("/QAServlet")
public class QAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//retrieving calculated totoal amount of rows in each specific table
		//setting them to the attribute and navigating it to the jsp page
		
		//total number of books
		int bookCount = QADBUtil.countBook();
		request.setAttribute("bookCount", bookCount);
		
		//total number of IT books
		int bookCountI = QADBUtil.countBookC1();
		request.setAttribute("bookCountI", bookCountI);
		
		//total number of Enginering books
		int bookCountE = QADBUtil.countBookC2();
		request.setAttribute("bookCountE", bookCountE);
		
		//total number of BM books
		int bookCountB = QADBUtil.countBookC3();
		request.setAttribute("bookCountB", bookCountB);
		
		//total number of Hotel Mangemnt books
		int bookCountH = QADBUtil.countBookC4();
		request.setAttribute("bookCountH", bookCountH);
		
		
		////total number of periodicals
		int periodicalCount = QADBUtil.countPeriodical();
		request.setAttribute("periodicalCount", periodicalCount);
		
		////total number of magazine
		int magCount = QADBUtil.countMagazine();
		request.setAttribute("magCount", magCount);
		
		//total number of newspapers
		int newsCount = QADBUtil.countNews();
		request.setAttribute("newsCount", newsCount);
		
		////total number of users in the system
		int userCount = QADBUtil.countUser();
		request.setAttribute("userCount", userCount);
		
		int staffCount = QADBUtil.countStaff();
		request.setAttribute("staffCount", staffCount);
		
		
		
		//navigatin the jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("AdminQA.jsp");
		dispatcher.forward(request, response);
	}

}

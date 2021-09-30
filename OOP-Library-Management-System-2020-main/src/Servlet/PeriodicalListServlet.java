package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.PeriodicalDBUtil;
import model.Periodical;


@WebServlet("/PeriodicalListServlet")
public class PeriodicalListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//return value storing in a list type array to be passed to the jsp file
		List<Periodical> listPeriodical = PeriodicalDBUtil.getPeriodicalList();
		//setting the attribute to be passed
		request.setAttribute("listPeriodical", listPeriodical);
		//navigating the arraylist to the jsp page
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("PeriodicalList.jsp");
		dispatcher.forward(request, response);
	}

}

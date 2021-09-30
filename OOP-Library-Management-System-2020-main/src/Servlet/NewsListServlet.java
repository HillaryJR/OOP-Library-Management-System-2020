package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUtil.NewsDBUtil;
import model.News;


@WebServlet("/NewsListServlet")
public class NewsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//retrive aray type list of all book details from the dbutil
		
		List<News> listNews = NewsDBUtil.getNewsList();
		request.setAttribute("listNews", listNews);
		//navigating to the jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("NewsList.jsp");
		dispatcher.forward(request, response);
	}

}

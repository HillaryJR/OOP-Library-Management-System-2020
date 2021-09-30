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




@WebServlet("/NewsDeleteServlet")
public class NewsDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Store paramter passed by the jsp file 
		String id = request.getParameter("id");
		boolean isTrue;
		
		//declare boolran type variable
		isTrue = NewsDBUtil.deleteNews(id);
		
		
		//if boolean values is true enterde succesfully
		if(isTrue == true) {
			//returns an arary type value from news
			List<News> listNews = NewsDBUtil.getNewsList();
			request.setAttribute("listNews", listNews);
			RequestDispatcher dis = request.getRequestDispatcher("NewsDeleteSuccess.jsp");
		
			dis.forward(request, response);
			
		}else {
			
			
			//if boolean values is false not enterde succesfully
			RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

}

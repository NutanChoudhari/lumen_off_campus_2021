package com.training;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Book;
import com.training.service.BookService;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private BookService service;
    public GreetingServlet() {
        super();
        service=new BookService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Hello World!").append(request.getContextPath());
		request.setAttribute("city", "pune");
		RequestDispatcher dispatcher=request.getRequestDispatcher("/show.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String srch=request.getParameter("srchString");
		request.setAttribute("city", "pune");
		List<Book> bookList=service.searchBook(srch);
		request.setAttribute("srch",bookList);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/show.jsp");
		dispatcher.forward(request, response);
	}

}

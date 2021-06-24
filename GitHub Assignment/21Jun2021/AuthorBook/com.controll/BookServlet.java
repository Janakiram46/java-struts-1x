package com.AuthorBook;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet.do")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("Authorlist", AuthorDAO.getAuthorList());
	    request.setAttribute("bookList", AuthorDAO.getBook());
		RequestDispatcher rd=request.getRequestDispatcher("Book.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 int bookid =	Integer.parseInt(request.getParameter("bookid"));
		   String bookname = request.getParameter("bookname");
		   int bookprice=Integer.parseInt(request.getParameter("bookprice"));
		   int authorid=Integer.parseInt(request.getParameter("authorId"));
		   int bookpages=Integer.parseInt(request.getParameter("bookpages"));
		   
		 

		   Book b=new Book(bookid,bookname,bookprice,authorid,bookpages);
		   if(AuthorDAO.insert(b))
			   response.sendRedirect("BookServlet.do");
		   else
			   response.getWriter().print("Something went wrong check log");
	}

}

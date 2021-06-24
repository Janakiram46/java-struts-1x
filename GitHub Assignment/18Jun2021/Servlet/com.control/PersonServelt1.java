package com.firstServelt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PersonServelt1
 */
@WebServlet("/PersonServelt1.do")
public class PersonServelt1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServelt1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 HttpSession session=request.getSession();
		    ServletContext application=getServletContext();
		    
		    Integer scount=(Integer)session.getAttribute("count");
		    Integer acount=(Integer)application.getAttribute("count");
		    
		    if(scount==null)
		    	session.setAttribute("count", 1);
		    else
		    	session.setAttribute("count",scount+1);
		    
		    if(acount==null)
		    	application.setAttribute("count", 1);
		    else
		    	application.setAttribute("count",acount+1);
		    
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("peoplelist", PersonDAO.getPeople());
		RequestDispatcher rd=request.getRequestDispatcher("Jstltag.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 int id =	Integer.parseInt(request.getParameter("id"));
		   String name = request.getParameter("name");
		   String mobileno=request.getParameter("mobileno");
		   String city=request.getParameter("city");
		  

		   Person p=new Person(id,name,mobileno,city);
		   if(PersonDAO.insert(p))
			   response.sendRedirect("PersonServelt1.do");
		   else
			   response.getWriter().print("Something went wrong check log");
		}
	

}


package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("nm");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("welcome "+name);
		out.println("<a href='servlet2?user="+name+"'>click</a>");
		out.println("<form action='servlet2'>");
		out.println("<input type='hidden' value="+name+" name='user'>");
		out.println("<button>submit</button>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}

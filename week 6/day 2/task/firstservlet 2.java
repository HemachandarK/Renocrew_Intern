package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class firstservlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String em=req.getParameter("em");
		 String ps=req.getParameter("ps");
		 resp.setContentType("text/html");
		 PrintWriter out=resp.getWriter();
		 RequestDispatcher rd;
		 if("hems@gmail.com".equals(em)&&"hem123".equals(ps)) {
			 rd=req.getRequestDispatcher("/servlet2");
			 rd.forward(req, resp);
			 //resp.sendRedirect("servlet2");
		 }
		 else {
			 rd=req.getRequestDispatcher("/index.html");
			 out.println("<h4>invalid Credentials</h4>");
		 }
	}

}

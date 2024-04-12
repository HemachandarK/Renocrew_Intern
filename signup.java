package com.servlets;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    String name=request.getParameter("un");
	    String pass=request.getParameter("ps");
	    String email=request.getParameter("em");
	    
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hems","root","hemsmysql3");
	        String q="insert into register(username,password,email) values(?,?,?)";
	        PreparedStatement ps=con.prepareStatement(q);
	        ps.setString(1,name);
	        ps.setString(2, pass);
	        ps.setString(3, email);
	        ps.executeUpdate();
	        out.println("<h2>Registered Successfully</h2>");
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	        out.println("<h2>Error...</h2>");
	    }
	}


}

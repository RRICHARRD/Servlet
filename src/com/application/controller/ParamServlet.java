package com.application.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		final PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>DD params read:</title></head");
		out.println("<body>");
		out.println("<h1>Params read:</h1>");
		out.println("<h3>User: </h3>" + getServletContext().getInitParameter("user"));
		out.println("<h3>Password: </h3>" + getServletContext().getInitParameter("password"));
		out.println("<h3>Student name: </h3>" + getServletConfig().getInitParameter("name"));
		out.println("<h3>Email: </h3>" + getServletConfig().getInitParameter("email"));
		out.println("<body>");
		out.println("</html>");
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}

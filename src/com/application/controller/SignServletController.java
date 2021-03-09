package com.application.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignServletController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		final PrintWriter out = response.getWriter();
	
		out.println("<html>");
		out.println("<head>");
		out.println("<title> </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Sign Servelet </h2>");
		out.println("<a href=\"/servlets/indexView.html\">Jump to indexView.html </a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}

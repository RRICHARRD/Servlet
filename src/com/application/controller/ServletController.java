package com.application.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletController", urlPatterns = "/servletController")
public class ServletController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>[SERVLET] - indexView.html</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>html page with link to servlet</h1>");
		out.println("<a href=\"/servlet/indexView.html\">jump to indexView.html</a>");
		out.println("</body>");
		out.println("</html>");
		out.println("Servlet functioning");
		out.close();
	}
	
}

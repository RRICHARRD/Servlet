package com.application.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletController", urlPatterns = "/servlet-controller")
public class ServletController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if (request.getCharacterEncoding() == null) {
		    request.setCharacterEncoding("UTF-8");
		}
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Succesfully!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Succesfully sign!</h1>");
		out.println("<h4>Name:</h4> " + request.getParameter("name"));
		out.println("<h4>E-mail:</h4> " + request.getParameter("email"));
		out.println("<h4>Do you want to receive ower newsletter?:</h4> " + 
				request.getParameter("newsletter"));
		out.println("<h4>Work position:</h4> " + 
				request.getParameter("position"));
		out.println("<h4>Impressions:</h4> \n" + request.getParameter("impressions"));
		out.println("<body>");
		out.println("</html>");
		out.close();
	}

}

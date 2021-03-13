package com.application.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ForwardServlet", urlPatterns = "/forward")
public class ForwardServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		while (request.getParameter("key") == null) {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Forward!</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Input some key in URL</h1>");
			out.println("<body>");
			out.println("</html>");
			out.close();
		}
		
		Integer URLParam_key = Integer.parseInt(request.getParameter("key"));			
		
		if (URLParam_key == 1) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("params");
			dispatcher.forward(request, response);
		} else if (URLParam_key == 2) {
			response.sendRedirect("http://www.linkedin.com");
		} else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Forward Error!</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Invalid param!</h1>");
			out.println("<body>");
			out.println("</html>");
			out.close();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}
}

package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method.");
		PrintWriter out = response.getWriter();
		
//		out.println(
//		"<!DOCTYPE html>" + 
//		"<html>" +
//			"<head>" +
//				"<meta charset=\"UTF-8\">" +
//				"<title>Simple Web Application</title>" +
//			"</head>" +
//			"<body>" +
//				"<h3>hello in html</h3>" +
//			"</body>" +
//		"</html>");
		
		out.println(
		"<!DOCTYPE html>" + 	
		"<h3>hello in html</h3>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}

package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServletXML extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method.");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>This is a test to get</h3>");
		String name = request.getParameter("userName");
		out.println("Hello " + name + "!");
		HttpSession session = request.getSession();
		session.setAttribute("savedUserName", name);
		
		out.println("Session parameter has username as: " + (String) session.getAttribute("savedUserName"));
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from POST method.");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>This is a test to get</h3>");
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String prof = request.getParameter("prof");
		String location = request.getParameter("location");
		out.println("Hello from POST method " + userName + "! We know your full name is " + fullName + "<br>");
		out.println("You are a " + prof + "<br>");
		out.println("You are at " + location + "<br>");
	}
}

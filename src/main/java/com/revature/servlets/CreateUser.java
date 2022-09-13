package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CreateUser extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String username = String.valueOf(request.getParameter("userName"));
		String password = String.valueOf(request.getParameter("password"));
		String email = String.valueOf(request.getParameter("email"));
	
		
		System.out.println("Result : " + username + " + " + password + " = " + email);
	
		PrintWriter out = response.getWriter();
		
		
		out.println("Result : " + username + " + " + password + " + " + email);
	}
	
}

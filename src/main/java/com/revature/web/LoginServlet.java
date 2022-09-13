package com.revature.web;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	private final String userID="admin";
	private final String pass="password";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("userName");
		String password = request.getParameter("userPass");
		
		if(username.equals(userID) && password.equals(pass)) {
			RequestDispatcher rD = request.getRequestDispatcher("welcome");
			
			//Session Handling
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			//set max time for session
			session.setMaxInactiveInterval(30*60);
			
			Cookie userName = new Cookie("user", username);
			userName.setMaxAge(30*60);
			response.addCookie(userName);
			
			rD.forward(request, response);
		} else {
			System.out.println("Failed Login");
			out.println("Username or Password is incorrect");
			RequestDispatcher rD = request.getRequestDispatcher("login.html");
			rD.include(request,response);
		}
	}
}

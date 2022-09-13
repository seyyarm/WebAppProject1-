package com.revature.web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//add JSESSION verification here
		
		response.sendRedirect("welcome.html");
		response.setContentType("text/html");
			
	}
}

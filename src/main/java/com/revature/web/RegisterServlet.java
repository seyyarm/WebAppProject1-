package com.revature.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.revature.dao.UserDao;
import com.revature.models.User;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	private UserDao userDao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		User insertUser = new User(username,password,email);
		//insertUser.setUsername(username);
		//insertUser.setPassword(password);
		//insertUser.setEmail(email);
		System.out.println(insertUser);
		
			
			try {
				
					userDao.createUser(insertUser);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		RequestDispatcher rD = request.getRequestDispatcher("welcome");
		rD.forward(request, response);
	}

}

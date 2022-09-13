package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.RoutesDao;

@WebServlet("/routes")
public class RoutesServlet {

	private final String rName ="Open Mouths";
	private final int rId =1;
	RoutesDao routesDao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String routeName = request.getParameter("routeName");
		int routeId = Integer.parseInt(request.getParameter("routeID"));
		
		//ORM
		//routesDao.searchRoute(routeName);
		//routesDao.searchRoute(routeId);
		
		//Stub
		out.println("Result = " + rName);
		out.println("Result = " + rId);
		
	}
}

package com.revature.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.LocationsDao;
import com.revature.models.Locations;

@WebServlet("/location")
public class LocationsServlet extends HttpServlet{
	
	private final int locId = 1;
	private final String locName = "The Cirque";
	LocationsDao locDao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		int locationId = Integer.parseInt(request.getParameter("locationId"));
		String locationName = request.getParameter("locationName");
		
		//ORM
		//locDao.searchLocationById(locationId);
		//locDao.searchLocationByName(locationName);
		
		//Stub
		out.println("Result = " + locId);
		out.println("Result = " +locName);
		
	}
	

}

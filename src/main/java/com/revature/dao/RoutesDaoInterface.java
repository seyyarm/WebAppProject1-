package com.revature.dao;

import java.util.Set;

import com.revature.models.Routes;

public interface RoutesDaoInterface {

	//CRUD
	//Create a route
	void createRoute(Routes routes);
	
	//Search for a route by name
	Routes searchRoute(String routeName);
	Routes searchRoute(int routeId);
	
	//Display all routes
	Set<Routes> displayAll();
	
	//Update route 
	void updateRoute(Routes routes, int routeId);
	
	//Delete route
	void deleteRoute(Routes routes);
}

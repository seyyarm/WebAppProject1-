package com.revature.dao;

import com.revature.models.Locations;

public interface LocationsDaoInterface {

	//CRUD
	//Create a location
	void createLocation();
	
	//(Read)Search for a location by ID
	Locations searchLocationById(int location_id);
	
	//Search for a location by name
	Locations searchLocationByName(String location_name);
	
	//Update a location
	void updateLocation();
	
	//Delete a location
	void deleteLocation();
}

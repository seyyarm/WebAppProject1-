package com.revature.models;

public class Routes {

	private int routeId;
	private String routeName;
	private int locationId;
	private int difficulty;
	private int length;
	
	
	public Routes(String routeName, int locationId, int difficulty, int length) {
		super();
		this.routeName = routeName;
		this.locationId = locationId;
		this.difficulty = difficulty;
		this.length = length;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
}

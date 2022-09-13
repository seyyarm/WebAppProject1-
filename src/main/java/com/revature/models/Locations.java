package com.revature.models;

public class Locations {

	int location_id;
	String location_name;
	
	public Locations(String location_name) {
		super();
		this.location_name = location_name;
	}
	public Locations(int location_id) {
		super();
		this.location_id = location_id;
	}
	public Locations(int location_id, String location_name) {
		super();
		this.location_id = location_id;
		this.location_name = location_name;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	
	
}

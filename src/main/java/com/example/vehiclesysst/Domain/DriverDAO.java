package com.example.vehiclesysst.Domain;

public class DriverDAO {
	private Long id;
	private String drname;
	 
	private String registration_plate;
	 
	public Long getId() {
	return id;
	}
	 
	public void setId(Long id) {
	this.id = id;
	}
	 
	public String getDrname() {
	return drname;
	}
	 
	public void setDrname(String drname) {
	this.drname = drname;
	}
	 
	public String getRegistration_plate() {
	return registration_plate;
	}
	 
	public void setRegistration_plate(String registration_plate) {
	this.registration_plate = registration_plate;
	}
}

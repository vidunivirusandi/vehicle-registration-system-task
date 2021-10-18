package com.example.vehiclesysst.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String registration_plate;
	private int duration;
	
	public Registration() {
		  
	}
	
	
	
	
	
	
	public Registration(Long id, String registration_plate, int duration) {
		 
		this.id = id;
		this.registration_plate = registration_plate;
		this.duration = duration;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRegistration_plate() {
		return registration_plate;
	}
	public void setRegistration_plate(String registration_plate) {
		this.registration_plate = registration_plate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}






	@Override
	public String toString() {
		return "Registration [id=" + id + ", registration_plate=" + registration_plate + ", duration=" + duration + "]";
	}
	
	
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

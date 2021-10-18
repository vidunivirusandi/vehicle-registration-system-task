package com.example.vehiclesysst.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="driver")
public class Driver {
	 @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String drname;
		private String registration;
		
		private int fee;

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

		public String getRegistration() {
			return registration;
		}

		public void setRegistration(String registration) {
			this.registration = registration;
		}

		public int getFee() {
			return fee;
		}

		public void setFee(int fee) {
			this.fee = fee;
		}
		 
}

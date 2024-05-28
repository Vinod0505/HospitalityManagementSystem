package com.internshala.hms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guestId;
	private String firstName;
	private String lastName;
	private String address;
	private long contactNumber;
	private String email;
	
}

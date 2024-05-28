package com.internshala.hms.entity;

import java.time.LocalDate;

import com.internshala.hms.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservationId;
	private LocalDate check_In_Date;
	private LocalDate check_out_Date;
	private Status status;
}

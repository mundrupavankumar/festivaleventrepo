package com.festival.Festivalportal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long RegistrationId;
	@ManyToOne
	@JoinColumn(name="eventid",nullable = false)
	private EventData event;
	@ManyToOne
	@JoinColumn(name="userid",nullable = false)
	private UserData user;
	
	

}

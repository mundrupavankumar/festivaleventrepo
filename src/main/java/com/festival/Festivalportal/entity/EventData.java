package com.festival.Festivalportal.entity;

import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventData {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eventid;
	private String name;
	private long fee;
	private LocalDate eventdate;
	private LocalTime eventtime;
	private LocalDate lastDate;
	private int totalParticipents;
	
	@OneToMany(mappedBy="event")
	private List<RegistrationData> registration;
	
	
	

}

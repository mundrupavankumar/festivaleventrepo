package com.festival.Festivalportal.dao;

import java.util.List;

import com.festival.Festivalportal.entity.EventData;
import com.festival.Festivalportal.entity.RegistrationData;
import com.festival.Festivalportal.entity.UserData;

public interface Dao {

	List<EventData> getEvents();
	EventData getEvent(Long id);
	long saveEvent(EventData event);
	EventData updateEvent(EventData event);
	void deleteEvent(EventData event);
	
	List<UserData> getUsers();
	UserData getUser(Long id);
	UserData getUser(String username,String password);
	long saveUser(UserData user);
	UserData updateUser(UserData user);
	void deleteUser(UserData user);
	
	
	List<RegistrationData> getRegistrations();
	RegistrationData getRegistration(Long id);
	long registerevent(RegistrationData registration);
	RegistrationData updateRegistration(RegistrationData registration);
	void deleteRegistration(RegistrationData registration);
	
	
}

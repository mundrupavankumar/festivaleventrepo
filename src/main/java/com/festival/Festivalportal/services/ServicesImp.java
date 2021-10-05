package com.festival.Festivalportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.festival.Festivalportal.dao.Dao;
import com.festival.Festivalportal.entity.EventData;
import com.festival.Festivalportal.entity.RegistrationData;
import com.festival.Festivalportal.entity.UserData;

@Service
public class ServicesImp implements Services{

	@Autowired
	Dao dao;
	
	@Override
	public long saveEvent(EventData event) {
		
		return dao.saveEvent(event);
	}

	@Override
	public EventData updateEvent(EventData event) {
		return dao.updateEvent(event);
	}

	@Override
	public void deleteEvent(EventData event) {
		dao.deleteEvent(event);
		
	}
	

	@Override
	public List<EventData> getEvents() {
		// TODO Auto-generated method stub
		return dao.getEvents();
	}

	@Override
	public EventData getEvent(Long id) {
		// TODO Auto-generated method stub
		return dao.getEvent(id);
	}

	@Override
	public long saveUser(UserData user) {
	
		return dao.saveUser(user);
	}

	@Override
	public UserData updateUser(UserData user) {
		// TODO Auto-generated method stub
		return dao.updateUser(user);
	}

	@Override
	public void deleteUser(UserData user) {
		// TODO Auto-generated method stub
		dao.deleteUser(user);
		
	}
	
	@Override
	public List<UserData> getUsers() {
		// TODO Auto-generated method stub
		return dao.getUsers();
	}

	@Override
	public UserData getUser(Long id) {
		// TODO Auto-generated method stub
		return dao.getUser(id);
	}

	@Override
	public UserData getUser(String username, String password) {
		// TODO Auto-generated method stub
		return dao.getUser(username,password);
	}

	@Override
	public long registerevent(RegistrationData registration) {
		// TODO Auto-generated method stub
		return dao.registerevent(registration);
	}

	@Override
	public RegistrationData updateRegistration(RegistrationData registration) {
		// TODO Auto-generated method stub
		return dao.updateRegistration(registration);
	}

	@Override
	public void deleteRegistration(RegistrationData registration) {
		dao.deleteRegistration(registration);
		
	}

	@Override
	public List<RegistrationData> getRegistrations() {
		// TODO Auto-generated method stub
		return dao.getRegistrations();
	}

	@Override
	public RegistrationData getRegistration(Long id) {
		// TODO Auto-generated method stub
		return dao.getRegistration(id);
	}
	

}

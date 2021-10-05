package com.festival.Festivalportal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.festival.Festivalportal.entity.EventData;
import com.festival.Festivalportal.entity.RegistrationData;
import com.festival.Festivalportal.entity.UserData;
import com.festival.Festivalportal.repository.EventRepository;
import com.festival.Festivalportal.repository.RegistrationRepo;
import com.festival.Festivalportal.repository.UserRepo;


@Repository
public class DaoImp implements Dao{
	
	@Autowired
	EventRepository eventRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	RegistrationRepo registerRepo;

	@Override
	public long saveEvent(EventData event) {
		
		return eventRepo.save(event).getEventid();
	}

	@Override
	public EventData updateEvent(EventData event) {
		return eventRepo.save(event);
	}

	@Override
	public void deleteEvent(EventData event) {
		eventRepo.delete(event);
		
	}
	

	@Override
	public List<EventData> getEvents() {
		// TODO Auto-generated method stub
		return eventRepo.findAll();
	}

	@Override
	public EventData getEvent(Long id) {
		// TODO Auto-generated method stub
		return eventRepo.getById(id);
	}

	@Override
	public long saveUser(UserData user) {
	
		return userRepo.save(user).getUserId();
	}

	@Override
	public UserData updateUser(UserData user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(UserData user) {
		// TODO Auto-generated method stub
		userRepo.delete(user);
		
	}
	
	@Override
	public List<UserData> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public UserData getUser(Long id) {
		// TODO Auto-generated method stub
		return userRepo.getById(id);
	}

	@Override
	public UserData getUser(String username, String password) {
		// TODO Auto-generated method stub
//		return null;
		return userRepo.getUser(username,password);
	}

	@Override
	public long registerevent(RegistrationData registration) {
		// TODO Auto-generated method stub
		return registerRepo.save(registration).getRegistrationId();
	}

	@Override
	public RegistrationData updateRegistration(RegistrationData registration) {
		// TODO Auto-generated method stub
		return registerRepo.save(registration);
	}

	@Override
	public void deleteRegistration(RegistrationData registration) {
		registerRepo.delete(registration);
		
	}

	@Override
	public List<RegistrationData> getRegistrations() {
		// TODO Auto-generated method stub
		return registerRepo.findAll();
	}

	@Override
	public RegistrationData getRegistration(Long id) {
		// TODO Auto-generated method stub
		return registerRepo.getById(id);
	}
	

}

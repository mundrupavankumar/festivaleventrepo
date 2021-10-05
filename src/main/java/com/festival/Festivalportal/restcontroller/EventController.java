package com.festival.Festivalportal.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.festival.Festivalportal.entity.EventData;
import com.festival.Festivalportal.entity.RegistrationData;
import com.festival.Festivalportal.services.Services;
@RestController
public class EventController {
	@Autowired
	private Services service;
	
	
	
	@RequestMapping(value="/event", method = RequestMethod.POST)
	public ResponseEntity<Long> createEvent(@RequestBody EventData eventdata){
		return new ResponseEntity<Long>(service.saveEvent(eventdata), HttpStatus.OK);
	}
	
	@RequestMapping(value="/event", method = RequestMethod.GET)
	public ResponseEntity<List<EventData>> getEvents(){
		return new ResponseEntity<List<EventData>>(service.getEvents(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/event/{id}", method = RequestMethod.GET)
	public ResponseEntity<EventData> getEvent(@PathVariable long id){
		return new ResponseEntity<EventData>(service.getEvent(id), HttpStatus.OK);
	}
	
	@RequestMapping(value="/event", method = RequestMethod.PUT)
	public ResponseEntity<EventData> updateEvent(@RequestBody EventData eventdata){
		return new ResponseEntity<EventData>(service.updateEvent(eventdata), HttpStatus.OK);
	}
	
	@RequestMapping(value="/event", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteEvent(@RequestBody EventData eventdata){
		service.deleteEvent(eventdata);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

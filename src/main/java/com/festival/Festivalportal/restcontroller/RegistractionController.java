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

import com.festival.Festivalportal.entity.RegistrationData;
import com.festival.Festivalportal.services.Services;

@RestController
public class RegistractionController {

	@Autowired
	private Services service;
	
	
	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public ResponseEntity<Long> createregistration(@RequestBody RegistrationData RegistrationData){
		return new ResponseEntity<Long>(service.registerevent(RegistrationData), HttpStatus.OK);
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public ResponseEntity<List<RegistrationData>> getregistrations(){
		return new ResponseEntity<List<RegistrationData>>(service.getRegistrations(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/registration/{id}", method = RequestMethod.GET)
	public ResponseEntity<RegistrationData> getregistration(@PathVariable long id){
		return new ResponseEntity<RegistrationData>(service.getRegistration(id), HttpStatus.OK);
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.PUT)
	public ResponseEntity<RegistrationData> updateregistration(@RequestBody RegistrationData RegistrationData){
		return new ResponseEntity<RegistrationData>(service.updateRegistration(RegistrationData), HttpStatus.OK);
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteregistration(@RequestBody RegistrationData RegistrationData){
		service.deleteRegistration(RegistrationData);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
}

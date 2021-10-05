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

import com.festival.Festivalportal.entity.UserData;
import com.festival.Festivalportal.services.Services;

@RestController
public class UserController {
	
	@Autowired
	private Services service;

	@RequestMapping(value="/user", method = RequestMethod.POST)
	public ResponseEntity<Long> createuser(@RequestBody UserData userdata){
		return new ResponseEntity<Long>(service.saveUser(userdata), HttpStatus.OK);
	}
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public ResponseEntity<List<UserData>> getusers(){
		return new ResponseEntity<List<UserData>>(service.getUsers(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserData> getuser(@PathVariable long id){
		return new ResponseEntity<UserData>(service.getUser(id), HttpStatus.OK);
	}
	
	@RequestMapping(value="/user", method = RequestMethod.PUT)
	public ResponseEntity<UserData> updateuser(@RequestBody UserData userdata){
		return new ResponseEntity<UserData>(service.updateUser(userdata), HttpStatus.OK);
	}
	
	@RequestMapping(value="/user", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteuser(@RequestBody UserData userdata){
		service.deleteUser(userdata);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
	}
}

package com.mongo.embedded.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.embedded.model.User;
import com.mongo.embedded.service.FnpService;

@RestController
@RequestMapping("/fnp")
public class FnpController {
	
	@Autowired
	private FnpService fnpService;
	
	@PostMapping("/addUser")
	public String createFnpUser(@RequestBody User user) {
		
		fnpService.save(user);
		return "user created";
	}
	
	@GetMapping("/getUserByName/{name}")
	public List<User> getUserByName(@PathVariable String name){
		
		return fnpService.findByName(name);
	}
	
	@GetMapping("/getUserByAddress/{city}")
	public List<User> getUserByAddress(@PathVariable String city){
		
		return fnpService.findByCity(city);
	}

}

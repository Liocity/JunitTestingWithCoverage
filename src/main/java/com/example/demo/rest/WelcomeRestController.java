package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WelcomeService;

@RestController
public class WelcomeRestController {
	@Autowired
	private WelcomeService service;
	@GetMapping("/welcome")
	public ResponseEntity<String>  getWelcomeMsg()
	{
		String msg = service.getmsg();
		String msg1=msg.toUpperCase();
		return new ResponseEntity<String>(msg1,HttpStatus.OK);
	}

}

package com.tcs.security.jwtsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mns/hello")
public class NotJWTClass {
	
	@GetMapping
	public String hello()
	{
		return "Hello M&S Users";
	}
}

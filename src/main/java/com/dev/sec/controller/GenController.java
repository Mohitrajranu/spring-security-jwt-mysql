package com.dev.sec.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin( origins = "*" )
@RestController
@RequestMapping("/api")
public class GenController {

	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public String forUser() {

		return "welcome user";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String forAdmin() {

		return "welcome admin";
	}
	
	

}

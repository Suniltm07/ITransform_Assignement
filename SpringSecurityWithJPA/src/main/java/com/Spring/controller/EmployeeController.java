package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/")
	public String employees() {
		return ("<h1>Welcome TO Application</h1>");	
	}
	
	@GetMapping("/user")
	public String EmployeeUser() {
		return ("<h1> Welcome Employee</h1>");
	}
	
	@GetMapping("/admin")
	public String Admin() {
		return ("<h1> Welcome Admin </h1>");
	}

}

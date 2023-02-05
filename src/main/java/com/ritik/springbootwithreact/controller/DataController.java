package com.ritik.springbootwithreact.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@GetMapping("/api/employee")
	public String employeeDetails() {
		return "employee1, employee2";
	}

}

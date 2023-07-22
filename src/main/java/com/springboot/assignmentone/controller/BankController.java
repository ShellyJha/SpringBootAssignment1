package com.springboot.assignmentone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@GetMapping("/getBankName/{name}")
	public String getBankName(@PathVariable("name") String name) {

		return "Bank Name is " + name.toUpperCase() + "BANK";
	}
	
	
	@GetMapping("/getBankAddress/{name}")
	public String getBankAddress(@PathVariable("name") String name) {
		
		return "The Address of Bank  "+name+": Bangalore";
		}
	}



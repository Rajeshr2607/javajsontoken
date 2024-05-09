package com.example.jwt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/home")
@RestController
public class HomeController {
	
	
	
	@GetMapping("/getdata")
	public String getData() {
		return "hi rajesh";
	}

}

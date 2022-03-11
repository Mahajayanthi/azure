package com.example.azure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hellocontroller {
	@RequestMapping("/api")	
 public String hello()
 {
	 return "Hello controller";
	 
 }
}

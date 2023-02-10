package com.innojc.demosaru;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	
	@GetMapping("/")
	public String home( ) {
		return "Welcome to daily code buffer";
	}
	@PostMapping("/")
	public String hello() {
		return "successfully updated";
	}

}

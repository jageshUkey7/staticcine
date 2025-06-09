package com.cinetry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CinetryApplication {
	
	@GetMapping("/test")
	public String msg()
	{
		return "sucees,u deployed over azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(CinetryApplication.class, args);
	}

}

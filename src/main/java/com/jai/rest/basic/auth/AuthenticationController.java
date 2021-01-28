package com.jai.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AuthenticationController {

	@GetMapping(path = "/basicauth")
	public AuthenticationBean authenticationBean() {

		// throw new RuntimeException("Some error has happened.");
		return new AuthenticationBean("Authentication successful,you may enter!");
	}

}
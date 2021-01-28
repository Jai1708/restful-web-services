package com.jai.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoderTest {

	public static void main(String[] args) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		for (int i = 1; i <= 10; i++) {
			String encodedString = encoder.encode("Purohit@280922!7");
		System.out.println(encodedString);
		}
	}
}

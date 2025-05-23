package com.api.remmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemmemberApplication {

	public static void main(String[] args) {
		System.out.println(">>>>> PORT: " + System.getenv("PORT"));
		SpringApplication.run(RemmemberApplication.class, args);
	}

}

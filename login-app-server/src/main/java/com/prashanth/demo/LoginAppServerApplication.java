package com.prashanth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = { 
		LoginAppServerApplication.class
})
public class LoginAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginAppServerApplication.class, args);
	}
}

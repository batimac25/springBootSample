package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoTutorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTutorApplication.class, args);
	}

 @RestController
  class HelloWorldController {
	  @GetMapping("/hello")
	  public String hello() {
	    return "hello world!";
	  }	
	
}
}

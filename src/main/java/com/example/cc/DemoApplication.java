package com.example.cc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.cc.controller.UserService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {UserService.class})  
        
         // OR

@ComponentScan(basePackages= "com.example.cc")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
	}

}

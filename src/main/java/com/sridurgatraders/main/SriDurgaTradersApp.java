package com.sridurgatraders.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SriDurgaTradersApp extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SriDurgaTradersApp.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SriDurgaTradersApp.class, args);
	}

}
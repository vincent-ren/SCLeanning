package com.scleanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConfigurationDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationDemoApplication.class, args);
	}

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(ConfigurationDemoApplication.class);
	}

}

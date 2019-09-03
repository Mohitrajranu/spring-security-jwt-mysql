package com.dev.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages= {"com.dev.sec.*"})
public class SSecApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SSecApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
    	return application.sources(SSecApplication.class);
    }

}

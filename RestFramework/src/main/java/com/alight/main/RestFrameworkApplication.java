package com.alight.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFrameworkApplication.class, args);
	}

	
	@Bean
	public RestTemplate rtemplate()
	{
		RestTemplate rt=new RestTemplate();
		return rt;
	}
	
}

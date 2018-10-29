package com.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans(value= { @ComponentScan("com.app.controller"),
		@ComponentScan("com.app.service")})
@EntityScan("com.app.model")
@EnableJpaRepositories("com.app.dao")
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

}

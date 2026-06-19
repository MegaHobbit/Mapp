package com.example.mapp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@OpenAPIDefinition(
		info = @Info(
				title = "Mapp Match API",
				version = "1.0",
				description = "API for ....",
				contact = @Contact(name = "Mapp Development Team")
		)
)
public class MappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappApplication.class, args);
	}

}
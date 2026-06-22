package com.example.mapp;

import com.example.mapp.Models.Inventory;
import com.example.mapp.Repositories.InventoryRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@OpenAPIDefinition(
		info = @Info(
				title = "Mapp Match API",
				version = "1.0",
				description = "API for hjjkkk....",
				contact = @Contact(name = "Mapp Development Team")
		)
)
public class MappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {

			Inventory inventory = new Inventory();
			inventory.setSkuCode("Iphone_13");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory.setSkuCode("Iphone_13_red");
			inventory.setQuantity(0);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};


	}
}
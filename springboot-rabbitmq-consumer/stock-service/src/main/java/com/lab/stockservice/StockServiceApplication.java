package com.lab.stockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockServiceApplication {
	// Stock Service going to read Order event from RabbitMQ

	public static void main(String[] args) {
		SpringApplication.run(StockServiceApplication.class, args);
	}

}

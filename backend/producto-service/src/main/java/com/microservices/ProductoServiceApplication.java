package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.microservices.client")  // 👈 NECESARIO
public class ProductoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductoServiceApplication.class, args);
	}

}

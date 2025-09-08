package com.example.crud_clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.crud_clientes")

public class CrudClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudClientesApplication.class, args);
	}

}

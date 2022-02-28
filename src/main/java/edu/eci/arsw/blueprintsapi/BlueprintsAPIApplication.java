package edu.eci.arsw.blueprintsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import edu.eci.arsw.blueprints.services.BlueprintsServices;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw"})
public class BlueprintsAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlueprintsServices.class, args);
	}
}

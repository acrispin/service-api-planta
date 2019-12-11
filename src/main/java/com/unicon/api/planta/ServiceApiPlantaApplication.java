package com.unicon.api.planta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceApiPlantaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApiPlantaApplication.class, args);
	}

}

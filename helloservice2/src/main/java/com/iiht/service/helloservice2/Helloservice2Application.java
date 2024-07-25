package com.iiht.service.helloservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Helloservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Helloservice2Application.class, args);
	}

}

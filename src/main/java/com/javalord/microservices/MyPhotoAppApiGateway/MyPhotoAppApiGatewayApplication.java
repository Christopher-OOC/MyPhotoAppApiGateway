package com.javalord.microservices.MyPhotoAppApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MyPhotoAppApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPhotoAppApiGatewayApplication.class, args);
	}

}

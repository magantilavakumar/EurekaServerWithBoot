package com.boot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerWithBootApplication {

	static {
		System.out.println("Eureka Server");
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerWithBootApplication.class, args);
	}

}

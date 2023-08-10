package com.springboot.eureka.amazon.provider.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AmazonPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonPaymentServiceApplication.class, args);
	}

}

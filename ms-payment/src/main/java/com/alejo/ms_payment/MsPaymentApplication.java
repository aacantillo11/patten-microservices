package com.alejo.ms_payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPaymentApplication.class, args);
	}

}

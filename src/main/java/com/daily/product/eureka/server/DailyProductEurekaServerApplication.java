package com.daily.product.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DailyProductEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyProductEurekaServerApplication.class, args);
	}

}

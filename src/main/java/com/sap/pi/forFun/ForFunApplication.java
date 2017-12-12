package com.sap.pi.forFun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.sap.pi")
public class ForFunApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForFunApplication.class, args);
	}
}

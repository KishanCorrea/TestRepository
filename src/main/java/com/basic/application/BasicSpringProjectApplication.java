package com.basic.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.basic.*")
@EntityScan(basePackages = "com.basic.*")
@EnableJpaRepositories(basePackages = "com.basic.repository")
public class BasicSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringProjectApplication.class, args);
	}

}

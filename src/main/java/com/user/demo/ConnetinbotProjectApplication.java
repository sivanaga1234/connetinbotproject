package com.user.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.user.demo" })
@EnableJpaRepositories
public class ConnetinbotProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnetinbotProjectApplication.class, args);
	}
}

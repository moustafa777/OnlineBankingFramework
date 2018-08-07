package com.mum.asd.OnlineBankingFramework;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.mum.asd.OnlineBankingFramework"})// same as @Configuration @EnableAutoConfiguration @ComponentScan

public class OnlineBankingFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBankingFrameworkApplication.class, args);
	}
	
}

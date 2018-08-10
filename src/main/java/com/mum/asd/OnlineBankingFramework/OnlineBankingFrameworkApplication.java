package com.mum.asd.OnlineBankingFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.mum.asd.OnlineBankingFramework.dao.DAOImpl;
import com.mum.asd.data.daoimpl.FactoryDAO;

//@SpringBootApplication(scanBasePackages={"com.mum.asd.OnlineBankingFramework"})// same as @Configuration @EnableAutoConfiguration @ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class OnlineBankingFrameworkApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(OnlineBankingFrameworkApplication.class, args);

		// Provide data access implementation for framework
		DAOImpl.setUserDAO(FactoryDAO.getUserDAO());
		DAOImpl.setAccountDAO(FactoryDAO.getAccountDAO());
	}

}

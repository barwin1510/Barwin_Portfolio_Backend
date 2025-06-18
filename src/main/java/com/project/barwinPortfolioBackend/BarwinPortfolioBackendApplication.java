package com.project.barwinPortfolioBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class BarwinPortfolioBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarwinPortfolioBackendApplication.class, args);
	}

}

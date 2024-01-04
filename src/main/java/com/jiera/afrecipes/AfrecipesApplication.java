package com.jiera.afrecipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class AfrecipesApplication {
	private static final int STRENGTH = 12;

	public static void main(String[] args) {
		SpringApplication.run(AfrecipesApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder(STRENGTH);
	}
}

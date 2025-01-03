package com.example.DepedencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableCaching
public class CacheApplication {


	public static void main(String[] args) {

		SpringApplication.run(CacheApplication.class, args);
	}

}

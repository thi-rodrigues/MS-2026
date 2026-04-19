package com.trsystems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.trsystems.config.GreetingConfig;

@SpringBootApplication
@EnableConfigurationProperties(GreetingConfig.class)
public class TrSistemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrSistemsApplication.class, args);
	}

}

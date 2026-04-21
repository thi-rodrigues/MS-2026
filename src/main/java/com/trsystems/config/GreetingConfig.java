package com.trsystems.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties("greeting-service")
/*@ConfigurationProperties
 *Usado para mapear propriedades do application.yml/properties
 *para objetos Java 
 */
@RefreshScope
/*
 * Atualizar as propriedades apenas fazendo uma requisição para o actuator desse cara
 *  
 */
public class GreetingConfig {
	private String greeting;
	private String defaultValue;

	public GreetingConfig() {
	}

	public GreetingConfig(String greetnig, String defaultValue) {
		this.greeting = greetnig;
		this.defaultValue = defaultValue;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
}

package com.trsystems.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("greeting-service")
/*@ConfigurationProperties
 *Usado para mapear propriedades do application.yml/properties
 *para objetos Java 
 */
public record GreetingConfig (String greetnig, String defaultValue) {}

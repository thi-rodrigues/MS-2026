package com.trsystems.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("greeting-service")
public record GreetingConfig (String greetnig, String defaultValue) {}

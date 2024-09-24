package com.devertelo.payments.application.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.devertelo.payments")
@EntityScan(basePackages = "com.devertelo.payments")
@Configuration
public class JPAConfig {
}
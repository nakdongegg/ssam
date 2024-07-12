package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KurentoConfig {

    @Bean
    public KurentoClient kurentoClient() {
        return KurentoClient.create();
    }
}
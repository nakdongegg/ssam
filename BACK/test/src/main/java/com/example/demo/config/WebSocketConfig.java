package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

import com.example.demo.handler.CallHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new CallHandler(), "/call")
                .setAllowedOrigins("*");
    }
}
package com.example.demo.model;

public class UserSession {
    private final String name;
    private final WebSocketSession session;

    private String sdpOffer;
    private String callingTo;
    private String callingFrom;
    private WebRtcEndpoint webRtcEndpoint;
    private MediaPipeline mediaPipeline;

    public UserSession(String name, WebSocketSession session) {
        this.name = name;
        this.session = session;
    }

    // Getters and setters
}
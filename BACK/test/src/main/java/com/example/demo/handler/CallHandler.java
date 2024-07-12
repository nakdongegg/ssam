package com.example.demo.handler;

@Component
public class CallHandler extends TextWebSocketHandler {

    private static final Logger log = LoggerFactory.getLogger(CallHandler.class);

    private static final Gson gson = new GsonBuilder().create();

    @Autowired
    private KurentoClient kurento;

    private Map<String, UserSession> users = new ConcurrentHashMap<>();

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        JsonObject jsonMessage = gson.fromJson(message.getPayload(), JsonObject.class);

        UserSession user = users.get(session.getId());

        if (user != null) {
            log.debug("Incoming message from user '{}': {}", user.getName(), jsonMessage);
        } else {
            log.debug("Incoming message from new user: {}", jsonMessage);
        }

        switch (jsonMessage.get("id").getAsString()) {
            case "join":
                onJoin(jsonMessage, session);
                break;
            case "offer":
                onOffer(jsonMessage, session);
                break;
            case "answer":
                onAnswer(jsonMessage, session);
                break;
            case "iceCandidate":
                onIceCandidate(jsonMessage, session);
                break;
            case "stop":
                onStop(session);
                break;
            default:
                break;
        }
    }

    private void onJoin(JsonObject jsonMessage, WebSocketSession session) throws IOException {
        // 구현 로직
    }

    private void onOffer(JsonObject jsonMessage, WebSocketSession session) throws IOException {
        // 구현 로직
    }

    private void onAnswer(JsonObject jsonMessage, WebSocketSession session) throws IOException {
        // 구현 로직
    }

    private void onIceCandidate(JsonObject jsonMessage, WebSocketSession session) throws IOException {
        // 구현 로직
    }

    private void onStop(WebSocketSession session) throws IOException {
        // 구현 로직
    }
}
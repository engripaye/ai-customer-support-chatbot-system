package org.engripaye.aicustomersupportchatbotdashboard.config;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ChatWebSocketHandler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception{

        // Handle live chat messages
        String payload = message.getPayload();
        session.sendMessage(new TextMessage("Agent: Received your message - " + payload));
    }
}

package org.engripaye.aicustomersupportchatbotdashboard.service;

import org.engripaye.aicustomersupportchatbotdashboard.model.ChatLog;
import org.engripaye.aicustomersupportchatbotdashboard.repository.ChatLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final AiClient aiClient;
    private final ChatLogRepository chatLogRepository;

    @Autowired
    public ChatService(AiClient aiClient, ChatLogRepository chatLogRepository) {
        this.aiClient = aiClient;
        this.chatLogRepository = chatLogRepository;
    }

    public String getChatResponse(String userId, String message) {

        // Define prompt template
        String prompt = "You are a customer support chatbot, Answer the following query professionally " + message;

        String response = aiClient.generate(prompt);

        // save chat log
        ChatLog chatLog = new ChatLog();
        chatLog.setUserId(userId);
        chatLog.setResponse(response);
        chatLog.setTimestamp(System.currentTimeMillis());
        chatLogRepository.save(chatLog);

        return response;
    }
}

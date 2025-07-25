package org.engripaye.aicustomersupportchatbotdashboard.controller;

import org.engripaye.aicustomersupportchatbotdashboard.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class ChatController {

    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/chat")
    public String handleChat(@RequestBody String message, @AuthenticationPrincipal OAuth2User principal) {
        String userId = principal.getAttribute("sub");

        return chatService.getChatResponse(userId, message);
    }
}

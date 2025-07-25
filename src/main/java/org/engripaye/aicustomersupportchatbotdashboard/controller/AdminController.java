package org.engripaye.aicustomersupportchatbotdashboard.controller;

import org.engripaye.aicustomersupportchatbotdashboard.model.ChatLog;
import org.engripaye.aicustomersupportchatbotdashboard.repository.ChatLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final ChatLogRepository chatLogRepository;

    @Autowired
    public AdminController(ChatLogRepository chatLogRepository) {
        this.chatLogRepository = chatLogRepository;
    }
    @GetMapping("/chatlogs")
    public List<ChatLog> getChatLog(){
        return chatLogRepository.findAll();
    }
}

package org.engripaye.aicustomersupportchatbotdashboard.repository;


import org.engripaye.aicustomersupportchatbotdashboard.model.ChatLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatLogRepository extends MongoRepository<ChatLog, String> {

}

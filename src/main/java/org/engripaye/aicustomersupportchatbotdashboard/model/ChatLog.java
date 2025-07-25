package org.engripaye.aicustomersupportchatbotdashboard.model;

import jakarta.persistence.Id;
import lombok.Data;

import java.lang.annotation.Documented;

@Document(collection = "chat_logs")
@Data
public class ChatLog {

    @Id
    private String id;
    private String userId;
    private String message;
    private String response;
    private Long timestamp;
    private double satisfactionRating;
}

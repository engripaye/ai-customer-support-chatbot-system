package org.engripaye.aicustomersupportchatbotdashboard.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "chat_logs")
@Data
public class ChatLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String message;
    private String response;
    private Long timestamp;
    private double satisfactionRating;
}

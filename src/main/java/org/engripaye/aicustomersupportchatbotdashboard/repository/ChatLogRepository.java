package org.engripaye.aicustomersupportchatbotdashboard.repository;

import org.engripaye.aicustomersupportchatbotdashboard.model.ChatLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatLogRepository extends JpaRepository<ChatLog, Long> {
}

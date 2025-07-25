package org.engripaye.aicustomersupportchatbotdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiCustomerSupportChatbotDashboardApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application-secrets");
        SpringApplication.run(AiCustomerSupportChatbotDashboardApplication.class, args);
    }

}

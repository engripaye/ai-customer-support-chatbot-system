package org.engripaye.aicustomersupportchatbotdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class})
public class AiCustomerSupportChatbotDashboardApplication {

    public static void main(String[] args) {


                SpringApplication.run(AiCustomerSupportChatbotDashboardApplication.class, args);
    }

}

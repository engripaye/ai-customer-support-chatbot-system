package org.engripaye.aicustomersupportchatbotdashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpaController {

    @RequestMapping(value = { "/", "/chat", "/admin", "/oauth-success" })
    public String redirect() {
        return "forward:/index.html";
    }

}

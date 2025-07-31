package org.engripaye.aicustomersupportchatbotdashboard.controller;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/api/user/me")
    public Map<String, Object> user(Principal principal) {
        if (principal instanceof OAuth2User oauthUser) {
            return Map.of(
                    "name", oauthUser.getAttribute("name"),
                    "email", oauthUser.getAttribute("email"),
                    "picture", oauthUser.getAttribute("picture")
            );
        }
        return Map.of("error", "User is not authenticated");
    }
}

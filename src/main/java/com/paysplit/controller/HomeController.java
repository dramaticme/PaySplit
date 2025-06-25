package com.paysplit.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(OAuth2AuthenticationToken authentication) {
        if (authentication != null) {
            Map<String, Object> attributes = authentication.getPrincipal().getAttributes();
            String name = (String) attributes.get("name");
            String email = (String) attributes.get("email");
            String picture = (String) attributes.get("picture");

            return "<html><body style='font-family: sans-serif; text-align:center; padding:30px;'>"
                    + "<h2>✅ Logged in as: " + name + "</h2>"
                    + "<p><strong>Email:</strong> " + email + "</p>"
                    + "<img src='" + picture + "' width='100' style='border-radius:50%; box-shadow: 0 0 5px gray;' /><br/><br/>"
                    + "<a href='/logout' style='padding:10px 20px; background-color:#f44336; color:white; text-decoration:none; border-radius:5px;'>🚪 Logout</a>"
                    + "</body></html>";
        } else {
            return "<html><body style='font-family: sans-serif; text-align:center; padding:30px;'>"
                    + "<h2>👋 Welcome to PaySplit</h2>"
                    + "<p>Please login to continue</p>"
                    + "<a href='/oauth2/authorization/google' style='padding:10px 20px; background-color:#4285F4; color:white; text-decoration:none; border-radius:5px;'>🔐 Login with Google</a>"
                    + "</body></html>";
        }
    }
}

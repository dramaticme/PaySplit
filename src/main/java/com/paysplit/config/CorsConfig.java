package com.paysplit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")      // ✅ Handles wildcard in Spring Boot 3
                .allowedMethods("*")             // ✅ Allow all HTTP methods
                .allowedHeaders("*")             // ✅ Allow all headers
                .allowCredentials(true);         // ✅ Allow cookies (can be false if not needed)
    }
}

package com.paysplit.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("PaySplit API – Secure Bill Splitting App")
                        .version("1.0.0")
                        .description("Professional API documentation for PaySplit...")
                        .contact(new Contact()
                                .name("Sakshi Sonkusare")
                                .email("sonkusaresakshibhojraj@gmail.com")));
    }
}

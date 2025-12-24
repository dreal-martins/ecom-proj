package com.telusko.ecom_proj.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("E-Commerce Product API")
                        .version("1.0")
                        .description("API documentation for E-Commerce Product Management System")
                        .contact(new Contact()
                                .name("Martins")
                                .email("aguegbodomartins@gmail.com")));
    }
}
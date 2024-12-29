package com.projet.docker.controller.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Cette annotation permet à Spring de reconnaître cette classe comme une configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Autorise les requêtes de toutes les routes
                .allowedOrigins("http://localhost:3000", "http://exam.com","http://frontend.local") // Spécifiez explicitement les domaines autorisés
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Méthodes HTTP autorisées
                .allowedHeaders("*") // Autorise tous les headers
                .allowCredentials(true); // Permet l'envoi de cookies
    }
}


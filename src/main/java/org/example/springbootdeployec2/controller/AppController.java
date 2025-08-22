package org.example.springbootdeployec2.controller;

import org.example.springbootdeployec2.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/hello")
    public Response getHelloMessage() {
        return new Response(200, "Hello from Spring Boot running on AWS EC2! Time: " + LocalDateTime.now());
    }

    @GetMapping("/health")
    public Response getHealthStatus(){
        return new Response(200, "Application is running!");
    }

    @GetMapping("/info")
    public Response getAppInfo() {
        return new Response(200, "Springboot deploy on AWS EC2 microservice!");
    }
}

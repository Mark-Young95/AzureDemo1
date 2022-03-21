package com.revature.AzureDemo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }

    @GetMapping("/hi")
    public String fruit() {
        return "apple orange";
    }
}

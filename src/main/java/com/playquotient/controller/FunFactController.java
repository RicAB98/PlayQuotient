package com.playquotient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class FunFactController {

    @GetMapping("/funfact")
    public Map<String, String> getFunFact() {
        return Map.of("stat", "Feliciano López played 79 consecutive Grand Slam main draws");
    }

    @GetMapping("/hello")
    public String hello() {
        return "PlayQuotient is live!";
    }
}

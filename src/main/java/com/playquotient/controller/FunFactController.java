package com.playquotient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FunFactController {

    @GetMapping("/api/funfact")
    public Map<String, String> getFunFact() {
        return Map.of("stat", "Feliciano López played 79 consecutive Grand Slam main draws");
    }
}

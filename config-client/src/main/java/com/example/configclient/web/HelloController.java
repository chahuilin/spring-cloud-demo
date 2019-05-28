package com.example.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${info.profile}")
    private String profile;
    @Value("${info.from}")
    private String from;

    @GetMapping("/info")
    public String dc() {
        return profile+"--"+from;
    }
}

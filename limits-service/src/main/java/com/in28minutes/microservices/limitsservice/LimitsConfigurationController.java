package com.in28minutes.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsConfigurations() {
        return new LimitConfiguration(1, 1000);
    }
}
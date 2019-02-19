package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Value("${limits-service.minimum}")
    private int minimum;

    @Value("${limits-services.maximum}")
    private int maximum;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsConfigurations() {
        return new LimitConfiguration(minimum, maximum);
    }
}

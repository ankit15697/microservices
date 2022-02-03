package com.ankit.microservices.limitsservices.controller;

import com.ankit.microservices.limitsservices.bean.Limits;
import com.ankit.microservices.limitsservices.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits getLimits() {
       return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}

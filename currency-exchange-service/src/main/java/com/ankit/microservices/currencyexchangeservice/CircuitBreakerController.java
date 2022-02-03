package com.ankit.microservices.currencyexchangeservice;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {
    private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

    @GetMapping("/sample")
    public String sample() {
        return "Some Sample APi";
    }
    @GetMapping("/sample-api")
//    @Retry(name ="sample-api", fallbackMethod = "hardCodedResponse")
//    @CircuitBreaker(name ="default", fallbackMethod = "hardCodedResponse")
    @RateLimiter(name = "default")
    public String sampleApi() {
        logger.info("Sample Api call receieved");
//        new RestTemplate().getForEntity("http://localhost:8000/sample/ankit",null,String.class);
        return "Some Sample APi";
    }
    public String hardCodedResponse(Exception exception){
        return "fallBack";
    }
}

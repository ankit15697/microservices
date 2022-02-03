package com.ankit.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {
    @GetMapping(value = "/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to);
}

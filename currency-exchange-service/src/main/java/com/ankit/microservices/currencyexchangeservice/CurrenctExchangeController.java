package com.ankit.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrenctExchangeController {
	@Autowired
	private Environment environment;
	@Autowired
	private CurrencyExchangeRepository repository;
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		

//		CurrencyExchange currencyExchange =  new CurrencyExchange(100L, from, to, BigDecimal.valueOf(50L));
		CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
		currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
		return currencyExchange;
	}
	
}

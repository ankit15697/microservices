package com.ankit.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}

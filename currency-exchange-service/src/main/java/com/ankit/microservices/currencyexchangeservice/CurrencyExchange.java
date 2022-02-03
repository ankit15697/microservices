package com.ankit.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CurrencyExchange {
	@Id
	private Long id;
	@Column(name =  "currency_from")
	private String from;
	@Column(name = "currency_to")
	private String to;
	@Column(name = "conversionMultiple")
	private BigDecimal conversionMultiple;
	private String environment;
	public CurrencyExchange() {
	
	}
	public CurrencyExchange(Long idLong, String from, String to, BigDecimal converionMultiple) {
		super();
		this.id = idLong;
		this.from = from;
		this.to = to;
		this.conversionMultiple = converionMultiple;
	}
	public Long getIdLong() {
		return id;
	}
	public void setIdLong(Long idLong) {
		this.id = idLong;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
}

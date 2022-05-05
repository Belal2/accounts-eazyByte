package com.eazybytes.accounts.service.client;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eazybytes.accounts.model.Cards;
import com.eazybytes.accounts.model.Customer;

//@FeignClient("cards")
@Component
public interface CardsFeignClient {
	@RequestMapping(method = RequestMethod.POST, value = "myCards", consumes = "application/json")
	List<Cards> getCardDetails(@RequestHeader("eazybank-correlation-id") String correlationid,
			@RequestBody Customer customer);
}

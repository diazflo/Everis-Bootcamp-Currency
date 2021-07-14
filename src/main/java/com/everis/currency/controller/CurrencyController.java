package com.everis.currency.controller;

import com.everis.currency.entity.BootCoin;
import com.everis.currency.service.CurrencyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/currency/bootcoin")
public class CurrencyController {

    private final CurrencyService service;

    @Autowired
    public CurrencyController(CurrencyService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<BootCoin> createCurrency(@RequestBody BootCoin request){
        log.info("Request " + request.getName());
        return service.createCurrencyBootcoin(request);
    }

    @GetMapping("/{name}")
    public Mono<BootCoin> getCurrencyByName(@PathVariable("name") String name){
        return service.getCurrencyByName(name);
    }
}

package com.everis.currency.service;

import com.everis.currency.entity.BootCoin;
import reactor.core.publisher.Mono;

public interface CurrencyService {
    Mono<BootCoin> getCurrencyByName(String name);
    Mono<BootCoin> createCurrencyBootcoin(BootCoin currency);
    Mono<BootCoin> updateCurrencyBootcoin(String id, BootCoin currency);

}

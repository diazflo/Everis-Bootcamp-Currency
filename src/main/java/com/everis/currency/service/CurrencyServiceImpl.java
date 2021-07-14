package com.everis.currency.service;

import com.everis.currency.entity.BootCoin;
import com.everis.currency.repository.CurrencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.UUID;

@Slf4j
@Service
public class CurrencyServiceImpl implements CurrencyService {
    private final CurrencyRepository repository;

    @Autowired
    public CurrencyServiceImpl(CurrencyRepository repository) {
        this.repository = repository;
    }

    @Override
    public Mono<BootCoin> getCurrencyByName(String name) {
        return repository.findCurrencyByName(name);
    }

    @Override
    public Mono<BootCoin> createCurrencyBootcoin(BootCoin bootCoin) {
        log.info("currency " + bootCoin.getName());
        return Mono.just(bootCoin).map(obj -> {
            obj.setId(UUID.randomUUID());
            obj.setCreateDate(new Date());
            obj.setLastUpdateDate(new Date());
            return obj;
        }).flatMap(repository::save);
    }

    @Override
    public Mono<BootCoin> updateCurrencyBootcoin(BootCoin currency) {
        return null;
    }


}

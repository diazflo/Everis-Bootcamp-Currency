package com.everis.currency.repository;

import com.everis.currency.entity.BootCoin;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface CurrencyRepository extends ReactiveMongoRepository<BootCoin, UUID> {
    Mono<BootCoin> findCurrencyByName(String name);
}

package com.everis.currency.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
@Data
@Document
public class BootCoin {
    @Id
    private UUID id;
    private String name;
    private BigDecimal purchaseCoin;
    private BigDecimal sellCoin;

    private Date createDate;
    private Date lastUpdateDate;

}

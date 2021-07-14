package com.everis.currency.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Document
public class BootCoin {
    @Id
    private UUID id;
    private String name;
    private BigDecimal purchaseCoin;
    private BigDecimal sellCoin;

    private Date createDate;
    private Date lastUpdateDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPurchaseCoin() {
        return purchaseCoin;
    }

    public void setPurchaseCoin(BigDecimal purchaseCoin) {
        this.purchaseCoin = purchaseCoin;
    }

    public BigDecimal getSellCoin() {
        return sellCoin;
    }

    public void setSellCoin(BigDecimal sellCoin) {
        this.sellCoin = sellCoin;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
}

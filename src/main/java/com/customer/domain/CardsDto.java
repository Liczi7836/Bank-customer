package com.customer.domain;

import lombok.Data;

@Data
public class CardsDto {

    private Long cardId;
    private String cardType;
    private double amount;
    private Long customerId;

    public CardsDto(Long cardId, String cardType, double amount, Long customerId) {
        this.cardId = cardId;
        this.cardType = cardType;
        this.amount = amount;
        this.customerId = customerId;
    }
}

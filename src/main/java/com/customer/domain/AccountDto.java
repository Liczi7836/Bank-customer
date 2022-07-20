package com.customer.domain;

import lombok.Data;

@Data
public class AccountDto {

    private Long id;

    private String nrb;

    private String currency;

    private double availableFunds;

    private Customer customer;

    public AccountDto(Long id, String nrb, String currency, double availableFunds, Customer customer) {
        this.id = id;
        this.nrb = nrb;
        this.currency = currency;
        this.availableFunds = availableFunds;
        this.customer = customer;
    }
}

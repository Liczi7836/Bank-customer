package com.customer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class AccountDto {

    private Long id;

    private String nrb;

    private String currency;

    private double availableFunds;

    private Customer customer;
}

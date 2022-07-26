package com.customer.service;

import com.customer.domain.AccountDto;
import com.customer.domain.CardsDto;
import com.customer.provider.AccountsProvider;
import com.customer.provider.CardsProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final AccountsProvider accountProvider;
    private final CardsProvider cardsProvider;

    public AccountDto findCustomerAccounts(Long customerId) {
        return accountProvider.getCustomerAccounts(customerId);
    }

    public CardsDto findCustomerCard(Long customerId) {
        return cardsProvider.getCustomerCard(customerId);
    }
}

package com.customer.service;

import com.customer.domain.AccountDto;
import com.customer.provider.AccountsProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final AccountsProvider accountProvider;

    public List<AccountDto> findCustomerAccounts(Long customerId) {
        return accountProvider.getCustomerAccounts(customerId);
    }
}

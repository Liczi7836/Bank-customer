package com.customer.provider;

import com.customer.connector.AccountsConnector;
import com.customer.domain.AccountDto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AccountsProvider {

    private final AccountsConnector accountsConnector;

    @HystrixCommand(fallbackMethod = "fallbackGetAccounts")
    public AccountDto getCustomerAccounts(Long customerId) {
        AccountDto accountDto = new AccountDto(accountsConnector.getAccounts(customerId).getAccounts().getId(),
                accountsConnector.getAccounts(customerId).getAccounts().getNrb(),
                accountsConnector.getAccounts(customerId).getAccounts().getCurrency(),
                accountsConnector.getAccounts(customerId).getAccounts().getAvailableFunds(),
                accountsConnector.getAccounts(customerId).getAccounts().getCustomer());
        return accountDto;
    }

    private List<AccountDto> fallbackGetAccounts(Long customerId){
        return Collections.emptyList();
    }
}

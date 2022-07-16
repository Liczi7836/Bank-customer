package com.customer.provider;

import com.customer.connector.AccountsConnector;
import com.customer.domain.AccountDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AccountsProvider {

    private final AccountsConnector accountsConnector;

    public List<AccountDto> getCustomerAccounts(Long customerId) {
        return accountsConnector.getAccounts(customerId)
                .getAccounts()
                .stream()
                .map(account -> new AccountDto(
                        account.getId(),
                        account.getNrb(),
                        account.getCurrency(),
                        account.getAvailableFunds(),
                        account.getCustomer()))
                .collect(Collectors.toList());
    }
}

package com.customer.connector;

import com.customer.connector.response.GetAccountsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
class AccountsConnectorFallback implements AccountsConnector{

    @Override
    public GetAccountsResponse getAccounts(Long customerId) {
        log.warn("Can not get account for customerId: " + customerId);
        return new GetAccountsResponse();
    }
}

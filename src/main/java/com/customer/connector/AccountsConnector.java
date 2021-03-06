package com.customer.connector;

import com.customer.connector.response.GetAccountsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "accounts")
public interface AccountsConnector {

    @GetMapping("/v1/accounts/{id}")
    GetAccountsResponse getAccounts(@PathVariable Long id);
}

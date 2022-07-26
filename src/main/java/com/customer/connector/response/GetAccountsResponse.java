package com.customer.connector.response;

import com.customer.domain.AccountDto;
import lombok.Data;

import java.util.List;

@Data
public class GetAccountsResponse {
    private AccountDto accounts;
}

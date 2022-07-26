package com.customer.connector.response;

import com.customer.domain.AccountDto;
import com.customer.domain.CardsDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetCustomerProductsResponse {
    private Long customerId;
    private String fullName;
    private AccountDto accounts;
    private CardsDto cardsDto;
}

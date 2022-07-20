package com.customer.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CustomerDto {

    private Long customerId;
    private String firstName;
    private String lastName;

    public CustomerDto(Long customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public CustomerDto() {
    }

}

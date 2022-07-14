package com.customer.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.NamedNativeQuery;

@Getter
@Setter

public class CustomerDto {

    private Long id;
    private String firstName;
    private String lastName;

    public CustomerDto(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public CustomerDto() {
    }

}

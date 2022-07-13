package com.customer.mapper;

import com.customer.domain.Customer;
import com.customer.domain.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public CustomerDto mapToCustomerDto(Customer customer){
        return new CustomerDto(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName()
        );
    }

    public Customer mapToCustomer(CustomerDto customerDto){
        return new Customer(
                customerDto.getId(),
                customerDto.getFirstName(),
                customerDto.getLastName()
        );
    }
}

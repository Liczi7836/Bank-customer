package com.customer.service;

import com.customer.controller.CustomerNotFoundException;
import com.customer.domain.Customer;
import com.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DbService {

    private final CustomerRepository customerRepository;

    public Customer getCustomerById(Long id) throws CustomerNotFoundException{
        return customerRepository.findByCustomerId(id).orElseThrow(CustomerNotFoundException::new);
    }

}

package com.customer.service;

import com.customer.controller.CustomerNotFoundException;
import com.customer.domain.Customer;
import com.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping
public class DbService {

    private CustomerRepository customerRepository;

    public Customer getCustomerById(Long id) throws CustomerNotFoundException{
        return customerRepository.retrieveById(id).orElseThrow(CustomerNotFoundException::new);
    }

}

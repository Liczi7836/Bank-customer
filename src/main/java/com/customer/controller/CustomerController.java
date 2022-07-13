package com.customer.controller;

import com.customer.domain.CustomerDto;
import com.customer.mapper.CustomerMapper;
import com.customer.repository.CustomerRepository;
import com.customer.service.DbService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private DbService dbService;
    private CustomerMapper customerMapper;

    @GetMapping(value = "/customer/{id}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable Long id) throws CustomerNotFoundException{
        return ResponseEntity.ok(customerMapper.mapToCustomerDto(dbService.getCustomerById(id)));
    }

}

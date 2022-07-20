package com.customer.controller;

import com.customer.connector.response.GetCustomerProductsResponse;
import com.customer.domain.AccountDto;
import com.customer.domain.CustomerDto;
import com.customer.mapper.CustomerMapper;
import com.customer.repository.CustomerRepository;
import com.customer.service.DbService;
import com.customer.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private DbService dbService;
    private CustomerMapper customerMapper;
    private ProductService productService;

    @GetMapping(value = "/customer/{id}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable Long id) throws CustomerNotFoundException{
        return ResponseEntity.ok(customerMapper.mapToCustomerDto(dbService.getCustomerById(id)));
    }

    @GetMapping("/{customerId}/products")
    public GetCustomerProductsResponse getCustomerProducts(@PathVariable Long customerId) throws CustomerNotFoundException {
        CustomerDto customerDto = customerMapper.mapToCustomerDto(dbService.getCustomerById(customerId));

        List<AccountDto> customerAccounts = productService.findCustomerAccounts(customerId);

        return GetCustomerProductsResponse.builder()
                .customerId(customerDto.getCustomerId())
                .fullName(customerDto.getFirstName() + " " + customerDto.getLastName())
                .accounts(customerAccounts)
                .build();
    }

}

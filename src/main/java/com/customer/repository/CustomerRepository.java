package com.customer.repository;

import com.customer.domain.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Query
    Optional<Customer> retrieveById(@Param("ID") Long id);
}

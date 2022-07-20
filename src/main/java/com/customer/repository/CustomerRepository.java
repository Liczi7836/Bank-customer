package com.customer.repository;

import com.customer.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Override
    Optional<Customer> findById(Long id);

}

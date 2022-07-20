package com.customer.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    private Long customerId;
    private String firstName;
    private String lastName;
    private List<Account> accounts = new ArrayList<>();

    public Customer(Long customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {

    }

    @Id
    @Column(name = "customerId")
    public Long getCustomerId(){
        return customerId;
    }


    public void setCustomerId(Long id) {
        this.customerId = id;
    }


    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

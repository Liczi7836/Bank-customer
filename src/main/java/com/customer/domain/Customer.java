package com.customer.domain;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@NamedNativeQuery(
        name = "Customer.retrieveById",
        query = "SELECT * FROM customer"
                + " where customer_id = :ID",
        resultClass = Customer.class
)
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;

    public Customer(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {

    }

    @Id
    @Column(name = "customerId")
    public Long getId(){
        return id;
    }


    public void setId(Long id) {
        this.id = id;
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

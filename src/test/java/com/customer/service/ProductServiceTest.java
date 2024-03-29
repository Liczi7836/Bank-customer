package com.customer.service;

import com.customer.domain.AccountDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureStubRunner(
        stubsMode = StubRunnerProperties.StubsMode.LOCAL,
        ids = {
                "com.kodilla:accounts:+:stubs:9000"
        }
)
class ProductServiceTest {

    @Autowired
    private ProductService productService;


    @Test
    void findCustomerAccounts() {
        //Given
        Long customerId = 1L;

        //When
        AccountDto accounts = productService.findCustomerAccounts(customerId);

        //Then
        //assertEquals(1, accounts.size());
    }
}
package com.irfanalam.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {

        Customer Customer= com.irfanalam.customer.Customer.builder()
                .firstName (request.firstName())
                .lastName (request.lastName())
                .email(request.email())
                .build();
    }
}

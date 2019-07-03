package com.soapws.customerUpdate;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CustomerUpdateRepository {

    @PostConstruct
    public ExecuteServiceReturn setCustomAcctDetails() {
        return new ExecuteServiceReturn();
    }
}
package com.soapws.webservice.mandate;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MandateRepository {

    @PostConstruct
    public ExecuteServiceReturn setCustomAcctDetails(){
        return new ExecuteServiceReturn();
    }
}

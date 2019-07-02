package com.soapws.webservice.customerUpdate;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeConfigurationException;

@Component
public class CustomerUpdateRepository {

    @PostConstruct
    public ExecuteServiceReturn setCustomAcctDetails() {
        return new ExecuteServiceReturn();
    }
}
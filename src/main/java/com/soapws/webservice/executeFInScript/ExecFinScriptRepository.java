package com.soapws.webservice.executeFInScript;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeConfigurationException;

@Component
public class ExecFinScriptRepository {

    @PostConstruct
    public ExecuteServiceReturn setCustomAcctDetails(){
        return new ExecuteServiceReturn();
    }
}

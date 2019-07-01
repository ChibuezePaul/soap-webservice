package com.old.webservice01;

import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.datatype.DatatypeConfigurationException;

//@Endpoint
public class FIEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

    @Autowired
    private FIService service;

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeService")
//    @ResponsePayload
    public ExecuteServiceResponse getCustomAcctDetails(/*@RequestPayload ExecuteService request*/) throws DatatypeConfigurationException {
        ExecuteServiceResponse response = new ExecuteServiceResponse();

//        response.setFIXML(service.getCustomAcctDetails(request));

        return response;
    }
}

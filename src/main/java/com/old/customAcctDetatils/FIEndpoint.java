package com.old.customAcctDetatils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;

//@Endpoint
public class FIEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

//    @Autowired
    private FIService service;

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeService")
//    @ResponsePayload
    public ExecuteServiceResponse getCustomAcctDetails(/*@RequestPayload ExecuteService request*/) throws DatatypeConfigurationException {
        ExecuteServiceResponse response = new ExecuteServiceResponse();

//        response.setFIXML(service.getCustomAcctDetails(request));

        return response;
    }
}

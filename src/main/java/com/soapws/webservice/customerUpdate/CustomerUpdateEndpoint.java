package com.soapws.webservice.customerUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CustomerUpdateEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

    @Autowired
    private CustomerUpdateRepository repository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeService01")
    @ResponsePayload
    public ExecuteServiceResponse getCustomAcctDetails(@RequestPayload ExecuteService request) {

        ExecuteServiceResponse response = new ExecuteServiceResponse();

        response.setExecuteServiceReturn(repository.setCustomAcctDetails());

        return response;
    }
}

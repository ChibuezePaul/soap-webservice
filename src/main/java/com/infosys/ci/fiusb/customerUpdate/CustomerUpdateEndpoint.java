package com.infosys.ci.fiusb.customerUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

//@Endpoint
public class CustomerUpdateEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

    @Autowired
    private CustomerUpdateRepository repository;

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeCustUpdateService")
//    @ResponsePayload
    public ExecuteServiceResponse getCustUpdateService(@RequestPayload ExecuteCustUpdateService request) {

        ExecuteServiceResponse response = new ExecuteServiceResponse();

        response.setExecuteServiceReturn(repository.setCustomAcctDetails());

        return response;
    }
}

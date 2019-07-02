package com.soapws.webservice.mandate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MandateEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

    @Autowired
    private MandateRepository repository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeMandateService")
    @ResponsePayload
    public ExecuteServiceResponse getMandateService(@RequestPayload ExecuteMandateService request) {

        System.out.println("I got here : " + this.getClass().getName());

        ExecuteServiceResponse response = new ExecuteServiceResponse();

        response.setExecuteServiceReturn(repository.setCustomAcctDetails());

        return response;
    }
}

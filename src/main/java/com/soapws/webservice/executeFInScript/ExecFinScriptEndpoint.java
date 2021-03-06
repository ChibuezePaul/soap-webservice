package com.soapws.webservice.executeFInScript;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

//@Endpoint
public class ExecFinScriptEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

    @Autowired
    private ExecFinScriptRepository repository;

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeServiceFinacle")
//    @ResponsePayload
    public ExecuteServiceResponse getCustomAcctDetails(@RequestPayload ExecuteService request) {

        ExecuteServiceResponse response = new ExecuteServiceResponse();

        response.setExecuteServiceReturn(repository.setCustomAcctDetails());

        return response;
    }
}

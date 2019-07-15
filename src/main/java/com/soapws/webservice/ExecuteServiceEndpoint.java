package com.soapws.webservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ExecuteServiceEndpoint {

    @PayloadRoot(namespace = "http://webservice.fiusb.ci.infosys.com", localPart = "executeService")
    @ResponsePayload
    public ExecuteServiceResponse getRequest(@RequestPayload ExecuteService request) {
            return new ExecuteServiceResponse();
    }
}

package com.infosys.ci.fiusb.webservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by mac on 10/09/2019.
 */
@Endpoint
public class FIEndpoint {
	private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

//    @Autowired
//    private CustomerUpdateRepository repository;
	
	private final Logger logger = LoggerFactory.getLogger ( this.getClass () );

    @PayloadRoot (namespace = NAMESPACE_URI, localPart = "executeService")
    @ResponsePayload
    public ExecuteServiceResponse getCustUpdateService(@RequestPayload ExecuteService request) {

        ExecuteServiceResponse response = new ExecuteServiceResponse();

//        response.setExecuteServiceReturn(repository.setCustomAcctDetails());
		logger.info ( "Request Got : {}",request );

        return response;
    }
}

package com.soapws.webservice.mandate;

import com.soapws.webservice.customerUpdate.CustomerUpdateEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBException;

@Endpoint
public class MandateEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

    @Autowired
    private MandateRepository repository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeService")
    @ResponsePayload
    public ExecuteServiceResponse getCustomAcctDetails(@RequestPayload ExecuteService request) throws JAXBException {

        ExecuteServiceResponse response = new ExecuteServiceResponse();
//        System.out.println(new CustomerUpdateEndpoint().jaxbObjectToXML(request, "SignatureAdd"));

//        if (new CustomerUpdateEndpoint().jaxbObjectToXML(request, "SignatureAdd"))
            response.setExecuteServiceReturn(repository.setMandateResponse());

            return response;


    }
}

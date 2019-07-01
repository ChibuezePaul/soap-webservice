package com.old.customAcctDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.SAXException;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

//@Endpoint
public class FIEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

//    @Autowired
    private FIRepository repository;

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeService")
//    @ResponsePayload
    public ExecuteServiceResponse getCustomAcctDetails(/*@RequestPayload ExecuteService request*/) throws DatatypeConfigurationException, ParserConfigurationException, SAXException, XPathExpressionException, IOException {

        ExecuteServiceResponse response = new ExecuteServiceResponse();

//        response.setFIXML(repository.setCustomAcctDetails(request));

        return response;
    }
}

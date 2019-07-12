package com.soapws.webservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.InputSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringReader;
import java.io.StringWriter;

@Endpoint
public class ExecuteServiceEndpoint {

    @PayloadRoot(namespace = "http://webservice.fiusb.ci.infosys.com", localPart = "executeService")
    @ResponsePayload
    public ExecuteServiceResponse getRequest(@RequestPayload ExecuteService request) {

//        DefaultHttpClient httpClient = new DefaultHttpClient();

        return new ExecuteServiceResponse();
    }




    public Boolean jaxbObjectToXML(Object request, String identifier) throws JAXBException {
//        try
//        {
        //Create JAXB Context
        JAXBContext jaxbContext = JAXBContext.newInstance(ExecuteService.class);

        //Create Marshaller
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        //Required formatting??
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //Print XML String to Console
        StringWriter sw = new StringWriter();

        //Write XML to StringWriter
        jaxbMarshaller.marshal(request, sw);

        //Verify XML Content
        String xmlContent = sw.toString();

        System.out.println( xmlContent );

        InputSource inputXML = new InputSource( new StringReader( xmlContent ) );
//            System.out.println(xmlContent.contains(identifier));
//            XPath xPath = XPathFactory.newInstance().newXPath();
//
////                String result = xPath.evaluate("//ServiceRequestId/text()", xmlContent);
//
////                String  result = (String) xPath.compile("//ServiceRequestId").evaluate(inputXML, XPathConstants.STRING);
//
////                System.out.println(result);
//
//        } catch (JAXBException e) {
//            e.getMessage();
//        }
        return xmlContent.contains(identifier);
    }
}
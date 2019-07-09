package com.soapws.webservice.customerUpdate;

import com.soapws.webservice.mandate.MandateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.xpath.*;
import java.io.StringReader;
import java.io.StringWriter;

//@Endpoint
public class CustomerUpdateEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

    @Autowired
    private CustomerUpdateRepository customerUpdateRepository;
    @Autowired
    private MandateRepository mandateRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeService")
    @ResponsePayload
    public ExecuteServiceResponse getCustomAcctDetails(@RequestPayload ExecuteService request) throws XPathExpressionException, JAXBException {

//        XPathFactory xPathfactory = XPathFactory.newInstance();
//        XPath xpath = xPathfactory.newXPath();
//        SimpleNamespaceContext nsc = new SimpleNamespaceContext();
//
//        nsc.bindNamespaceUri("a", "http://webservice.fiusb.ci.infosys.com");
//        xpath.setNamespaceContext(nsc);
//
//        XPathExpression xpathExpr = xpath.compile("//ServiceRequestId");
//
//        String result = (String) xpathExpr.evaluate(request, XPathConstants.STRING);
//
//        System.out.println(result);

        ExecuteServiceResponse response = new ExecuteServiceResponse();
        com.soapws.webservice.mandate.ExecuteService mandateRequest = new com.soapws.webservice.mandate.ExecuteService();
        com.soapws.webservice.mandate.ExecuteServiceResponse mandateResponse = new com.soapws.webservice.mandate.ExecuteServiceResponse();

        if (jaxbObjectToXML(request,"RetCustMod"))
            response.setExecuteServiceReturn(customerUpdateRepository.setCustUpdateResponse());
            return response;


//        else if (jaxbObjectToXML(mandateRequest, "SignatureAdd")) {
//            mandateResponse.setExecuteServiceReturn(mandateRepository.setMandateResponse());
//            return mandateResponse;
//        }
//
//        return response;
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

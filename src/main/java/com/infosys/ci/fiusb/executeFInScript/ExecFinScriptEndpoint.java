package com.infosys.ci.fiusb.executeFInScript;

import com.soapws.webservice.ExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringReader;
import java.io.StringWriter;

//@Endpoint
public class ExecFinScriptEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

    @Autowired
    private ExecFinScriptRepository repository;

    ExecuteServiceResponse serviceResponse = new ExecuteServiceResponse();

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeService")
//    @ResponsePayload
    public ExecuteServiceResponse getRequest(/*@RequestPayload ExecuteService request*/) throws JAXBException {

//        if (jaxbObjectToXML(new ExecuteService("","customHol.scr"), "customHol.scr")) {
//            serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1507286630051", "CRM", null, null, "YYNNNN", "YYYYNNNNYYNNNNNYYNNNNNYYNNNNNY"));
//            return serviceResponse;
//        }
//        else if (jaxbObjectToXML((new ExecuteService("","customAckChq.scr")), "customAckChq.scr")){
//            serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561732112117","CRM",null,null,null,null));
//
//            return serviceResponse;
//        }
        return new ExecuteServiceResponse();
    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeChequeService")
//    @ResponsePayload
//    public ExecuteServiceResponse getChequeService(@RequestPayload ExecuteChequeService request) {
//
//        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561732112117","CRM",null,null,null,null));
//
//        return serviceResponse;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeLetterService")
//    @ResponsePayload
//    public ExecuteServiceResponse getLetterService(@RequestPayload ExecuteLetterService request) {
//
//        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561733640958","COR",null,null,null,null));
//
//        return serviceResponse;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeLienService")
//    @ResponsePayload
//    public ExecuteServiceResponse getLienService(@RequestPayload ExecuteLienService request) {
//
//        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561732490688","CRM",null,"01183256055",null,null));
//
//        return serviceResponse;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeFreezeService")
//    @ResponsePayload
//    public ExecuteServiceResponse getFreezeService(@RequestPayload ExecuteFreezeService request) {
//
//        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561732016602","CRM",null,null,null,null));
//
//        return serviceResponse;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeMandatesService")
//    @ResponsePayload
//    public ExecuteServiceResponse getMandatesService(@RequestPayload ExecuteMandatesService request) {
//
//        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561731734391","COR",null,null,null,null));
//
//        return serviceResponse;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeNotificationService")
//    @ResponsePayload
//    public ExecuteServiceResponse getNotificationService(@RequestPayload ExecuteNotificationService request) {
//
//        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1507290067534","COR",null,null,null,null));
//
//        return serviceResponse;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeMemoPadService")
//    @ResponsePayload
//    public ExecuteServiceResponse getMemoPadService(@RequestPayload ExecuteMemoPadService request) {
//
//        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1506340714644","COR",null,null,null,null));
//
//        return serviceResponse;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeSchemeCodeService")
//    @ResponsePayload
//    public ExecuteServiceResponse getSchemeCodeService(@RequestPayload ExecuteSchemeCodeService request) {
//
//
//
//        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561385949464","COR",null,null,null,null));
//
//        return serviceResponse;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeReactivationService")
//    @ResponsePayload
//    public ExecuteServiceResponse getReactivationService(@RequestPayload ExecuteReactivationService request) {
//
//        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1507303907459","COR",null,null,null,null));
//
//        return serviceResponse;
//    }

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
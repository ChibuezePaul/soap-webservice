package com.soapws.executeFInScript;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ExecFinScriptEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.fiusb.ci.infosys.com";

    @Autowired
    private ExecFinScriptRepository repository;

    ExecuteServiceResponse serviceResponse = new ExecuteServiceResponse();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeChannelService")
    @ResponsePayload
    public ExecuteServiceResponse getChannelService(@RequestPayload ExecuteChannelService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1507286630051","CRM",null,null,"YYNNNN","YYYYNNNNYYNNNNNYYNNNNNYYNNNNNY"));

        return serviceResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeChequeService")
    @ResponsePayload
    public ExecuteServiceResponse getChequeService(@RequestPayload ExecuteChequeService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561732112117","CRM",null,null,null,null));

        return serviceResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeLetterService")
    @ResponsePayload
    public ExecuteServiceResponse getLetterService(@RequestPayload ExecuteLetterService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561733640958","COR",null,null,null,null));

        return serviceResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeLienService")
    @ResponsePayload
    public ExecuteServiceResponse getLienService(@RequestPayload ExecuteLienService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561732490688","CRM",null,"01183256055",null,null));

        return serviceResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeFreezeService")
    @ResponsePayload
    public ExecuteServiceResponse getFreezeService(@RequestPayload ExecuteFreezeService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561732016602","CRM",null,null,null,null));

        return serviceResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeMandatesService")
    @ResponsePayload
    public ExecuteServiceResponse getMandatesService(@RequestPayload ExecuteMandatesService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561731734391","COR",null,null,null,null));

        return serviceResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeNotificationService")
    @ResponsePayload
    public ExecuteServiceResponse getNotificationService(@RequestPayload ExecuteNotificationService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1507290067534","COR",null,null,null,null));

        return serviceResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeMemoPadService")
    @ResponsePayload
    public ExecuteServiceResponse getMemoPadService(@RequestPayload ExecuteMemoPadService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1506340714644","COR",null,null,null,null));

        return serviceResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeSchemeCodeService")
    @ResponsePayload
    public ExecuteServiceResponse getSchemeCodeService(@RequestPayload ExecuteSchemeCodeService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1561385949464","COR",null,null,null,null));

        return serviceResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeReactivationService")
    @ResponsePayload
    public ExecuteServiceResponse getReactivationService(@RequestPayload ExecuteReactivationService request) {

        serviceResponse.setExecuteServiceReturn(repository.createServiceReturn("Req_1507303907459","COR",null,null,null,null));

        return serviceResponse;
    }
}
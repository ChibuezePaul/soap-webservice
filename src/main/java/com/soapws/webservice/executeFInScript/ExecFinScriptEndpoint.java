package com.soapws.webservice.executeFInScript;

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

    ExecuteFinacleScriptCustomData customData;
//
//    public ExecFinScriptEndpoint(ExecuteFinacleScriptCustomData customData) {
//        customData.setSuccessOrFailure("SUCCESS");
//        this.customData = customData;
//    }

    protected ExecuteServiceResponse getExecuteServiceResponse() {

        ExecuteServiceResponse response;
        response = new ExecuteServiceResponse();

        response.setExecuteServiceReturn(repository.setCustomAcctDetails());

        return response;
    }

    protected void setRequestMessageKey(String reqUUID, String channelId) {
        RequestMessageKey messageKey = new RequestMessageKey();
        messageKey.setRequestUUID(reqUUID);
        messageKey.setServiceRequestId("executeFinacleScript");
        messageKey.setServiceRequestVersion("10.2");
        messageKey.setChannelId(channelId);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeChannelService")
    @ResponsePayload
    public ExecuteServiceResponse getChannelService(@RequestPayload ExecuteChannelService request) {

        customData.setMainHol("YYNNNN");
        customData.setPrevHol("YYYYNNNNYYNNNNNYYNNNNNYYNNNNNY");

        setRequestMessageKey("Req_1507286678884","CRM");

        return getExecuteServiceResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeChequeService")
    @ResponsePayload
    public ExecuteServiceResponse getChequeService(@RequestPayload ExecuteChequeService request) {

        setRequestMessageKey("Req_1561732445354", "CRM");
        return getExecuteServiceResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeLetterService")
    @ResponsePayload
    public ExecuteServiceResponse getLetterService(@RequestPayload ExecuteLetterService request) {

        setRequestMessageKey("Req_1561733640958", "COR");
        return getExecuteServiceResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeLienService")
    @ResponsePayload
    public ExecuteServiceResponse getLienService(@RequestPayload ExecuteLienService request) {

        customData.setLienB2KId("01183256054");
        setRequestMessageKey("Req_1561732490688", "CRM");
        return getExecuteServiceResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeFreezeService")
    @ResponsePayload
    public ExecuteServiceResponse getFreezeService(@RequestPayload ExecuteFreezeService request) {

        setRequestMessageKey("Req_1561732016602", "CRM");
        return getExecuteServiceResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeMandatesService")
    @ResponsePayload
    public ExecuteServiceResponse getMandatesService(@RequestPayload ExecuteMandatesService request) {

        setRequestMessageKey("Req_1561731734654", "COR");
        return getExecuteServiceResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeNotificationService")
    @ResponsePayload
    public ExecuteServiceResponse getNotificationService(@RequestPayload ExecuteNotificationService request) {

        setRequestMessageKey("Req_1507290067534", "COR");
        return getExecuteServiceResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeMemoPadService")
    @ResponsePayload
    public ExecuteServiceResponse getMemoPadService(@RequestPayload ExecuteMemoPadService request) {

        setRequestMessageKey("Req_1506340714644", "COR");
        return getExecuteServiceResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeSchemeCodeService")
    @ResponsePayload
    public ExecuteServiceResponse getSchemeCodeService(@RequestPayload ExecuteSchemeCodeService request) {

        setRequestMessageKey("Req_1561385949464", "COR");
        return getExecuteServiceResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "executeReactivationService")
    @ResponsePayload
    public ExecuteServiceResponse getReactivationService(@RequestPayload ExecuteReactivationService request) {

        setRequestMessageKey("Req_1507303907459", "COR");
        return getExecuteServiceResponse();
    }
}

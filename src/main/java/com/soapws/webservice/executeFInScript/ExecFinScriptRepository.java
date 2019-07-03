package com.soapws.webservice.executeFInScript;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;

@Component
public class ExecFinScriptRepository {

    @PostConstruct
    public ExecuteServiceReturn setCustomAcctDetails(){

        ExecuteServiceReturn serviceReturn = new ExecuteServiceReturn();
        return serviceReturn;
    }

    protected String messageDateTime;

    {
        try {
            messageDateTime = String.valueOf(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()).normalize());
        } catch (DatatypeConfigurationException e) {
            e.getMessage();
        }
    }

    protected ExecuteServiceReturn createServiceReturn(String reqUUID, String channelId, String signId, String lienId, String prevHol, String mainHol) {
        RequestMessageKey messageKey = new RequestMessageKey();
        messageKey.setRequestUUID(reqUUID);
        messageKey.setServiceRequestId("executeFinacleScript");
        messageKey.setServiceRequestVersion("10.2");
        messageKey.setChannelId(channelId);

        ResponseMessageInfo messageInfo = new ResponseMessageInfo();
        messageInfo.setBankId("01");
        messageInfo.setMessageDateTime(messageDateTime);
        messageInfo.setTimeZone(" ");

        UBUSTransaction ubusTransaction = new UBUSTransaction();
        ubusTransaction.setId("");
        ubusTransaction.setStatus("");

        HostTransaction hostTransaction = new HostTransaction();
        hostTransaction.setId("");
        hostTransaction.setStatus("SUCCESS");

        HostParentTransaction parentTransaction = new HostParentTransaction();
        parentTransaction.setId("");
        parentTransaction.setStatus("");

        ResponseHeader responseHeader = new ResponseHeader();
        responseHeader.setRequestMessageKey(messageKey);
        responseHeader.setResponseMessageInfo(messageInfo);
        responseHeader.setHostTransaction(hostTransaction);
        responseHeader.setHostParentTransaction(parentTransaction);
        responseHeader.setCustomInfo("");

        Header header = new Header();
        header.setResponseHeader(responseHeader);

        ExecuteFinacleScriptOutputVO scriptOutputVO = new ExecuteFinacleScriptOutputVO();

        ExecuteFinacleScriptCustomData customData = new ExecuteFinacleScriptCustomData();
        customData.setSuccessOrFailure("SUCCESS");
        customData.setSignId(signId);
        customData.setLienB2KId(lienId);
        customData.setPrevHol(prevHol);
        customData.setMainHol(mainHol);

        ExecuteFinacleScriptResponse scriptResponse = new ExecuteFinacleScriptResponse();
        scriptResponse.setExecuteFinacleScriptCustomData(customData);
        scriptResponse.setExecuteFinacleScriptOutputVO(scriptOutputVO);

        Body body = new Body();
        body.setExecuteFinacleScriptResponse(scriptResponse);

        FIXML fixml = new FIXML();
        fixml.setBody(body);
        fixml.setHeader(header);

        ExecuteServiceReturn serviceReturn = new ExecuteServiceReturn();
        serviceReturn.setFIXML(fixml);

        return serviceReturn;
    }
}

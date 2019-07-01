package com.old.webservice01;


import javax.xml.datatype.DatatypeConfigurationException;
import java.util.HashMap;
import java.util.Map;

//@Component
public class FIRepository {
    private static final Map<String, FIXML> fixmlMap = new HashMap<>();

    public FIXML setCustomAcctDetails(ExecuteServiceResponse response) throws DatatypeConfigurationException {

        FIXML fixml = new FIXML();

//        /**
//         * Response Header
//         * returns ResponseHeader
//         */
//
//        RequestMessageKey messageKey = new RequestMessageKey();
////        messageKey.setChannelId(channelId);
////        messageKey.setRequestUUID("Req_1561468016247");
////        messageKey.setServiceRequestId("executeFinacleScript");
////        messageKey.setServiceRequestVersion(requestUUID);
//
//        ResponseMessageInfo messageInfo = new ResponseMessageInfo();
////        messageInfo.setBankId("01");
////        messageInfo.setMessageDateTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()).normalize());
////        messageInfo.setMessageDateTime(String.valueOf(messageDateTime));
////        messageInfo.setTimeZone(null);
//
//        UBUSTransaction ubusTransaction = new UBUSTransaction();
////        ubusTransaction.setId("");
////        ubusTransaction.setStatus("");
//
//        HostTransaction hostTransaction = new HostTransaction();
////        hostTransaction.setId("");
////        hostTransaction.setStatus("SUCCESS");
//
//        HostParentTransaction hostParentTransaction = new HostParentTransaction();
////        hostParentTransaction.setId("");
////        hostParentTransaction.setStatus("");
//
//        ResponseHeader responseHeader = new ResponseHeader();
////        responseHeader.setRequestMessageKey(messageKey);
////        responseHeader.setResponseMessageInfo(messageInfo);
////        responseHeader.setUBUSTransaction(ubusTransaction);
////        responseHeader.setHostTransaction(hostTransaction);
////        responseHeader.setHostParentTransaction(hostParentTransaction);
////        responseHeader.setCustomInfo("");
//
//        Header header = new Header();
//        header.setResponseHeader(responseHeader);
//
//        /**
//         * Response Body
//         * returns executeFinacleScriptResponse
//         */
//
//        ExecuteFinacleScriptOutputVO scriptOutputVO = new ExecuteFinacleScriptOutputVO();
//        ExecuteFinacleScriptCustomData customData = new ExecuteFinacleScriptCustomData();
////        customData.setSolId("001");
////        customData.setCrncyCode("NGN");
////        customData.setAcctName("OKOROAFOR VINCENT ONYEKWERE");
////        customData.setFreezeCode("null");
////        customData.setAcctBal(375.66);
////        customData.setSchmType("CAA");
////        customData.setSchmCode("CA202");
////        customData.setSchmCodeDesc("PREMIUM CURRENT");
////        customData.setAcctOfficerCode("001DE");
////        customData.setAcctOfficerCodeDesc("UGOH JACINTA CHINONSO");
////        customData.setAcctBrokerCode("D1782");
////        customData.setBrokerCodeDesc("ENEJE JANE ONYINYE");
////        customData.setAcctSMSStatus("N");
////        customData.setAcctEmailStatus("NULL");
////        customData.setSuccessOrFailure("SUCCESS");
//
//        ExecuteFinacleScriptResponse finacleScriptResponse = new ExecuteFinacleScriptResponse();
////        finacleScriptResponse.setExecuteFinacleScriptOutputVO(scriptOutputVO);
////        finacleScriptResponse.setExecuteFinacleScriptCustomData(customData);
//
//        Body body = new Body();
//        body.setExecuteFinacleScriptResponse(finacleScriptResponse);
//
//        /**
//         * FIXML Response
//         */

        fixml.setHeader(new Header());
        fixml.setBody(new Body());

        return fixml;
    }
}

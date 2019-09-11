package com.infosys.ci.fiusb.webservice;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;

/**
 * Created by mac on 11/09/2019.
 */
public class FIService {
	protected String messageDateTime;
	
	{
		try {
			messageDateTime = String.valueOf( DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar ()).normalize());
		} catch (DatatypeConfigurationException e) {
			e.getMessage();
		}
	}
	protected Arg00 createServiceReturn(String reqUUID, String channelId, String signId, String lienId, String prevHol, String mainHol) {
		MessageKey messageKey = new MessageKey();
		messageKey.setRequestUUID(reqUUID);
		messageKey.setServiceRequestId("executeFinacleScript");
		messageKey.setServiceRequestVersion("10.2");
		messageKey.setChannelId(channelId);
		
		ResponseMessageInfo messageInfo = new ResponseMessageInfo();
		messageInfo.setBankId("01");
//		messageInfo.setMessageDateTime(messageDateTime);
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
//		responseHeader.setRequestMessageKey(messageKey);
		responseHeader.setResponseMessageInfo(messageInfo);
		responseHeader.setHostTransaction(hostTransaction);
		responseHeader.setHostParentTransaction(parentTransaction);
		responseHeader.setCustomInfo("");
		
		Header header = new Header();
//		header.setResponseHeader(responseHeader);
		
		ExecuteFinacleScriptOutputVO scriptOutputVO = new ExecuteFinacleScriptOutputVO();
		
		ExecuteFinacleScriptCustomData customData = new ExecuteFinacleScriptCustomData();
		customData.setSuccessOrFailure("SUCCESS");
		customData.setSignId(signId);
		customData.setLienB2KId(lienId);
//		customData.setPrevHol(prevHol);
//		customData.setMainHol(mainHol);
		
		ExecuteFinacleScriptResponse scriptResponse = new ExecuteFinacleScriptResponse();
		scriptResponse.setExecuteFinacleScriptCustomData(customData);
		scriptResponse.setExecuteFinacleScriptOutputVO(scriptOutputVO);
		
		Body body = new Body();
		body.setExecuteFinacleScriptResponse(scriptResponse);
		
		FIXML fixml = new FIXML();
		fixml.setBody(body);
		fixml.setHeader(header);
		
		Arg00 arg00 = new Arg00 ();
		arg00.setFIXML(fixml);
		
		return arg00;
	}
}


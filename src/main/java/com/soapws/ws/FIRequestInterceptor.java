package com.soapws.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

/**
 * Created by mac on 09/09/2019.
 */
public class FIRequestInterceptor implements EndpointInterceptor {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean handleRequest ( MessageContext messageContext, Object endpoint ) throws Exception {
		logger.info ( "Request Handler" );
		SoapMessage soapMessage = (SoapMessage ) messageContext.getRequest();
		SoapBody soapBody = soapMessage.getSoapBody ();
		Source source = soapBody.getPayloadSource ();
		DOMSource domSource = (DOMSource) source;
		JAXBContext context = JAXBContext.newInstance ( ExecuteService.class );
		Unmarshaller unmarshaller = context.createUnmarshaller ();
		
		if(unmarshaller.unmarshal ( domSource ) instanceof ExecuteService){
			ExecuteService executeService = (ExecuteService ) unmarshaller.unmarshal ( domSource );
			
//			logger.info ( "testing resource {}", executeService.getArg00 ().getFIXML ().getHeader ().);
		}
		return true;
	}
	
	@Override
	public boolean handleResponse ( MessageContext messageContext, Object endpoint ) throws Exception {
		logger.info ( "Response Handler" );
		return true;
	}
	
	@Override
	public boolean handleFault ( MessageContext messageContext, Object endpoint ) throws Exception {
		logger.info ( "Fault Handler" );
		return true;
	}
	
	@Override
	public void afterCompletion ( MessageContext messageContext, Object endpoint, Exception ex ) throws Exception {
		logger.info ( "Completion Handler" );
	}
}

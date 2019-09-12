package com.infosys.ci.fiusb.webservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapMessage;
import org.thymeleaf.TemplateEngine;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

/**
 * Created by mac on 10/09/2019.
 */
public class FIEndpointInterceptor implements EndpointInterceptor {
	@Autowired
	private TemplateEngine templateEngine;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean handleRequest ( MessageContext messageContext, Object endpoint ) throws Exception {
		logger.info ( "Request Handler" );
		try {
			SoapMessage soapMessage = ( SoapMessage ) messageContext.getRequest ();
			SoapBody soapBody = soapMessage.getSoapBody ();
			Source source = soapBody.getPayloadSource ();
			DOMSource domSource = ( DOMSource ) source;
			JAXBContext context = JAXBContext.newInstance ( ExecuteService.class );
			Unmarshaller unmarshaller = context.createUnmarshaller ();
			
			if ( unmarshaller.unmarshal ( domSource ) instanceof ExecuteService ) {
				logger.info ( "testing resource " );
				ExecuteService executeService = ( ExecuteService ) unmarshaller.unmarshal ( domSource );
				logger.info ( "request {}",executeService);
//				XPath xpath = XPathFactory.newInstance ().newXPath ();
//				SimpleNamespaceContext namespaceContext = new SimpleNamespaceContext ();
////				namespaceContext.bindNamespaceUri ( "executeService","http://webservice.fiusb.ci.infosys.com" );
//				namespaceContext.getNamespaceURI ( "executeService" );
//				xpath.setNamespaceContext ( namespaceContext );
//				Node resultNode = ( Node ) xpath.evaluate ( "//RequestUUID", domSource, XPathConstants.NODE );
//				logger.info ( "got {}", resultNode.getValue () );
			
			}
		}catch ( Exception e ){
			e.printStackTrace ();
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

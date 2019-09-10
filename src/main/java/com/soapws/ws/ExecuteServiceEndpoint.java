package com.soapws.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.server.endpoint.annotation.SoapHeader;

@Endpoint
public class ExecuteServiceEndpoint {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@PayloadRoot(namespace = "http://webservice.fiusb.ci.infosys.com", localPart = "executeService")
    @ResponsePayload
    public ExecuteServiceResponse getRequest(@RequestPayload ExecuteService request, @SoapHeader (value = "{http://webservice.fiusb.ci.infosys.com}executeService" ) SoapHeaderElement soapHeader){
		ExecuteServiceResponse response = new ExecuteServiceResponse ();
		try {
		
		}catch ( Exception e ){
			e.printStackTrace ();
		}
		
		
        return response;
    }
//	@Override
//	protected void doPost ( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException {
//		StringBuilder stringBuilder = new StringBuilder();
//		BufferedReader bufferedReader = null;
//		try {
//			InputStream inputStream = req.getInputStream();
//			if (inputStream != null) {
//				bufferedReader = new BufferedReader (new InputStreamReader (
//					  inputStream));
//				char[] charBuffer = new char[128];
//				int bytesRead = -1;
//				while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
//					stringBuilder.append(charBuffer, 0, bytesRead);
//				}
//			} else {
//				stringBuilder.append("");
//			}
//		} catch (IOException ex) {
//			throw ex;
//		} finally {
//			if (bufferedReader != null) {
//				try {
//					bufferedReader.close();
//				} catch (IOException ex) {
//					throw ex;
//				}
//			}
//		}
//		String body = stringBuilder.toString();
//		System.out.println ("body gotten");
//		System.out.println(body);
//	}


//	private String getBody() {
//		String body = "";
//		if (req.getMethod().equals("POST") )
//		{
//			StringBuilder sb = new StringBuilder();
//			BufferedReader bufferedReader = null;
//
//			try {
//				bufferedReader =  req.getReader();
//				char[] charBuffer = new char[128];
//				int bytesRead;
//				while ((bytesRead = bufferedReader.read(charBuffer)) != -1) {
//					sb.append(charBuffer, 0, bytesRead);
//				}
//			} catch (IOException ex) {
//				// swallow silently -- can't get body, won't
//			} finally {
//				if (bufferedReader != null) {
//					try {
//						bufferedReader.close();
//					} catch (IOException ex) {
//						// swallow silently -- can't get body, won't
//					}
//				}
//			}
//			body = sb.toString();
//		}
//		return body;
//	}
	
//	@Override
//	public boolean handleRequest ( MessageContext messageContext, Object endpoint ) throws Exception {
//		try {
//
//			SoapMessage soapMessage = (SoapMessage) messageContext.getRequest();
//			SoapBody soapBody = soapMessage.getSoapBody ();
//			Source source = soapBody.getPayloadSource ();
//			DOMSource domSource = (DOMSource) source;
//			logger.info ( "Soap Message {}",soapMessage );
//
//			JAXBContext context = JAXBContext.newInstance ( ExecuteService.class );
////			Marshaller marshaller = context.createMarshaller ();
////			marshaller.marshal ( soapMessage,soapBody.getPayloadResult () );
//			Unmarshaller unmarshaller = context.createUnmarshaller ();
//			endpoint = (ExecuteService) unmarshaller.unmarshal ( domSource );
//			logger.info ( "Request Gotten {}",endpoint );
//			return true;
//		}catch ( Exception e ){
//        	logger.info ( "2nd level Error {}",e.getMessage () );
//        	e.printStackTrace ();
//		}
// 		return false;
//	}
//
//	@Override
//	public boolean handleResponse ( MessageContext messageContext, Object endpoint ) throws Exception {
//		return false;
//	}
//
//	@Override
//	public boolean handleFault ( MessageContext messageContext, Object endpoint ) throws Exception {
//		return false;
//	}
//
//	@Override
//	public void afterCompletion ( MessageContext messageContext, Object endpoint, Exception ex ) throws Exception {
//
//	}
	
}

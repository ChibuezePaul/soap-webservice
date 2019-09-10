package com.soapws;

import com.soapws.ws.FIRequestInterceptor;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import java.util.List;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	
	@Override
	public void addInterceptors(List<EndpointInterceptor > interceptors) {
//		PayloadValidatingInterceptor validatingInterceptor = new PayloadValidatingInterceptor();
//		validatingInterceptor.setValidateRequest(true);
//		validatingInterceptor.setValidateResponse(true);
//		validatingInterceptor.setXsdSchema(requestService());
		interceptors.add(new FIRequestInterceptor ());
	}
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/fi/*");
	}

	@Bean(name = "request")
	public DefaultWsdl11Definition executeFinacleScriptserviceWsdl11Definition(XsdSchema requestService) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("fiPort");
		wsdl11Definition.setLocationUri("/fi");
		wsdl11Definition.setTargetNamespace("http://webservice.fiusb.ci.infosys.com");
		wsdl11Definition.setSchema(requestService);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema requestService() {
		return new SimpleXsdSchema(new ClassPathResource("request.xsd"));
	}
//
//	@Bean
//	public Jaxb2Marshaller marshaller() {
//		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//		// this package must match the package in the <generatePackage> specified in
//		// pom.xml
//		marshaller.setContextPath("request.wsdl");
//		return marshaller;
//	}
//
//	@Bean
//	public FIConsumer countryClient(Jaxb2Marshaller marshaller) {
//		FIConsumer client = new FIConsumer();
//		client.setDefaultUri("http://localhost:8080/ws");
//		client.setMarshaller(marshaller);
//		client.setUnmarshaller(marshaller);
//		return client;
//	}
}

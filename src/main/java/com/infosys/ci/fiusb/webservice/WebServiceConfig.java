package com.infosys.ci.fiusb.webservice;

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

@SuppressWarnings("ALL")
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	
	@Override
	public void addInterceptors ( List< EndpointInterceptor > interceptors ) {
		interceptors.add ( new FIEndpointInterceptor () );
	}
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/fi/*");
	}

	@Bean(name = "request")
	public DefaultWsdl11Definition executeServiceWsdl11Definition(XsdSchema executeServiceRequest) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("fiPort");
		wsdl11Definition.setLocationUri("/fi");
		wsdl11Definition.setTargetNamespace("http://webservice.fiusb.ci.infosys.com");
		wsdl11Definition.setSchema(executeServiceRequest);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema executeServiceRequest() {
		return new SimpleXsdSchema(new ClassPathResource("request.xsd"));
	}

	@Bean(name = "response")
	public DefaultWsdl11Definition response(XsdSchema executeServiceResponse) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("fiPort");
		wsdl11Definition.setLocationUri("/fi");
		wsdl11Definition.setTargetNamespace("http://webservice.fiusb.ci.infosys.com");
		wsdl11Definition.setSchema(executeServiceResponse);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema executeServiceResponse() {
		return new SimpleXsdSchema(new ClassPathResource("response.xsd"));
	}
}

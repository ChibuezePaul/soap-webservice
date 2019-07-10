package com.soapws;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@SuppressWarnings("ALL")
@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/fi/*");
	}

	@Bean(name = "request")
	public DefaultWsdl11Definition requestServiceWsdl11Definition(XsdSchema requestService) {
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

//	@Bean(name = "RetCustMod")
//	public DefaultWsdl11Definition RetCustModServiceWsdl11Definition(XsdSchema RetCustMod) {
//		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//		wsdl11Definition.setPortTypeName("fiPort");
//		wsdl11Definition.setLocationUri("/fi");
//		wsdl11Definition.setTargetNamespace("http://webservice.fiusb.ci.infosys.com");
//		wsdl11Definition.setSchema(RetCustMod);
//		return wsdl11Definition;
//	}
//
//	@Bean
//	public XsdSchema RetCustMod() {
//		return new SimpleXsdSchema(new ClassPathResource("RetCustMod.xsd"));
//	}
//
//	@Bean(name = "SignatureAdd")
//	public DefaultWsdl11Definition SignatureAddServiceWsdl11Definition(XsdSchema SignatureAdd) {
//		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//		wsdl11Definition.setPortTypeName("fiPort");
//		wsdl11Definition.setLocationUri("/fi");
//		wsdl11Definition.setTargetNamespace("http://webservice.fiusb.ci.infosys.com");
//		wsdl11Definition.setSchema(SignatureAdd);
//		return wsdl11Definition;
//	}
//
//	@Bean
//	public XsdSchema SignatureAdd() {
//		return new SimpleXsdSchema(new ClassPathResource("SignatureAdd.xsd"));
//	}

}

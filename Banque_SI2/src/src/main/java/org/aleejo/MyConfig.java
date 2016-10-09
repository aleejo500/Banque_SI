package org.aleejo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {
	@Bean
	public SimpleJaxWsServiceExporter getJWS(){
		SimpleJaxWsServiceExporter expo=new SimpleJaxWsServiceExporter();
		expo.setBaseAddress("http://localhost:8089/MaBanque");
		return expo;
	}
}
	

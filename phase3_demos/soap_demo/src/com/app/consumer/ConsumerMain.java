package com.app.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.app.service.HelloService;

public class ConsumerMain {

	public static void main(String[] args) {
		
		String endpoint="http://localhost:7000/hello?wsdl";
		
		try {
			URL url=new URL(endpoint);
			
			QName qName=new QName("http://impl.service.app.com/", "HelloServiceImplService");
			/*
			 * Param 1 in Qname is the xmlns:tns(targetnamespace) and 
			 * Param2 is the service name which is associated with name attribute in the same tag
			 */
			Service service=Service.create(url,qName);
			
			HelloService helloService=service.getPort(HelloService.class);
			System.out.println("Accessing the services in client side");
			System.out.println(helloService.sayHello());
			System.out.println(helloService.sayHelloByName("RAM"));
			
		} catch (MalformedURLException e) {
			System.out.println(e);
		}
	}

}

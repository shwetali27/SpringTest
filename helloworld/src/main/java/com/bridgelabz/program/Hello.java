/*
*@file_Name: Hello.java
*@Author: Shwetali
*@Date: 14-09-2016
*@purpose: Main program for Printing hello using spring and maven.
*/


package com.bridgelabz.program;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
 
 
public class Hello {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
		// loading the definitions from the given XML file
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*instead of using context we can use:
		 * Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory context = new XmlBeanFactory(resource);*/
			
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		
		String message = service.sayHello();
		System.out.println(message);
 
		//set a new name
		service.setName("Shwetali");
		message = service.sayHello();
		System.out.println(message);
	}
}
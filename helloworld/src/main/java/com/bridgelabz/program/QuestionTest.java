/*
*@file_Name: Question.java
*@Author: Shwetali
*@Date: 14-09-2016
*@purpose: Main class, Constructor Injection with Non-String Collection(having Dependent Object) Spring maven.
*/

package com.bridgelabz.program;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class QuestionTest {  
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Question question=(Question)factory.getBean("question");  
	    question.displayInfo();  
	      
	}  
}

/*
*@file_Name: HelloWorldService.java
*@Author: Shwetali
*@Date: 14-09-2016
*@purpose: class for getting and setting name for Hello class.
*/


package com.bridgelabz.program;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorldService {
 
	private String name;
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name;
	}
}
/*
*@file_Name: Answer.java
*@Author: Shwetali
*@Date: 14-09-2016
*@purpose: Main class, Constructor Injection with Non-String Collection(having Dependent Object) Spring maven.
*/

package com.bridgelabz.program;

public class Answer {  
	private int id;  
	private String name;  
	private String by;  
	  
	public Answer() {}  
	public Answer(int id, String name, String by) {  
	    this.id = id;  
	    this.name = name;  
	    this.by = by;  
	}  
	
	//getting value for each answer list
	public String toString(){  
	    return id+" "+name+" -"+by;  
	}
}  
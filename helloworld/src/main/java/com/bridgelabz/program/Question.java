/*
*@file_Name: Question.java
*@Author: Shwetali
*@Date: 14-09-2016
*@purpose: Constructor Injection with Non-String Collection (having Dependent Object) Spring using maven.
*/

package com.bridgelabz.program;

import java.util.Iterator;  
import java.util.List;  
  
public class Question {    
	private String id,name;  
	private List<Answer> answers;  
	  
	public Question() {}  
	public Question(String id, String name, List<Answer> answers) {  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("Answers are:");  
	    Iterator<Answer> itr=answers.iterator();  
	    while(itr.hasNext()){  
	    	System.out.println(itr.next());//toString method of Answer method will automatically get called 
	    	//System.out.println(itr.next().toString());//or we can call it using .toString()

	    }
	}  
	  
}  
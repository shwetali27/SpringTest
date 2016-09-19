/*
*@file_Name: Employee.java
*@Author: Shwetali
*@Date: 19-09-2016
*@purpose: pojo class for employee getters & setters.
*/

package com.bridgelabz.dto;

public class Employee {
	int id;
	String name;
	float salary;
	
	//constructors
	public Employee(){}
	public Employee(int id,String name,float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

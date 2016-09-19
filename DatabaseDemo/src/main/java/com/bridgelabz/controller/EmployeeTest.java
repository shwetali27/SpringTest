/*
*@file_Name: EmployeeTest.java
*@Author: Shwetali
*@Date: 19-09-2016
*@purpose: main file for employee data entry program(Maven Technology).
*/

package com.bridgelabz.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.dao.EmployeeDao;
import com.bridgelabz.dto.Employee;

public class EmployeeTest {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao)ctx.getBean("empdao");
		
		/*int status = employeeDao.saveEmployee(new Employee(1,"ABC",5000));
		if(status==1)
			System.out.println("Value inserted successfully");
		*/
		
		int status1 = employeeDao.updateEmployeeSet(new Employee(2,"lmn",00));
		if(status1==1)
			System.out.println("Updated succesfully");
		
		Employee employee = new Employee(); 
		employee.setId(1); 
		int status2=employeeDao.deleteEmployee(employee);
		if(status2==1)
		System.out.println("Deleted succesfully");
		
	}
}

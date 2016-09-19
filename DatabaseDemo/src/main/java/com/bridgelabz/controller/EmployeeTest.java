/*
*@file_Name: EmployeeTest.java
*@Author: Shwetali
*@Date: 19-09-2016
*@purpose: main file for employee data entry program(Maven Technology).
*/

package com.bridgelabz.controller;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelabz.dao.EmployeeDao;
import com.bridgelabz.dao.EmployeeShowDataDao;
import com.bridgelabz.dto.Employee;

public class EmployeeTest {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao employeeDao = (EmployeeDao)ctx.getBean("empdao");
		EmployeeShowDataDao employeeShowDao = (EmployeeShowDataDao)ctx.getBean("empShowDao");
		
		//adding data inside database
		int status = employeeDao.saveEmployee(new Employee(4,"Nitin",10000));
		if(status==1)
			System.out.println("Value inserted successfully");
		
		//updating data
		int status1 = employeeDao.updateEmployeeSet(new Employee(2,"Jay",2000));
		if(status1==1)
			System.out.println("Updated successfully");
		
		//Deleting Data
		Employee employee = new Employee(); 
		employee.setId(4); 
		int status2=employeeDao.deleteEmployee(employee);
		if(status2==1)
			System.out.println("Deleted successfully");
			
	    //show data
	    System.out.println("\nValues inside Database:");
	    System.out.println("ID	Name		Salary\n-----------------------------------");
	    ArrayList<Employee> list=employeeShowDao.getAllEmployees();  
        
	    for(Employee e:list)  
	        System.out.println(e.getId()+"	"+e.getName()+"		"+e.getSalary()+"	Rs.");  

		
	}
}

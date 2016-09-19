/*
*@file_Name: EmployeeDao.java
*@Author: Shwetali
*@Date: 19-09-2016
*@purpose: EmployeeDao class for jdbc connection.
*/

package com.bridgelabz.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.bridgelabz.dto.Employee;

//class for jdbc connection
public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	//getter and setter for JdbcTemplate
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//saving the data into database
	public int saveEmployee(Employee e){
		String query = "insert into employee (id,name,salary) values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jdbcTemplate.update(query); 
	}
	
	//updating the data into database
	public int updateEmployeeSet(Employee e){
				
		String query="update employee set name='"
		+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
		return jdbcTemplate.update(query);
	}
	
	//deleting from the database
		public int deleteEmployee(Employee e){  
		String query="delete from employee where id='"+e.getId()+"' ";  
		return jdbcTemplate.update(query);  
	} 
}

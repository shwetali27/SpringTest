/*
*@file_Name: EmployeeShowDataDao.java
*@Author: Shwetali
*@Date: 19-09-2016
*@purpose: EmployeeShowDataDao class for reading jdbc values.
*/

package com.bridgelabz.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bridgelabz.dto.Employee;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeShowDataDao {
	private JdbcTemplate jdbcTemplate;

	//getter and setter for JdbcTemplate
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//getting values from database
	@SuppressWarnings("unchecked")
	public ArrayList<Employee> getAllEmployees(){
		return jdbcTemplate.query("select*from employee", new ResultSetExtractor(){
			public ArrayList<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				ArrayList<Employee> list = new ArrayList<Employee>();
				while(rs.next()){
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setSalary(rs.getLong(3));
					
					list.add(employee);
					
				}
				return list;
			}
			
		});
	
	}
}

package com.cg.dao;

import java.util.List;

import com.cg.beans.Employee;


public class EmployeeDao {
	public List<Employee> getEmployeeList(){
		return EmployeeCollection.empList;
	}
}

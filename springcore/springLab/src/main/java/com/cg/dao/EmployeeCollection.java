package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.beans.Employee;

public class EmployeeCollection {

	public static  List<Employee> empList;
	static {
		empList = new ArrayList<>();
		empList.add(new Employee(12345,"Harriet",400000, 40));
		empList.add(new Employee(2566,"Rama",23165.2,29));
	}
}


package com.cg.services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.MyJavaConfig;
import com.cg.beans.Employee;


public class EmployeeService {
	

	AbstractApplicationContext bf=new AnnotationConfigApplicationContext(MyJavaConfig.class);
	
	public void displayEmployee() {
		Employee emp = (Employee) bf.getBean("employee");
		System.out.println(emp);
	}
	
	
}

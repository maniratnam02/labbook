package com.cg.lab2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.Configuration;

import com.cg.lab2.beans.Employee;
import com.cg.lab2.beans.SBU;



public class App {
	public static void main(String[] args) {
		App app=new App();
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	Employee employee=context.getBean(Employee.class);
    	app.display(employee);
    	
    }
    public void display(Employee employee) {
    	SBU sbu=employee.getBusinessunit();
    	System.out.println("Employee ["+ employee.getEmployeeName()+" - "+employee.getEmployeeId()+" - "+employee.getSalary()+" - "+employee.getBusinessunit());
    	System.out.println("sbu details = SBU[ "+sbu.getSbuCode()+" - "+sbu.getSubName()+" - "+sbu.getSubHead());
    }
}
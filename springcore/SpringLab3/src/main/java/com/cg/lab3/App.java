package com.cg.lab3;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import org.springframework.context.annotation.Configuration;

import com.cg.lab3.beans.Employee;
import com.cg.lab3.beans.SBU;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App app=new App();
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	SBU sbu=context.getBean(SBU.class);
    	List<Employee>list=sbu.getEmplist();
    	app.display(list);
    	
    	
    }
    public void display(List<Employee> list) {
    	System.out.println("Employee Details ........... ");
    	for(Employee emp:list){
    		System.out.println( emp.getEmployeeName()+" - "+emp.getEmployeeId()+" - "+emp.getSalary()+"-"+emp.getAge());
    	}
    	
    }
    
    public void display(SBU sbu) {
    	System.out.println("sbu details = SBU[ "+sbu.getSbuCode()+" - "+sbu.getSubName()+" - "+sbu.getSubHead());
    }
 }

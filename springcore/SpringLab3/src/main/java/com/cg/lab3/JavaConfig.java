package com.cg.lab3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.cg.lab3.beans.Employee;
import com.cg.lab3.beans.SBU;

@PropertySource("classpath:Lab3.properties")
@ComponentScan("com.cg.lab3")
@Configuration
public class JavaConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public SBU getSBU() {
		SBU sbu=new SBU();
		List<Employee>list=employeesList();
		sbu.setEmplist(list);
		return sbu;
	}
	
	
	public List<Employee> employeesList() {
		Integer id1=environment.getProperty("employeeId1",Integer.class);
		List<Employee> emplist=new ArrayList<Employee>();
		Employee emp1=new Employee(id1,"Henry",50000,30);
		Employee emp2=new Employee(1235,"Cavil",20000,22);
		
		emplist.add(emp1);
		emplist.add(emp2);
		
		return emplist;
	}

}

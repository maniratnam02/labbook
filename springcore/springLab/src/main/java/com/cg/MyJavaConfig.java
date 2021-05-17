package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.beans.Employee;
import com.cg.beans.SBU;
import com.cg.dao.EmployeeDao;



@Configuration
public class MyJavaConfig {
	@Bean(autowire = Autowire.BY_NAME)
	public SBU sbu() {
		return new SBU();
	}
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
	
	@Bean()
	public List<Employee> empList(){
		return new EmployeeDao().getEmployeeList();
	}

}

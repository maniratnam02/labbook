package com.cg.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class SBU {
	
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	
	private List<Employee> empList;

	public String getSbuId() {
		return sbuId;
	}

	@Value("PES-SBU")
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	@Value("Product Engineering Services")
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	@Value("Kiran Rao")
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}


	public List<Employee> getEmpList() {
		return empList;
	}

	@Autowired
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", \nEmp Details:------\n" + empList + "]";
	}
}

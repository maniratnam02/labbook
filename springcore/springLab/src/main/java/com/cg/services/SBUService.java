package com.cg.services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.MyJavaConfig;
import com.cg.beans.SBU;


public class SBUService {
	

	AbstractApplicationContext bf=new AnnotationConfigApplicationContext(MyJavaConfig.class);
	
	public void displaySBU() {
		SBU sbu = (SBU) bf.getBean("sbu");
		System.out.println(sbu);
	}
	
	
}

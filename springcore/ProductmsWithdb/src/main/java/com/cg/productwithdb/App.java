package com.cg.productwithdb;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.productwithdb.ui.FrontEnd;

public class App {
	
    public static void main( String[] args ){
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	FrontEnd frontend=context.getBean(FrontEnd.class);
    	frontend.start();
    	
    }
    
    
}

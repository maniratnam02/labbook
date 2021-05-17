package com.cg.lab2;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:lab2.properties")
@ComponentScan("com.cg.lab2")
@Configuration
public class JavaConfig {

}

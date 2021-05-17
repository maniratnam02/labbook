package com.cg.lab2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	
	@Value("${sbuCode}")
	private String sbuCode;
	@Value("${sbuName}")
	private String subName;
	@Value("${sbuHead}")
	private String subHead;
	public SBU() {
		
	}
	
	public SBU(String sbuCode, String subName, String subHead) {
		this.sbuCode = sbuCode;
		this.subName = subName;
		this.subHead = subHead;
	}
	
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubHead() {
		return subHead;
	}
	public void setSubHead(String subHead) {
		this.subHead = subHead;
	}
}

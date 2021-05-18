package com.cg.productwithdb.exceptions;

public class InvalidPriceException extends RuntimeException{
	public InvalidPriceException(String msg) {
		super(msg);
	}
}

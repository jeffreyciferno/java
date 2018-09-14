package com.csc205.demos.module2.exceptions;

public class CustomImplemetation {
	
	
	public void execute() throws CustomException {
		
		boolean value = false;
		if (!value) {
			try {
				throw new NullPointerException();
			} catch (Exception e) {
				throw new CustomException("Hi there!", e);
			}
		}
		
		throw new CustomException("Hi There!");
	}

}

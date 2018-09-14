package com.csc205.demos.module2.exceptions;

public class CustomTester {

	public static void main(String[] args) {
		
		CustomImplemetation customImplemetation = new CustomImplemetation();
		
		try {
		customImplemetation.execute();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

}

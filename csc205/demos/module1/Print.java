package com.csc205.demos.module1;

import java.awt.Color;

public class Print {

	public static void main(String[] args) {
		Car car = new Car();
		car.color = Color.BLACK;
		car.milage= 50;
		car.running = false;
		
		System.out.println(car.toString());
	}
	
	
	private static class Builder {
		
	}
}

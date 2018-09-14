package com.csc205.activities.activity3;

public class Rectangle implements Shape {

	double length;
	double width;
	
	public Rectangle() {
	this(0.0, 0.0);
	}
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
	double x = (length)*(width);
		return x;
	}

	@Override
	public double calculatePerimeter() {
		double y = ((2 * length) + (2 * width));
		return y;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [length=");
		builder.append(length);
		builder.append(", width=");
		builder.append(width);
		builder.append("]");
		return builder.toString();
	}

	
}

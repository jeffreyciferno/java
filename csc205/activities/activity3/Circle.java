package com.csc205.activities.activity3;

public class Circle implements Shape {
	double radius;
	public Circle() {
	this(0.0);
	}
	public Circle(double radius) {
	this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
	double x = (radius * radius);
		return x;
	}

	@Override
	public double calculatePerimeter() {
		double y = ((2)*(Math.PI) * (radius));
		return y;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [getRadius()=");
		builder.append(getRadius());
		builder.append(", calculateArea()=");
		builder.append(calculateArea());
		builder.append(", calculatePerimeter()=");
		builder.append(calculatePerimeter());
		builder.append("]");
		return builder.toString();
	}
	
}

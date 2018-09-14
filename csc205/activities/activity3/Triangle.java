package com.csc205.activities.activity3;

public class Triangle implements Shape {
double base;
double height;
	
	public Triangle() {
	this(0.0, 0.0);
	}
	public Triangle(double base, double height) {
	this.base = base;
	this.height = height;
	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateArea() {
		double x = (1/2)*(this.base)*(this.height);
		return x;
	}

	/**
	 * Ssumes equilateral triangle
	 * Not enough info for other triangles
	 */
	public double calculatePerimeter() {
		double perimeter = 0.0;
		double equilateralHeight = (Math.sqrt(3)/ 2.0) * this.base;
		if (Math.abs(this.height - equilateralHeight)  < 0.0001) {
			perimeter = 3 * this.base;
		}
		return perimeter;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangle [getBase()=");
		builder.append(getBase());
		builder.append(", getHeight()=");
		builder.append(getHeight());
		builder.append(", calculateArea()=");
		builder.append(calculateArea());
		builder.append(", calculatePerimeter()=");
		builder.append(calculatePerimeter());
		builder.append("]");
		return builder.toString();
	}
	
}

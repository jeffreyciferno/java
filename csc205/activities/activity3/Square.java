package com.csc205.activities.activity3;

public class Square extends Rectangle implements Shape {

	public Square() {
		
	}
	public Square(double width) {
		super(width, width);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Square [calculateArea()=");
		builder.append(calculateArea());
		builder.append(", calculatePerimeter()=");
		builder.append(calculatePerimeter());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append("]");
		return builder.toString();
	}
	
}

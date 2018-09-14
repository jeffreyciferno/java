package com.csc205.projects.project2;
/**
 * Class name as well as stating that Cylinder extends Shape
 * @author Jeffrey
 * <p>
 * Variables
 */
public class Cylinder  extends Shape {
private double radius;
private double height;
/**
 * Main method sets variables to zero.
 */
public Cylinder() {
this(0.0, 0.0);
}
/**
 * Overloaded method which instanciates the variables radius and height. 
 * @param radius
 * @param height
 */
public Cylinder(double radius, double height) {
 this.radius = radius;
 this.height = height;
}
/**
 * Calculates the volume of a cylinder using variables radius and height. Based on mathematical formula for volume.
 
 */
public double volume() {

return Math.PI * (radius * radius) * height;
}
/**
 * Calculates the surface area of a cylinder using variables radius and height. Based on mathematical formula for surface area.
 * 
 */
public double surfaceArea() {

return ((2*Math.PI*radius*height)+(2*Math.PI*(radius*radius)));
}
/**
 * Method to delcare the variable values in class: Cylinder.
 */
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Cylinder {radius=");
	builder.append(radius);
	builder.append(", height=");
	builder.append(height);
	builder.append("}");
	return builder.toString();
}

}


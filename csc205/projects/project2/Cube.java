package com.csc205.projects.project2;
/**
 * Class name as well as stating that Cube extends Shape
 * @author Jeffrey
 * <p>
 * Variables
 */
public class Cube extends Shape{
private double width;

/**
 * Main method sets variable to zero.
 */
public Cube() {
this(0.0);
}
/**
 * Overloaded method which instanciates the variable width.
 * @param width
 * 
 */
public Cube(double width) {
 this.width = width;
}
/**
 * Calculates the volume of a cube using variable width. Based on mathematical formula for volume.
 */
public double volume() {

return width * width * width;
}
/**
 * Calculates the surface area of a cube using variable width. Based on mathematical formula for surface area.
 */
public double surfaceArea() {

return (6 * (width * width));
}
/**
 * Method to delcare the variable values in class: Cube.
 */
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Cube {width=");
	builder.append(width);
	builder.append("}");
	return builder.toString();
}



}
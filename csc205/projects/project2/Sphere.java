package com.csc205.projects.project2;
/**
 * Class name as well as stating that Sphere extends Shape
 * @author Jeffrey
 * <p>
 * Variables
 */
public class Sphere extends Shape {
	private double radius;
	/**
	 * Main method sets variables to zero.
	 */
	public Sphere() {
		this(0.0);
	}
	/**
	 * Overloaded method which instanciates the variables radius. 
	 * 
	 */
	public Sphere(double radius) {
	 this.radius = radius;
	}
	/**
	 * Calculates the volume of a sphere using variables radius. Based on mathematical formula for volume.
	 * 
	 */
	public double volume() {
	
	return (4*Math.PI *((radius* radius *radius)/3));
	}
	/**
	 * Calculates the surface area of a sphere using variables radius. Based on mathematical formula for surface area.
	 * 
	 */
	public double surfaceArea() {

	return (4*Math.PI*(radius*radius));
	}
	/**
	 * Method to delcare the variable values in class: Sphere.
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sphere {radius=");
		builder.append(radius);
		builder.append("}");
		return builder.toString();
	}
	
	
}

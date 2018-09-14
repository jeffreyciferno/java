package com.csc205.projects.project1;
/**
 * Point.java
 * Java program that sets, gets, mutates variables x and y through many ways such as rotation and shifting. Based on a point (x,y) system.
 * <p>
 * Written:1/20/18
 * @author Jeffrey Ciferno
 *
 */
public class Point {
/**
 * Instance Variables
 * 
 * Creates variables to represent a coordinate pair
 */

	private double x = 0.0;
	private double y = 0.0;
/**
 * Constructor methods used throughput the program
 */
public Point()
{
this.x = 0;
this.y = 0;
}

public Point(double x, double y)
{
this.x = x;
this.y = y;
}

/**
 * @return Retreives the double value X variable
 */
public double getX() {
	return this.x;
}

/**
 *  @return Retreives the double value Y variable
 */
public double getY() {
	return this.y;
}

/**
 * Sets value of the x variable to parameter xx
 * @param xx
 */
public void setX(double xx) {
	this.x = xx;
}

/**
 *Sets value of the y variable to parameter yy
 * @param yy
 */
public void setY(double yy) {
	this.y = yy;
}

/**
 * 
 * Shifts y value by the amount given in parameter n 
 * @param n
 */
public void shiftX(double n) {
	this.x+=n;
}

/**
 *  Shifts y value by the amount given in parameter n 
 * @param n
 */
public void shiftY(double n) {
	this.y+=n;
}
/**
 * Creates a point system by using variables x,y and setting based on changing function
 * <p>
 * Sets x and y to parameters X and Y
 */
public void setPoint(double X, double Y) {
	this.x = X;
	this.y = Y;
	}

/**
 * Calculates the distance between implemented points
 * @param n
 * @return The distance between them as value "distance"
 */

public double distance (Point n) {
double x2 = n.getX();
double y2 = n.getY();
double distance = Math.hypot(x2 - this.x, y2 - this.y);
return distance;
}
 /**
  * Rotates the function by implementing x,y into a mathematical rotation formula
  * Given value n 
  * @param n
  */
public void rotate(double n) {
double xx;
double yy;
xx = ((this.x * Math.cos(n)) - (this.y * Math.sin(n)));
yy = ((this.x * Math.sin(n)) + (this.y * Math.cos(n)));
this.x = xx;
this.y = yy;
}

/**Method to delcare the instance variable values in program: Point
 * 
 */
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Point [x=");
	builder.append(x);
	builder.append(", y=");
	builder.append(y);
	builder.append("]");
	return builder.toString();
}


}

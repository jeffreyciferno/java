package com.csc205.activities.activity3;

public class AreaCalculator {

	public static void main(String[] args) {

		Shape s1 = new Square(8);		
		Shape r1 = new Rectangle(10.0, 4.0);
		Shape c1 = new Circle(5.0);
		Shape t1 = new Triangle(4.0, 7.0);

		System.out.println(s1);
		System.out.println(r1);
		System.out.println(c1);
		System.out.println(t1);
		
		Shape[] shapes = new Shape[4];
		
		shapes[0] = s1;
		shapes[1] = r1;
		shapes[2] = c1;
		shapes[3] = t1;
		
		double area = 0;
		
		for (int x = 0; x < shapes.length ; x++) {
			area += shapes[x].calculateArea();
		}
	
		System.out.println("Total Area: " + area);
	}

}

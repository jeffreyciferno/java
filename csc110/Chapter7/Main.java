package Chapter7;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

public double Riemann() {
double a = 0;
double b = 0;
double n = 0;
public static double leftSum(a, b, n); {
double deltaX = (b - a) / n; // finds the deltaX
double x = a;
double area = 0.0;
arrayList<> rectAreas = new arrayList<>();
}

for(int i = 0; i < n; i++) {
area = deltaX * (1 / x); // finds the area of one rectangle
a = a + deltaX; // finds the next width of the rectangle
rectAreas.add(area); // Adds each area to the array for later summation.
}

double areaSum = 0.0;

for(int j = 0;j < rectAreas.size;j++) {
areaSum = areaSum + rectAreas.get(j); // Finds the sum of the array, yielding LH sum.
}
System.out.println("The left-hand sum is " + areaSum); //Answer should print here
}


private void leftSum(double a, double b, double n) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter your Lower Bound: ");
	a = scan.nextDouble();
	System.out.print("Please enter your Upper Bound: ");
	b = scan.nextDouble();
	System.out.print("Please enter Please enter the number of rectangles to calculate: ");
	n = scan.nextDouble();
	
	
	
}}
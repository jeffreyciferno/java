package Chapter7;

import java.util.Scanner;

public class Integrator {

	//define the real function
	public static double f(double x) {
		return (x*x);
	}

public static double Integrate(double a, double b, double n)
{
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter your Lower Bound: ");
	a = scan.nextDouble();
	System.out.print("Please enter your Upper Bound: ");
	b = scan.nextDouble();
	System.out.print("If infinity please enter -1,");
	System.out.print("Else enter the number of rectangles to calculate: ");
	n = scan.nextDouble();
	if(n == -1)
	{
	n = Integer.MAX_VALUE;
	}
	
	//interval
	double sum = 0;
	double h = 0;
	double i= 0;
	//integration process
	if(a>b)
	{
	  Integrate(a,b,n);
	}
	else
	{
		h = (b-a)/n;
		for(i=a;i<b;i=i+h)
		{
			sum = sum + h*f(i);
		}
	}
	return sum;
}
//Integer.MAX_VALUE
public static void main(String[] args)
{ 
	
	System.out.println("The Area is: " + Integrator.Integrate(0, 0, 0));
}}

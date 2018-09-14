
//Program ID : CinemaPriceEnhanced
//Author : Jeff Ciferno
//Date Written : 9/26/17
//Class : CSC110AB
//Brief Description:
//		This program determines cinema price based on age. Uses while loop.  
package Chapter4;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class CinemaPriceEnhanced
{
	public static void main(String[] args)
	{
		int age = 1;
		double cinemaprice = 0.00;
		Random generator = new Random();
		
		DecimalFormat dft = new DecimalFormat("$0.00");
		Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter cinema ticket price:");
			cinemaprice = scan.nextDouble();
			
		while (age > 0) 
		{
			 System.out.println("Please enter your age (0 to quit):");
				age =scan.nextInt();
				
				
		 if (age == 0)
				{
				System.out.println("Goodbye!");
				}	
		 else if (age<5 && age>0)
		{	System.out.println("Your age: " +age);
			System.out.println("Your ticket price is "+ dft.format(cinemaprice*0)+ " which is free.");
	
		}
		else if (age <=12)
		{  System.out.println("Your age: " +age);
			System.out.println("Your ticket price is " + dft.format(cinemaprice*0.5)+ " which is half price.");
		
		}
		else if (age<=54)
		{System.out.println("Your age: " +age);
		System.out.println("Your ticket price is " + dft.format(cinemaprice*1)+ " which is full price.");
		
		}
		
		else if (age >= 55)
		{   System.out.println("Your age: " +age);
			System.out.println("Your ticket price is "+ dft.format(cinemaprice*0) + " which is free.");
		
		}
	
			
	}}}


	
	    

/*

Please enter cinema ticket price:
15
Please enter your age (0 to quit):
10
Your age: 10
Your ticket price is $7.50 which is half price.
Please enter your age (0 to quit):
24
Your age: 24
Your ticket price is $15.00 which is full price.
Please enter your age (0 to quit):
0
Goodbye!

*/
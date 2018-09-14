package Chapter2;
////Program name: Seconds
//Author: Jeff Ciferno
//Class: CSC110AB
//Date Written: 9/4/2017
//Brief Description: Small calculator that computes average test score.
import java.util.Scanner;

public class Exam {

	public static void main (String[] args) {
		
		 int first = 90;
				
		 int second = 91;
		 
		 int third = 100;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first exam score:");
		 first = scan.nextInt();
		System.out.println("Enter the second exam score:");
		 second = scan.nextInt();
		System.out.println("Enter the third exam score:");
		 third = scan.nextInt();
		
		 double average = ((first + second + third)/3.0);
		
		 System.out.println("The average exam score is: " + average);
		 
	 }
}
/*
OUTPUT:

Enter the first exam score:
90
Enter the second exam score:
91
Enter the third exam score:
100
The average exam score is: 93.66666666666667
*/
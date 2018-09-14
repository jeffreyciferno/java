package Chapter2;
////Program name: Seconds
//Author: Jeff Ciferno
//Class: CSC110AB
//Date Written: 9/4/2017
//Brief Description: Small calculator that computes seconds.

import java.util.Scanner;

public class Seconds {
	
	public static void main(String[] args) {
	
			int HOURS = 1;
			int MINUTES = 60;
			int SECONDS = 60;
			
 Scanner scan = new Scanner(System.in);
System.out.println("Second Calculator");
System.out.println("Please Enter Hours:");
HOURS = scan.nextInt();
System.out.println("Please Enter Minutes:");
MINUTES = scan.nextInt();
System.out.println("Please Enter Seconds:");
SECONDS = scan.nextInt();

	int finish = ((HOURS*60*60) + (MINUTES*60) + (SECONDS));
System.out.println("Total Seconds:" + finish);	
	}}

/*
OUTPUT:

CASE1:
Second Calculator
Please Enter Hours:
1
Please Enter Minutes:
1
Please Enter Seconds:
2
Total Seconds:3662

CASE 2:
Second Calculator
Please Enter Hours:
1
Please Enter Minutes:
45
Please Enter Seconds:
0
Total Seconds:6300

CASE 3:
Second Calculator
Please Enter Hours:
0
Please Enter Minutes:
6
Please Enter Seconds:
0
Total Seconds:360
*/
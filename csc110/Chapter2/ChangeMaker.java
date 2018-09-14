package Chapter2;
////Program name: Seconds
//Author: Jeff Ciferno
//Class: CSC110AB
//Date Written: 9/4/2017
//Brief Description: Small calculator that computes average test score.

import java.util.Scanner;

public class ChangeMaker {

	public static void main (String[] args) {
			int Totalvalue = 1;
		final int VALUE_OF_QUARTER = 25;
		final int VALUE_OF_DIME = 10;
		final int VALUE_OF_NICKEL = 5;
		final int VALUE_OF_PENNY = 1;
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to ChangeMaker.\n" + "I will find a combination of coins\n" + "that equals that amount of change\n" + "you should receive!\n");
	System.out.println("Please enter an amount from 1 to 99:");
	Totalvalue = scan.nextInt();
	
	 int numberofquarters = Totalvalue/VALUE_OF_QUARTER;
	 int remainder1 = Totalvalue%VALUE_OF_QUARTER;
	 int numberofdimes = remainder1/VALUE_OF_DIME;
	 int remainder2 = remainder1%VALUE_OF_DIME;
	 int numberofnickels = remainder2/VALUE_OF_NICKEL;
	 int remainder3 = remainder2%VALUE_OF_NICKEL;
	 int numberofpennies = remainder3/VALUE_OF_PENNY;
	 
	System.out.println(numberofquarters +" quarters");
	System.out.println(numberofdimes +" dimes");
	System.out.println(numberofnickels +" nickels and");
	System.out.println(numberofpennies +" pennies");
	
}}

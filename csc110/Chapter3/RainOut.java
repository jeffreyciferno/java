package Chapter3;
//**********************************************************
//Program Name: RainOut.java  Chapter 3 Activity 2
//Author : 
//Date Written : 
//Class : CSC110/CIS163
//
//Brief Description:  Review the String, Scanner, and Random Classes
//**************************************************************

import java.util.Random;
import java.util.Scanner;


public class RainOut 
{
	public static void main(String[] args) 
	{
		//declare variables and initialize	
		String city = " ";
		int rainfall = 0;
		Scanner scan = new Scanner(System.in);
		Random gen = new Random();
		String city = new string ("");
		System.out.print("In what city do you live? ");
		//read user input and put into city
		city = scan.nextLine();
		//generate random rainfall values between 3 and 6 inches
		Random generator = new Random();
		rainfall = gen.nextInt(4)+ 3;
		
		System.out.println(city + " received " + rainfall + " inches of rain on Monday!!");		
		scan.close();
		
		//display how many characters are in the String city
		System.out.println(city + " has " + "????" + " characters.");
		city.substring(0,3);
		//display the first 3 characters of the String city
		System.out.println("The first 3 characters of " + city + " are " + city.substring(0,3) " ??? " + ".");
	}

}
//What if the city is Gila Bend, or Casa Grande?  Does your code still work?

/* possible output
In what city do you live? Chandler
Chandler received 6 inches of rain on Monday!!
Chandler has 8 characters.
The first 3 characters of Chandler are Cha.
*/

//Program Name: ExceptionActivity2.java
//Author:  Edward Wang, Kaden Stones, Obed Miranda, Steven Cai
//
//Instructions (that you should probably read):
/*
1. Use import java.util.Scanner for input from the user.
2. Write another class inside ExceptionActivity2 that extends Exception.
3. Create the constructor.
4. Instantiate the exception object in main.
5. Throw and catch the error.

 */
package Chapter10;
import java.util.Scanner;

public class ExceptionActivity2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String string1 = " ";
		do 
		{
		try {
		
	
		//Instantiate your exception like you would a class.
		System.out.print("Enter strings(type DONE to finish): ");
		string1 = input.nextLine();
		if (string1.length() >= 20)
		 throw new YourException("yeet");
		}
		catch (YourException e)
		{
			System.err.println(" : You enter too mcuhhhhh");
		}
	}while(!string1.equals("DONE"));
	
		System.out.println("Bye");
}
		//Use a loop that asks the user for a string and throws an exception when the string is over 20 characters
		
}

class YourException extends Exception
{
	YourException(String message) {
		super(message);
		
	}
}
	
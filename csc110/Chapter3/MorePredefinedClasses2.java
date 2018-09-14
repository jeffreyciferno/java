package Chapter3;
/* 
  Program Name : MorePredefinedClasses2.java
  Author : P Baker
  Date Written : 
  Class : CSC110AA/AB and CIS163AA
  
  Brief Description: 
		   Ch 3 -  Introduces some more predefined classes
		  -Math
		  -DecimalFormat
		  
  */
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MorePredefinedClasses2 {

	public static void main(String[] args) {
	
		double num1;
		double num2;
		double num3;
		double price;

		/*
		 * Example: Using the Math class. Ch 3.5 This class is automatically available.
		 * No import statement is needed. This is a unique class, all methods are
		 * static, and we do not create Math objects. We just call the methods with the
		 * class name.
		 * 
		 * Example: Take the square root of a number (must be pos) Example: Show how to
		 * use the pow function
		 */

		num1 = Math.sqrt(4);
		System.out.println("The square root of 4 is: " + num1);
		num1 = Math.pow(4, 3);
		System.out.println("4 raised to the 3rd power is : " + num1);
	
		num2 = 7.892;
		num3 = Math.sqrt(num2);
		// System.out.println("The square root of " + num2 + ": " + num3);

		/*
		 * Example: Formatting data Ch 3.6 
		 * Now lets format that number so it only has 2 decimal places 
		 * Step 1. import java.text.DecimalFormat; 
		 * Step 2. Declare and instantiate a DecimalFormat object 
		 * Step 3. Use the format method
		 */

		DecimalFormat dFmt = new DecimalFormat("0.##");
	
		 System.out.println("The square root of " + num2 + ": "
		+ dFmt.format(num3));
	
		// PI is a constant in the Math class
		//System.out.println("The value of PI : " + );
		//System.out.println("the value of PI (formatted): " + );
		
		/*
		 * Example: Currency formatting (money) Ch 3.6 
		 * Lets you format a number as currency with a $ and dollars and cents 
		 * Step 1. import java.text.NumberFormat; 
		 * Step 2. Declare and instantiate a NumberFormat object 
		 * Step 3. Use the format method
		 */
		
		//NumberFormat cFmt = NumberFormat.getCurrencyInstance();
		
		price = 43.239;
		//System.out.println("The price in currency format is: " + );
		
	
	}
	
 }

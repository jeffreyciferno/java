package com.csc205.activities.activity8;

import java.security.InvalidAlgorithmParameterException;
/**
*  Driver for ShuntingYard converter.
*
*  Output should be...
*  <pre>
*  Equation 1: 3 + 4 = 3 4 +
*  Equation 2: 3 + 4 * 2 / ( 1 - 5 ) ^ 2 ^ 3 = 3 4 2 * 1 5 - 2 3 ^ ^ / +
*  Equation 3: 3 * ( 4 + 7 / ( 4 + 5 ) ) = 3 4 7 4 5 + / + *
*  </pre>
*/
public class Driver {
public static void main(String[] args) {
String infix1 = "5 + 3 * 8 / 2";
String infix2 = "3 + 4 * 2 / ( 1 - 5 ) ^ 2 ^ 3";
String infix3 = "3 * ( 4 + 7 / ( 4 + 5 ) )";
try {
System.out.println("Equation 1: " + infix1 + " = " + 
ShuntingYard.convert(infix1));
System.out.println("Equation 2: " + infix2 + " = " + 
ShuntingYard.convert(infix2));
System.out.println("Equation 3: " + infix3 + " = " + 
ShuntingYard.convert(infix3));
} catch (InvalidAlgorithmParameterException e) {
e.printStackTrace();
}
}
}

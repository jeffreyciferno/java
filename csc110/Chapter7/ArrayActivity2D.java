package Chapter7;
//**********************************************************

//  In class Activity - Ch 7 Arrays - 2D/Multidimensional
//  Program Name : ArrayActivity2D.java  Starting File
//
//  Author: Jeff Ciferno james
//  Date Written : Skeleton by PBaker.  Additions by : 
//  Class:
//
//  Brief Description:
//  Intro to 2 dimensional arrays in a java
//  
//**********************************************************

public class ArrayActivity2D {
	public static void main(String[] args) {
		double value = 0.0;
		double sum = 0.0;
		double average = 0.0;
		int countValues = 0;

		// Declare an array called myExams that keeps track of exam scores for 10
		// students.
		// Each student has 3 quiz scores.

		double[][] myExams = new double[10][3];

		// load the array with the values 0 - 29, in order

		for (int i = 0; i < myExams.length; i++) {
			for (int j = 0; j < myExams[i].length; j++) {
				sum += value;
				myExams[i][j] = value++;
			}
		}

		// display all the components of the array
		for (int i = 0; i < myExams.length; i++) {
			for (int j = 0; j < myExams[i].length; j++) {
				System.out.print(myExams[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Display the array\n");

		// add up all the element values in the array

		System.out.println("The sum of the array: " + sum);

		// challenge : calculate the average

		value = 0;
		for (int i = 0; i < myExams.length; i++) {
			for (int j = 0; j < myExams[i].length; j++) {
				value++;
			}

		}
		average = sum / value;
		System.out.println("\nChallenge: Calculate the average ");
		System.out.println("The average is :" + average);

		System.out.println("\nChallenge: Count how many values that are greater than 22: ");

		countValues = 0;

		for (int i = 0; i < myExams.length; i++) {
			
			for (int j = 0; j < myExams[i].length; j++) {
				if(myExams[i][j] > 22)
				countValues++;
			}

		}

		System.out.println("Number of values greater than 22: " + countValues);

	}
}

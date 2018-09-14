package Chapter10;
//Sam Gurtler and Jeff Ciferno
//Cannot read again
import java.util.Scanner;

/* Step 1:  complete all new code as indicated by comments.  Assume no bad input at this time. 
 *          Output should resemble expected output below
 */

/* Step 2:  Now run code and enter 15 for the number of values to load in the array.  
 *          Will generate an exception.  Handle the exception. System.out. a message indicating the issue.
 */

/* Step 3:  Run code and enter "hello" for the number of values to load in the array.
 *          Will generate an exception.  Handle the exception. System.out. a message indicating the issue.
 */

/* Step 4:  Run code and enter 0 for the number of values to load in the array.
 *          Will generate an exception.  Handle the exception. System.out. a message indicating the issue.
 */

/* Step 5:  Catch any unexpected exceptions. System.out. a message indicating the issue.
 * 
 */

/* Step 6:  Submit your completed code.
 * 
 */

public class ExceptionsActivity

{

	public static void main(String[] args)

	{
		int numOfValues = 0;
		int size = 10;
		int[] dataArray = new int[size];
		Scanner keyboard = new Scanner(System.in);
		String tryAgain = "N";

		System.out.println("Welcome to our Exceptions Activity");

		do {

			
				System.out.println("Loading the array");
				System.out.print("How many values do you want to load?");
				try {
				numOfValues = keyboard.nextInt();
				// **new code here**/
				// inside the loop fill the array with 0, 10, 20 , 30, 40 , 50, 60....
				for (int x = 0; x <= numOfValues; x++) {
					dataArray[x] = x * 10;
				}

				System.out.println("My Array");
				System.out.println("-------");

				displayArray(dataArray);
				System.out.println("The average is: " + calculateIntAverage(dataArray, numOfValues));
			} catch (java.util.IllegalArgumentException e) {
				System.out.println("Please enter a natural number.");
			} catch (java.lang.ArrayIndexOutOfBoundsException a) {
				System.out.println("Please enter a natural number <=" +  ".");
			}
			System.out.print("Try again? Y or N: ");
			
			System.out.println( tryAgain = keyboard.next());

		} while (tryAgain.equalsIgnoreCase("Y"));

	}

	// **new code here - complete this method so that the display looks like output
	// below**?
	public static void displayArray(int[] someArray) {
		for (int x = 0; x < someArray.length; x++) {
			System.out.println("[" + x + "]:" + someArray[x]);
		}
	}

	// ** new code here - to calculate an integer average. average should be the sum
	// / num. both sum and num are int**//
	public static int calculateIntAverage(int[] someArray, int num) {
		int sum = 0;
		int ave = 0;

		for (int x = 0; x < someArray.length; x++) {
			sum = sum + someArray[x];
		}
		ave = sum / (num);
		// add up all the values in the array

		return ave;

	}

}

/*
 * Expected good output - no exceptions
 * 
 * Welcome to our Exceptions Activity Loading the array How many values do you
 * want to load?9 My Array ------- [0]: 0 [1]: 10 [2]: 20 [3]: 30 [4]: 40 [5]:
 * 50 [6]: 60 [7]: 70 [8]: 80 [9]: 90 The average is: 50
 */

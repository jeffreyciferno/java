package Chapter10;
/* Program ID:  Statistics Array with Exceptions Starting File*  
 * Class:  CSC110AA/CIS163AA*  
 * Date :11/25/17
 * Author:  Patricia Baker & Jeffrey Ciferno
 *  Brief Description:  Defines a class that has a 10 element integer array
 *  Methods perform tasks for the array - find max, sum, find average, etc**/
public class StatsArrayTester {
	
		public static void main(String[] args) {
			StatsArray values = new StatsArray();
			System.out.println("Welcome to Stats Array" + "\n");
			values.fillArrayFromUser();
			values.displayOut();
			System.out.println();
			System.out.println("Sum of Values: " + values.getSum());
			System.out.println("Average of Values: " + values.getAverage());
			System.out.println("Min Value: " + values.getMin() + "\n");
			System.out.println("Max Value: " + values.getMax());
			values.sortArray();
			System.out.println("Sorted!");
			values.displayOut();
			System.out.println("\nThank you, Goodbye!");
		}
	} 

/*
Welcome to Stats Array

Enter value [0] : 
11
Enter value [1] : 
12.6
Enter value [1] : 
Invalid value - please enter an integer!7
Enter value [2] : 
yeet
Invalid value - please enter an integer!Enter value [2] : 
1
Enter value [3] : 
6
Enter value [4] : 
4
Enter value [5] : 
-7
Negative value - please enter a positive value!
Invalid value - please enter an integer!Enter value [5] : 
16
Enter value [6] : 
42
Enter value [7] : 
300
Enter value [8] : 
35
Enter value [9] : 
18
Current Array Values


Stats [0] : 11
Stats [1] : 7
Stats [2] : 1
Stats [3] : 6
Stats [4] : 4
Stats [5] : 16
Stats [6] : 42
Stats [7] : 300
Stats [8] : 35
Stats [9] : 18

Sum of Values: 440
Average of Values: 44.0
Min Value: 1

Max Value: 300
Sorted!
Current Array Values


Stats [0] : 1
Stats [1] : 4
Stats [2] : 6
Stats [3] : 7
Stats [4] : 11
Stats [5] : 16
Stats [6] : 18
Stats [7] : 35
Stats [8] : 42
Stats [9] : 300

Thank you, Goodbye!




*/
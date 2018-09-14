package Chapter10;

/* Program ID:  Statistics Array with Exceptions Starting File*  
 * Class:  CSC110AA/CIS163AA*  
 * Date :11/25/17
 * Author:  Patricia Baker & Jeffrey Ciferno
 *  Brief Description:  Defines a class that has a 10 element integer array
 *  Methods perform tasks for the array - find max, sum, find average, etc**/
import java.awt.*;
import java.util.Random;

import java.util.Scanner;

public class StatsArray {

	private int size; 
	private int[] stats; 

	
	StatsArray() {
		size = 10;
		stats = new int[size];
	}

	public void display(Graphics g) {
		int x = 50; 
		int y = 40;
		
		for (int i = 0; i < stats.length; i++) {
			g.drawString("Stats [" + i + "] = " + stats[i], x, (y + 15 * i));
		}
	}

	public void fillArray1() {
		
		Random random = new Random();
		for (int i = 0; i < stats.length; i++) {
			stats[i] = random.nextInt(101);
		}
	}

	public int getSum() {
		
		int total = 0;
		for (int i = 0; i < stats.length; i++)
			total = total + stats[i];
		return total;
	}

	public int getMax() {
		
		int maxValue = stats[0];
		for (int i = 0; i < stats.length; i++) {
			if (stats[i] > maxValue)
				maxValue = stats[i];
		}
		return maxValue;
	}

	public int getMin() {
		
		int minValue = stats[0];
		for (int i = 0; i < stats.length; i++) {
			if (stats[i] < minValue)
				minValue = stats[i];
		}
		return minValue;
	}

	public double getAverage() {
		
		return (double) getSum() / stats.length;
	}

	public int countValues(int lowRange, int highRange) {
		
		int count = 0;
		for (int i = 0; i < stats.length; i++) {
			if ((stats[i] >= lowRange) && (stats[i] <= highRange)) {
				count++;
			}
		}
		return count;
	}

	public boolean isValueFound(int someNumber) {
		
		boolean found = false;

		for (int i = 0; (i < stats.length && !found); i++) {
			if (stats[i] == someNumber) {
				found = true;
			}
		}
		return found;
	}
public void sortArray() {
		
		int Value;
		int min;

		for (int i = 0; i < (stats.length - 1); i++) {
			min = i;
			for (int j = (i + 1); j < (stats.length); j++) {
				if (stats[j] < stats[min]) {
					min = j;
				}
			}
			Value = stats[min];
			
			stats[min] = stats[i];
			
			stats[i] = Value;

		}

	}
	public void sortBArray() {

		int Value;

		for (int i = 0; i < (stats.length - 1); i++) {
			for (int j = (i + 1); j < (stats.length); j++) {
				if (stats[j] < stats[i]) {
					Value = stats[i];
					
					stats[i] = stats[j];
					
					stats[j] = Value;
				}
			}
		}

	}

	
	
	public void checkIfNegative(int someValue) {
		if (someValue < 0) {
			System.out.println("Negative value - please enter a positive value!");
			throw new IllegalArgumentException();
		}
	}
	
	public void displayOut() {
		System.out.println("Current Array Values");
		System.out.println("\n");
		
		for (int x = 0; x < stats.length; x++) {
			System.out.println("Stats [" + x + "] : " + stats[x]);
		}
	}
	
	public void fillArrayFromUser() {
		
		Scanner scan = new Scanner(System.in);
		int number = 0;
		
			do {
				try {
				System.out.println("Enter value [" + number + "] : ");
				stats[number] = Integer.parseInt(scan.nextLine());
				checkIfNegative(stats[number]);
				number++;
				}
				
				catch (NumberFormatException e) {
					System.err.print("Invalid value - please enter an integer!");
					stats[number]--;

			}
				catch(IllegalArgumentException e) {
					System.err.print("Invalid value - please enter an integer!");
					stats[number]--;
				}
				
		} while (number < stats.length);
			
	
			
	}

}


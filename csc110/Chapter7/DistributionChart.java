
//********************************************************************
// DistributionChart.java       
// Name:Jeff Ciferno
// Date: 11/6/17
// Class: CSC110AA/CIS163AA
// Description: Design and implement an application called DistributionChart
// that creates a chart/histogram so that you can visually inspect 
// the frequency distribution of a set of values.
//********************************************************************
package Chapter7;
import java.util.Scanner;

public class DistributionChart 
{
	

   public static void main (String[] args)
   {
      int size = 10;
      int[] ranges = new int[size];  
	     
      getData(ranges);  
      
      displayChart(ranges);
      
      System.out.println("\nSee you later!!");
      
   } 
   public static void getData(int[] someArray)
   {
	   Scanner scan = new Scanner (System.in); 
	   System.out.println ("Enter a series of numbers between 1 and 100. Separate each number with a space.");
	   System.out.println ("Signal the end by entering a number outside " +
	         "of that range and then press enter.");
	   System.out.print("Go: ");
	   int value = 0;
       int valueDistribution = 0;
       value = scan.nextInt();
       while (value > 0 && value <= 100) {
           if (value > 0 && value <= 100) {
               valueDistribution = (value-1) / 10;
               someArray[valueDistribution]++;}
           value = scan.nextInt();}
	    scan.close();}
   public static void displayChart(int[] someArray)
   {
	   System.out.println("Distribution Chart by Jeffrey");
       System.out.println("-------------------------------------");
       for (int x = 0; x < someArray.length; x++) {
           System.out.print(((x * 10) + 1) + "-" + ((x * 10) + 10) + "\t|");
           for (int y = 0; y < someArray[x] ; y++) {
               System.out.print("$$$");
           }
           System.out.println();}}}

/* Example output.  
Enter a series of numbers between 1 and 100. Separate each number with a space.
Signal the end by entering a number outside of that range and then press enter.
Go: 1 2 3 4 5 6 70 80 50 30 11 23 101
Distribution Chart by Jeffrey
-------------------------------------
1-10	|$$$$$$$$$$$$$$$$$$
11-20	|$$$
21-30	|$$$$$$
31-40	|
41-50	|$$$
51-60	|
61-70	|$$$
71-80	|$$$
81-90	|
91-100	|

See you later!!
 
 
 */


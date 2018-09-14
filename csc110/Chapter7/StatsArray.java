package Chapter7;
/*
 * CSC110AA/CIS163AA
 * An Integer Array
 *
 * This is the starting code for the StatsArray Assignment
 * The display method and the sortArray methods have been implemented
 *
 *
 * All of the other methods are just returning some default value.  You will need to
 * implement these methods so that they return the appropriate value.
 *
 * Jeff Ciferno
 */

import java.awt.*;

import java.util.Random;  //for our random number generator




public class StatsArray {

	//instance variables
	private int size;  //how big is the array
	private int[] stats; // an array of integers

	//default constructor -overloaded method
	StatsArray() {
		size = 10;
		stats = new int[size] ;  //instantiate the array called stats
	}

	public void display(Graphics g)
	{
		int x = 50;  //coordinates for displaying
		int y = 40;

		//display the array with position number
		for(int i = 0; i < stats.length; i++)
		{
			g.drawString("Stats [" + i + "] = "+ stats[i],
			 x,	(y + 15 * i));
		}
	}

	public void fillArray()
   {
		
		for(int  i= 0; i < stats.length; i++)
		{
			Random random = new Random();
			stats[i] = random.nextInt(101);
		}
		/*fill the array with random numbers (int) in the range 0 - 100.*/
		Random random = new Random();


	}

	public int getSum() 
	{
		//add up all the values in the array
		 int sum =0;
		 for(int  x= 0; x < stats.length; x++) {
			System.out.println("[" + x + "]:" + stats[x]);	
				sum =sum + stats[x];
				
				} 
		 
		return sum;
	}


	public int getMax() 
	{
		//return the maximum value in the array
		int max = stats[0];
		for( int x=0; x < stats.length; x++)
		{
			if (stats[x] > max)
				max = stats[x];
		}
		return max;
	}

	public int getMin()
	{
		//return the minimum value in the array
		//return the maximum value in the array
		int min = stats[0];
		for( int x=0; x < stats.length; x++)
		{
			if (stats[x] < min)
				min = stats[x];
		}
		return min;
	}

	public double getAverage() 
	{
		//add up all the values in the array
		

		 double ave = 0.0000;
		 int sum =0;
		 for(int  x= 0; x < stats.length; x++) {
			System.out.println("[" + x + "]:" + stats[x]);	
				sum =sum + stats[x];
				
				} 
			
				//add up all the values in the array
				
				 for(int  x= 0; x < stats.length; x++) {
					System.out.println("[" + x + "]:" + stats[x]);	
						
					ave= sum/(double)(stats.length);
						} 
		return  ave;
	}

	public int countValues(int lowRange, int highRange) 
	{
		//count how many numbers are >= lowRange and <= highRange
		 
		 int sum = 0;
		for(int  x= 0; x < stats.length; x++) {
		 if( stats[x] >= 90)
		 {
		  sum++;	 
		 }
		
		}		
		return sum;
	}


	public boolean isValueFound(int someNumber) 
	{
		//check to see if someNumber is in the array
		
			//count how many numbers are >= lowRange and <= highRange
			 
			 boolean sum = false;
			for(int  x = 0; x < stats.length; x++) {
			  if((stats[x] == 7))
			  {
				sum =true;
			  }
			}
		return sum;
	}
	
	public void sortArray() 
	{
		/*sort the array in ascending order - selection sort*/

		int tempValue;
		int min;

		for (int i = 0; i < (stats.length - 1); i++)
		{
			min = i;
			for (int j = (i + 1); j < (stats.length); j++)
			{
				if (stats[j] < stats[min])
				{
					min = j;
				}
			}
			tempValue = stats[min];
			stats[min] = stats[i];
			stats[i] = tempValue;


		}

	}


	public void sortBArray() {
		/*Here is another common sort algorithm.
		  It sorts the array in ascending order.
		  This is called a bubble sort.  I have added it
		  so that you can take a look at it.*/

		int tempValue;

		for (int i = 0; i < (stats.length - 1); i++)
		{
			for (int j = (i + 1); j < (stats.length); j++)
			{
				if (stats[j] < stats[i])
				{
					tempValue = stats[i];
					stats[i] = stats[j];
					stats[j] = tempValue;
				}
			}
		}


	}





}//end of StatsArray Class definition
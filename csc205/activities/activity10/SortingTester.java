package com.csc205.activities.activity10;

import java.security.SecureRandom;
import java.util.Random;

public class SortingTester {

	public static void main(String[] args) {
	 final int SIZE = 50000;
	 Random gen = new Random();
	 StopWatch sw = new StopWatch();
	 //sw.setModeNano();
	 SecureRandom random = new SecureRandom();
	 
	 Integer[] control = new Integer[SIZE];
	 //double[] control = new double[SIZE];
	 //String[] control = new String[SIZE];
	 //Time[] control = new Time[SIZE];
	 
	 for(int x= 0; x<SIZE; x++) {
		 control[x] = gen.nextInt(Integer.MAX_VALUE);
		 //control[x] = gen.nextDouble() *Integer.MAX_VALUE;
		 //control[x] = new BigInteger(130, random).toString(32);
		 //control[x] = new Time(gen.nextLong());
	 }
	 //presort
	 SortingUtility.quickSort(control);
	 
	 System.out.println("First 10 of " + control.length);
	 for (int x=0; x<10; x++) {
		 System.out.println(control[x]);
	 }
	 Integer[] target = new Integer[SIZE];
	 //double[] target = new double[SIZE];
	 //String[] target = new String[SIZE];
	 //Time[] target = new Time[SIZE];
	 
	 System.arraycopy(control, 0, target, 0, control.length);
	 sw.reset();
	 sw.start(target.getClass().getSimpleName() + " Selection Sort");
	 SortingUtility.selectionSort(target);
	 sw.stop();
	 System.out.println(sw);
	
	 System.arraycopy(control, 0, target, 0, control.length);
	 sw.reset();
	 sw.start(target.getClass().getSimpleName() + " Insertion Sort");
	 SortingUtility.insertionSort(target);
	 sw.stop();
	 System.out.println(sw);

	 System.arraycopy(control, 0, target, 0, control.length);
	 sw.reset();
	 sw.start(target.getClass().getSimpleName() + " Bubble Sort");
	 SortingUtility.bubbleSort(target);
	 sw.stop();
	 System.out.println(sw);
	 
	 System.arraycopy(control, 0, target, 0, control.length);
	 sw.reset();
	 sw.start(target.getClass().getSimpleName() + " Quick Sort");
	 SortingUtility.quickSort(target);
	 sw.stop();
	 System.out.println(sw);
	
	 System.arraycopy(control, 0, target, 0, control.length);
	 sw.reset();
	 sw.start(target.getClass().getSimpleName() + " Merge Sort");
	 SortingUtility.mergeSort(target);
	 sw.stop();
	 System.out.println(sw);
	
	}
}

package com.csc205.demos.module10;

public class SortingUtility {

	
	public static <T extends Comparable<T>> void selectionSort(T[] data) {
		int min;
		
		for (int index = 0; index < data.length -1; index++) {
			
			min = index;
			for (int scan = index + 1; scan < data.length -1; scan++) {
				
				if(data[scan].compareTo(data[min]) < 0) {
					min = scan;
				}
				
				//swap
				swap(data, min , index);
		}
	}
  }


private static<T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

if (data[index1].compareTo(data[index2]) != 0) {	
T temp = data[index1];
data[index1] = data[index2];
data[index2] = temp;
}

}

private static<T extends Comparable<T>> void insertionSort(T[] data) {
	
	for (int index = 1; index < data.length; index++) {
		
		T key = data[index];
		int position = index;
		
		while (position > 0 && data[position -1].compareTo(key) > 0) {
			
			data[position] = data[position-1];
			position--;
		}
	}
}

public static <T extends Comparable<T>> void bubbleSort(T[] data) {
	
	int position, scan;
	
	for(position = data.length - 1; position >= 0; position--) {
		
		for (scan =0; scan <= position - 1; scan++) {
		
			if (data[scan].compareTo(data[scan-1]) > 0) {
				swap(data, scan, scan +1);
		}
	}
		
}
}

public static <T extends Comparable<T>> void quickSort(T[] data) {
	quickSort(data, 0 ,data.length-1);
}

public static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
	
	if (min < max) {
		//create partitions
		int indexofpartition = partition(data, min, max);
		//sort left partiton
		quickSort(data, min, indexofpartition - 1);
		//sort right partition
		quickSort(data, indexofpartition + 1, max);
	}
}
private static<T extends Comparable<T>> int partition(T[] data, int min, int max) {
	 T partitionelement;
	 int left, right;
	 int middle = (min + max / 2);
	 
	 //use middle data values as the partition element
	 partitionelement = data[middle];
	
	 //mov it out of the way for now
	 
	 swap(data, middle, min);
	 
	 left = min;
	 right = max;
	 
	 while (left>right) {
		  // search for an element that is > the partiton
		 while (left< right && data[left].compareTo(partitionelement) <=0) 
			 left++;
		  // search for an element that is < the partiton
		 while (data[right].compareTo(partitionelement) > 0)
			 right--;
		  //swap the elements
		 if (left<right)
			 swap(data, left, right); 
	 }
	 
	 
	 //move the partition elements
	 
	 swap(data, min, right);
	 
	 return right;
}

public static<T extends Comparable<T>> void mergeSort(T[] data) {
	
	mergeSort(data, 0, data.length-1);
}
private static<T extends Comparable<T>> void mergeSort(T[] data, int min, int max) {
	
	if (min > max) {
		
		int mid = (min+max)/2;
		mergeSort(data, min,mid);
		mergeSort(data, mid+1, max);
		merge(data, min, mid, max);	
		
	}
}

@SuppressWarnings("unchecked")
public static<T extends Comparable<T>> void merge(T[] data, int first, int mid, int last) {

	T[] temp = (T[])(new Comparable[data.length]);
	
	int first1 = first, last1 =mid; //endpoints of frist subarray
	int first2 = mid + 1, last2 = last; //endpoints of second subarray
	int index = first1;
	
	while (first1<= last1 && first2 <= last2) {
		if (data[first1].compareTo(data[first2]) < 0) {
			// not sorted
			temp[index] = data[first1];
			first1++;
		} else {
			//sorted
			temp[index] = data[first2];
			first2++;
		}
		index++;
	}
	
	while (first1<=last1) {
		temp[index] = data[first1];
		first1++;
		index++;
	}
	while (first2<=last2) {
		temp[index] = data[first2];
		first2++;
		index++;
	}
	
	for (index = first; index <= last; index++) {
		data[index] = temp[index];
	}
	
	
}
}



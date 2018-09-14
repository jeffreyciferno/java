package com.csc205.projects.project7;
/**
 * 
 * @author Jeffrey Ciferno
     * Date: 4/18/18
 * 
 *
 */
public class SortingUtility {

    /**
     * 
     * 
     * Selection Sort
     * Sorts the specified array of integers using the selection sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void selectionSort(T[] data) {

        int min;

        for (int index = 0; index < data.length - 1; index++) {

            // Assume first value is min
            min = index;

            for (int scan = index + 1; scan < data.length; scan++) {

                // Find minimum value
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }

            }

            // Swap minimum value with lowest index
            swap(data, min, index);
        }
    }

    /** Swap
     * Swaps to elements in an array. Used by various sorting algorithms.
     *
     * @param data   the array in which the elements are swapped
     * @param index1 the index of the first element to be swapped
     * @param index2 the index of the second element to be swapped
     */
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }

    /** Insertion Sort
     * Sorts the specified array of objects using an insertion sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void insertionSort(T[] data) {

        for (int index = 1; index < data.length; index++) {

            T key = data[index];
            int position = index;

            // shift larger values to the right
            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }

            data[position] = key;

        }
    }

    /**Bubble Sort
     * Sorts the specified array of objects using a bubble sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] data) {

        int position, scan;

        for (position = data.length - 1; position >= 0; position--) {

            for (scan = 0; scan <= position - 1; scan++) {

                if (data[scan].compareTo(data[scan + 1]) > 0)
                    swap(data, scan, scan + 1);
            }
        }
    }

    /**
     * Sorts the specified array of objects using the quick sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void quickSort(T[] data) {
        quickSort(data, 0, data.length - 1);
    }

    /** Quick Sort
     * Recursively sorts a range of objects in the specified array using the
     * quick sort algorithm.
     *
     * @param data the array to be sorted
     * @param min  the minimum index in the range to be sorted
     * @param max  the maximum index in the range to be sorted
     */
    private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {

        if (min < max) {

            // create partitions
            int indexofpartition = partition(data, min, max);

            // sort the left partition (lower values)
            quickSort(data, min, indexofpartition - 1);

            // sort the right partition (higher values)
            quickSort(data, indexofpartition + 1, max);
        }

    }

    /** Partition
     * Used by the quick sort algorithm to find the partition.
     *
     * @param data the array to be sorted
     * @param min  the minimum index in the range to be sorted
     * @param max  the maximum index in the range to be sorted
     */
    private static <T extends Comparable<T>> int partition(T[] data, int min, int max) {

        T partitionelement;
        int left, right;
        int middle = (min + max) / 2;

        // use the middle data value as the partition element
        partitionelement = data[middle];

        // move it out of the way for now
        swap(data, middle, min);

        left = min;
        right = max;

        while (left < right) {

            // search for an element that is > the partition element
            while (left < right && data[left].compareTo(partitionelement) <= 0)
                left++;

            // search for an element that is < the partition element
            while (data[right].compareTo(partitionelement) > 0)
                right--;

            // swap the elements
            if (left < right)
                swap(data, left, right);

        }

        // move the partition element into place
        swap(data, min, right);

        return right;
    }

    /** Merge Sort
     * Sorts the specified array of objects using the merge sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>> void mergeSort(T[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    /**
     * Recursively sorts a range of objects in the specified array using the
     * merge sort algorithm.
     *
     * @param data the array to be sorted
     * @param min  the index of the first element
     * @param max  the index of the last element
     */
    private static <T extends Comparable<T>> void mergeSort(T[] data, int min, int max) {

        if (min < max) {

            int mid = (min + max) / 2;
            mergeSort(data, min, mid);
            mergeSort(data, mid + 1, max);
            merge(data, min, mid, max);

        }
    }

    /**Merge Sort (recursive)
     * Merges two sorted subarrays of the specified array.
     *
     * @param data  the array to be sorted
     * @param first the beginning index of the first subarray
     * @param mid   the ending index fo the first subarray
     * @param last  the ending index of the second subarray
     */
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> void merge(T[] data, int first, int mid, int last) {

        T[] temp = (T[]) (new Comparable[data.length]);

        int first1 = first, last1 = mid; // endpoints of first subarray
        int first2 = mid + 1, last2 = last; // endpoints of second subarray
        int index = first1; // next index open in temp array

        // Copy smaller item from each subarray into temp until one
        // of the subarrays is exhausted
        while (first1 <= last1 && first2 <= last2) {
            if (data[first1].compareTo(data[first2]) < 0) {
                // Not sorted
                temp[index] = data[first1];
                first1++;
            } else {
                // sorted
                temp[index] = data[first2];
                first2++;
            }
            index++;
        }

        // Copy remaining elements from first subarray, if any
        while (first1 <= last1) {
            temp[index] = data[first1];
            first1++;
            index++;
        }

        // Copy remaining elements from second subarray, if any
        while (first2 <= last2) {
            temp[index] = data[first2];
            first2++;
            index++;
        }

        // Copy merged data into original array
        for (index = first; index <= last; index++)
            data[index] = temp[index];
    }

    /**Selection Sort Descending
     * Part A -
     * Modified selection sort.
     *
     * @param data
     * @param <T>
     */
    public static <T extends Comparable<T>> void selectionSortDescending(T[] data) {

    	int maxValue;

		for (int someValue = 0; someValue < data.length - 1; someValue++) {
			
			maxValue = someValue; //sets maxValue to someValue
			
		for (int scan = someValue + 1; scan < data.length; scan++) {

			if (data[scan].compareTo(data[maxValue]) > 0) { //Compares data[scan] to data[maxValue] if its greater than zero sets maxvalue to scan
					maxValue = scan;
				}
			}
			swap(data, maxValue, someValue); //recursive swap
		}

    }

    /** Quicker Sort
     * Part B
     * Modified quick sort.
     *
     * @param data
     * @param <T>
     */
    public static <T extends Comparable<T>> void quickerSort(T[] data) {
        quickerSort(data, 0, data.length - 1); //recursive call
    }

    /**Quicker Sort (Recursive)
     * Part B
     * Modified quick sort.
     *
     * @param data
     * @param min
     * @param max
     * @param <T>
     */
    private static <T extends Comparable<T>> void quickerSort(T[] data, int min, int max) {

        if (min == (max - 1)) { // partition size of 2
        	
        	if (data[max].compareTo(data[min]) < 0)
        		
				swap(data, max, min);
        	
        } else if (min < max) {

            // create partitions
            int indexofpartition = partition(data, min, max);

            // sort the left partition (lower values)
            quickerSort(data, min, indexofpartition - 1);

            // sort the right partition (higher values)
            quickerSort(data, indexofpartition + 1, max);
        }
    }

    /**Gnome Sort
     * Part C
     * Gnome Sort Algorithm
     * <p>
     * Implement gnome sort per this pseudo code.
     * <p>
     * <pre>
     *    method gnomeSort(a[])
     *       pos = 0
     *       while pos less than length(a)
     *          if (pos == 0 or a[pos] greater than or equal to a[pos-1])
     *          pos = pos + 1
     *       else
     *          swap a[pos] and a[pos-1]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a> 
     * super helpful lol ^^^^^^^
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

    	int position = 0;
    	
		while (position < data.length) {
			
			if (position == 0) {
				
				position = position + 1;
				
			} else if (data[position - 1].compareTo(data[position]) < 0) { 
				
				position = position + 1; 
				
			} else {
				
				swap(data, position, position - 1); //recursive swap call, switches values
				
				position = position - 1;
			}
		}

    }


    /**Gnomier Sort
     * Part D1
     * Optimized Gnome Sort Algorithm.
     * <p>
     * Implement an optimized gnome sort per the pseudo code below.
     * <p>
     * <pre>
     *    method gnomierSort(a[])
     *       for pos in 1 to length(a)
     *       gnomierSort(a, pos)
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomierSort(T[] data) {

    	for (int position = 0; position < data.length; position++) {
    		
			gnomierSort(data, position);
    	}
    }


    /**Gnomier Sort
     * Part D2
     * Optimized Gnome Sort Algorithm
     * <p>
     * Implement an optimized gnome sort per the pseudo code below.
     * <p>
     * <pre>
     *    method gnomierSort(a[], upperBound)
     *       pos = upperBound
     *       while pos greater than 0 and a[pos-1] greater than a[pos]
     *          swap a[pos-1] and a[pos]
     *       	pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     */
    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {


		int position = upperBound;
		
		while (position > 0 && data[position - 1].compareTo(data[position]) > 0) { // leaps back to the right to the place where it needs to swap the flower pots on its farthest position.
			
			swap(data, position - 1, position);
			
			position = position - 1;
		}

    }


}






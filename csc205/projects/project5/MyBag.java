package com.csc205.projects.project5;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Public Class MyBag, a series of methods that utilize Arraylists as well as generics. Creates an array that can be iterated as well as track size and if its empty or not.
 * Implements Interface Bag
 * Date: 2/28/18
 * @author Jeffrey Ciferno
 *
 *<pre>
 *Output:
 *Size is: 8
 *IsEmpty: false
 *</pre>
 */
public class MyBag<T> implements Bag<T> {
	
	/**
	 * Creates an generic arraylist for items value
	 */
	private ArrayList<T> items;
	/**
	 * Sets new arraylist equal to items as well as creating the arraylist
	 */
	public MyBag() {
		items = new ArrayList<T>(); 
	}
	/**
	 * Calls the iterator from bag that is extended by Iterable. Returns items.iterator.
	 */
	public Iterator iterator() {
	
		return items.iterator();
	}
	/** Implemented method from interface Bag
	 *  Determines if the items arraylist is empty of not by checking if the size is equal to zero if so its boolean value is true else its false.
	 */
	public boolean isEmpty() {
		
		return (items.size() == 0);
	}
	/** Implemented method from interface Bag
	 * Tracks the size of the items arraylist and returns upon call.
	 */
	public int size() {
	
		return items.size();
	}

	/**Implemented method from interface Bag
	 * Adds an item to the items arraylist. Implemented by implementing bag interface.
	 */
	public void add(Object item) {
		
		items.add((T) item);
	}

	/**
	 * String builder to test if it is working properly. Appends items, iterator, isEmpty, size.
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyBag [items=");
		builder.append(items);
		builder.append(", iterator()=");
		builder.append(iterator());
		builder.append(", isEmpty()=");
		builder.append(isEmpty());
		builder.append(", size()=");
		builder.append(size());
		builder.append("]");
		return builder.toString();
	}
	/**
	 * PSVM runs the driver to test if its working properly.  Creates a new MyBag called list. Adds items into the created list bag. Calls values by using the string builder.
	 * 
	 */
	public static void main(String[] args) {
	
		MyBag list = new MyBag();
		 
		list.add("Rubber Cement");
		list.add("Rubber Cement");
		list.add("Rubber Cement");
		list.add("Rubber Cement");
		list.add("Rubber Cement");
		list.add("Rubber Cement");
		list.add("Rubber Cement");
		list.add("Rubber Cement");
 System.out.println("Size is: " + list.size());
 System.out.println("IsEmpty: " + list.isEmpty());
	}

}

package com.csc205.projects.project5;
/**
 * @author Jeffrey Ciferno
 * @param <T>
 * Public interface Bag extends Iterable.
 * Generic array.
 * isEmpty: determines if the bag is empty or not
 * Size: determines the size of the Bag
 * Add: Adds items into the bag
 */
public interface Bag<T> extends Iterable<T> {
    public boolean isEmpty();  
    public int size();
    public void add(T item);  
}

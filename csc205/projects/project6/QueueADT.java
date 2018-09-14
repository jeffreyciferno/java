package com.csc205.projects.project6;
/**
 * @author Jeffrey Ciferno
 * Date: 4/11
 */

import java.util.LinkedList;
/**
 * Class Queue: Utilizes LinkedList to implement Queue
 * 
 * @param <T>
 */
public class QueueADT<T> {

	private LinkedList<T> queue = new LinkedList<T>();
/**
 * Method enqueue: Adds to the queue
 * @param item
 */
	public void enqueue(T item) {
		queue.addLast(item);
	}
/**
 * Method dequeue: Removes from the queue
 * @return
 */
	public T dequeue() {
		return queue.poll();
	}
/**
 * Method toString: Passes the values via toString
 */
	public String toString() {
		String output = "";
		for (T t : queue) {
			output += t.toString() +" ";
		}
		return output;
	}
/**
 * Method addItems: Adds to the current array
 * @param q
 */
	public void addItems(QueueADT<? extends T> q) {
		while (q.hasItems())
			queue.addLast(q.dequeue());
	}
/**
 * Method size: Determines the size of the stack
 * @return
 */
	public int size() {
		return queue.size();
	}
/**
 * Method hasItems: Checks if it has items or not
 * @return
 */
	public boolean hasItems() {
		return !queue.isEmpty();
	}
}

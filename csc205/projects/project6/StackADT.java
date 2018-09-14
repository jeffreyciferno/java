package com.csc205.projects.project6;
/**
 * @author Jeffrey Ciferno
 * Date: 4/11
 */

import java.util.ArrayList;
 /**
  * Class Stack: Utilizes ArrayList to implement Stack
  *
  * @param <T>
  */
public class StackADT<T> {

	ArrayList<T> stack;
	int mSize;
	int top;
/**
 *  Method Stack: Creates the stack, sets variables of stack
 * @param limit
 */
	public StackADT(int limit) {
		mSize = limit;
		stack = new ArrayList<T>(mSize);
		top = -1;
	}
/**
 * Method peek: Gets the top of the stack and displays it
 * @return
 */
	public T peek() {
		return stack.get(top);
	}
/**
 * Method pop: Gets the top of the stack and removes it form the stack while displaying it
 * @return
 */
	public T pop() {
		return stack.remove(top--);
	}
/**
 * Method push: Inputs a value onto the top of the stack, adds to stack
 * @param item
 */
	public void push(T item) {
		stack.add(item);
		top++;
	}
/**
 * Method toString: Passes the values via toString
 */
	public String toString() {
		String output = "";
		for (T t : stack) {
			output += t.toString() +" ";
		}
		return output;
	}
/**
 * Method isEmpty: Checks if it is empty or not.
 * @return
 */
	public boolean isEmpty() {
		return (top == -1);
	}
/**
 * Method isFull: Checks if it is full or not
 * @return
 */
	public boolean isFull() {
		return (top == mSize - 1);
	}
/**
 * Method size: Determines the size of the stack
 * @return
 */
	public int size() {
		return stack.size();
	}

}

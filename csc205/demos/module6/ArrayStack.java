package com.csc205.demos.module6;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
 T[] array;
 int top;
 @SuppressWarnings("unused")
private static final int INITIAL_CAPACITY = 16;
 
 public ArrayStack() {
	 //generic array
	 array = (T[])(new Object[ArrayStack.INITIAL_CAPACITY]);
	 top = 0;
 }
 
 

	@Override
	public boolean push(T t) {
		array[top] = t;
		top++;
		return true;
	}

	@Override
	public T pop() {
		T temp = array[top-1];
	 array[top-1] = null;
	 top--;
		return null;
	}

	@Override
	public T peek() {
		return array[top-1];
	}

	@Override
	public boolean isEmpty() {
		
		return (top == 0);
	}

	@Override
	public int size() {
	
		return array.length;
	}
	 
		@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArrayStack [array=");
		builder.append(Arrays.toString(array));
		builder.append("]");
		return builder.toString();
	}



}

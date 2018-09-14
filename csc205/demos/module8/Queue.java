package com.csc205.demos.module8;

public interface Queue<E> {
	
	void offer( E e);
	E poll();
	E peek();
	boolean isEmpty();
	int size();

}

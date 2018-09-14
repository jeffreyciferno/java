package com.csc205.demos.module8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<E> implements Queue<E> {
	
	List<E> list;
	
	public ArrayListQueue() {
		 list = new ArrayList<>();
	}

	@Override
	public void offer(E e) {
		list.add(e);
		
	}

	@Override
	public E poll() {
		
		return list.remove(0);
	}

	@Override
	public E peek() {
	
		return list.get(0);
	}

	@Override
	public boolean isEmpty() {


		return list.isEmpty();
	}

	@Override
	public int size() {
	
		return list.size();
	}
	

}

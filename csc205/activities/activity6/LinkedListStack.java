package com.csc205.activities.activity6;

public class LinkedListStack<T> implements Stack<T> {

	private LinkedList<T> list;
	
	public LinkedListStack() {
		list = new LinkedList<>();
	}
	@Override
	public boolean push(T t) {
	
	list.add(t);
	
		return true;
	}

	@Override
	public T pop() {

		return list.remove();
	}

	@Override
	public boolean isEmpty() {
		
		return list.isEmpty();
	}

	@Override
	public int size() {
		
		return list.size();
	}

	@Override
	public T peek() {
		
		return list.inspect();
	}
	@Override
	public T push() {
		// TODO Auto-generated method stub
		return null;
	}

}

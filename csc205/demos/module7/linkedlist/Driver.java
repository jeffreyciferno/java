package com.csc205.demos.module7.linkedlist;

public class Driver {

	public static void main(String[] args) {
		LinkedList<Integer> list = new SinglyLinkedList();
		list.addFirst(1);
		list.addFirst(2);
		
		System.out.print(list.first());
		System.out.print(list.getfirst());
		
		list.first();
		
		list.addLast(3);
		System.out.print(list.first());
	}

}

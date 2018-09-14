package com.csc205.demos.module7.iterations;

public class Driver {

	public static void main(String[] args) {

		LinkedList<Integer> list = new SinglyLinkedList<>();
		
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(1);
		System.out.println(list.first());
		System.out.println(list.getFirst());
		
		list.getFirst();
		list.getFirst();

	}

}

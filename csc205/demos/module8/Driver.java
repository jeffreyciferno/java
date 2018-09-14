package com.csc205.demos.module8;

public class Driver {
	public static void main(String[] args) {
		
		//Queue<Integer> list = new LinkedQueue<>();
		//Queue<Integer> list = new ArrayListQueue<>();
		java.util.Queue<Integer> list = new java.util.LinkedList<>();
		
		
		list.offer(1);
		list.offer(2);
		list.offer(3);
		
		System.out.println(list.poll()); // 1
		System.out.println(list.peek()); // 2
		System.out.println(list.peek()); // 2
		System.out.println(list.isEmpty()); // false
		System.out.println(list.size()); // 2
	}

}


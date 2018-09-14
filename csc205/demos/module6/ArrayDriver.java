package com.csc205.demos.module6;

public class ArrayDriver {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new ArrayStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		 stack.push(6);
		 stack.push(7);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
	}

}

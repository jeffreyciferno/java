package com.csc205.demos.module4;

public class InfiniteRecursion {

	public static int sum(int n) {
		//Base case
			if (n==1) {
				return 1;
			}
			
		//Recursion
			return n+sum(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
}

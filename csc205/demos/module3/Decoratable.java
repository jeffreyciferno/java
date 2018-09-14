package com.csc205.demos.module3;

public interface Decoratable {
	void decorate();
	
	default void cleanup() {
		 System.out.println("Clean up mess!");
	}
}

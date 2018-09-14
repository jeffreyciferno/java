package com.csc205.demos.module2.exceptions;

public class Driver {

	public static void main(String[] args) {
		//aggregation
	Book book1 = new Book();
	Book book2 = new Book();
	Book book3 = new Book();
	
	Library library = new Library();
	library.add(book1);
	library.add(book2);
	library.add(book3);
	}

}

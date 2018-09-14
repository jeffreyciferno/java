package com.csc205.demos.module2.exceptions;
import java.util.List;
import java.util.ArrayList;
public class Library {
	
	
	
List<Book> List = new ArrayList<>();

	 private List<Book> list;
	 
	 public void add(Book book) {
		 
		 list.add(book);
		list = new ArrayList<>();
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		add(book1);
		add(book2);
		add(book3);
	 }
}

package com.csc205.demos.module6;

public class PersonDriver {

	public static void main(String[] args) {
	Person p1 = new Person("Bob");
	Person p2 = new Person("Homer");
	Person p3 = new Person("Sherry");
	
	p1.setPerson(p2);
	p2.setPerson(p3);
	System.out.println(p1);
	System.out.println(p1.getPerson());
	System.out.println(p2.getPerson());
	
	}

}

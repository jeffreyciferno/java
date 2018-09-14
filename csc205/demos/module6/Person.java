package com.csc205.demos.module6;

public class Person {

	private Person p;
	String name;
	public Person (String name) {
		this.name = name;
	}
	public Person getPerson() {
		return p;
	}
	public void setPerson(Person person) {
		this.p = person;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [p=");
		builder.append(p);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}

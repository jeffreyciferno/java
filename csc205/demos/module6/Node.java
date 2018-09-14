package com.csc205.demos.module6;

public class Node<T> {
		T element;
	Node<T> next;
	public T getElement() {
		return element;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
}

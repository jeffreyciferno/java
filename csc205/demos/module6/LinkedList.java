package com.csc205.demos.module6;

public class LinkedList<T> {
	 private Node<T> head;
	 private int count;
	 
	 public LinkedList() {
		 head = new Node<>();
		 head.setElement(null);
		 count = 0;
	 }
 public void add(T element) {
	 if (head.getElement() == null) {
		 head.setElement(element);
		 count++;
	 } else {
		 //1
		 Node<T> temp = new Node<>();
		 
		 //2
		 temp.setElement(element);
		 
		 //3
		 temp.next = head;
		 
		 //4
		 this.head = temp;
		 
		 //5
		 count++;
		 
	 }
 }
 
 public T remove() {
	 //1
	  count--;
	  
	 //2
	  Node<T> temp = this.head;
	  
	  T element = null;
	  
	  if (temp.next == null) {
		  
		  element = head.element;
		  head.element = null;
	  } else {
	  
	 //3
	this.head = temp.next;
	
	 //4
	element = temp.getElement();
	  }
	 //5
	  return element;
 }
 
 public T inspect() {
	 return head.getElement();
 }
 
 public boolean isEmpty() {
	 return (count == 0);
 }
 
 public int size() {
	return this.count;
	 
 }
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("LinkedList [head=");
	builder.append(head.getElement());
	builder.append("]");
	return builder.toString();
}
}

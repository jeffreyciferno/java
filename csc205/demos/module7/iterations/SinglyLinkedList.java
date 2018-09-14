
package com.csc205.demos.module7.iterations;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E> implements LinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public SinglyLinkedList() {
		this.size = 0;
		head = tail = null;
	}
	
	@Override
	public void addFirst(E e) {
		
		Node<E> newNode = new Node<>(e);
		
		if (!isEmpty()) {
			newNode.next = this.head;
			this.head = newNode;
		} else {
			this.head = this.tail = newNode;
			this.head.next = null;
		}
		
		this.size++;
		
	}

	@Override
	public void addLast(E e) {
		
		Node<E> newNode = new Node<>(e);
		
		if (!isEmpty()) {
			
			this.tail.next = newNode;
			this.tail = newNode;
			
		} else {
			this.tail = this.head = newNode;
			this.tail.next = null;
		}

		this.size++;
		
	}

	@Override
	public E getFirst() {
		
		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		
		E returnValue = this.head.element;
		
		this.head = this.head.next;
		this.size--;
		
		if (isEmpty()) {
			this.tail = null;
		}
		
		if (size == 1) {
			this.tail = this.head;
		}
		
		return returnValue;
	}

	@Override
	public E getLast() {

		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		
		E returnValue = this.tail.element;
		
		if (this.size == 1) {
			getFirst();  // short cut
		} else {
			
			Node<E> newLast = this.head;
			while(newLast.next != this.tail) {
				newLast = newLast.next;				
			}
			
			this.tail = newLast;
			this.tail.next = null;
			
			this.size--;
			
		}
		
		return returnValue;
	}

	@Override
	public E first() {
		
		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		
		return this.head.element;
	}

	@Override
	public E last() {
		
		if (isEmpty()) {
			throw new NoSuchElementException("Empty List");
		}
		
		E returnValue = this.tail.element;
			
		return returnValue;
	}

	@Override
	public boolean isEmpty() {
		return (this.size == 0);
	}

	@Override
	public int size() {
		return this.size;
	}
	
	private static class Node<E> {
		
		Node<E> next;
		E element;
		
		Node(E e) {
			this.element = e;
		}
		
	}

}

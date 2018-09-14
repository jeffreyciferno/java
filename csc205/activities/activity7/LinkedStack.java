package com.csc205.activities.activity7;

import java.util.Iterator;
import java.util.NoSuchElementException;



public class LinkedStack<E> implements Iterable<E>, Stack<E> {

	LinkedList<E> list;
	
	public LinkedStack() {
		list = new SinglyLinkedList<>();
	}
	
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}
	@Override
	public E push() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean push(E t) {
		list.addFirst(t);
		return true;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return list.getFirst();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return list.first();
	}
	
	private interface LinkedList<E> {

	    void addFirst(E e);

	    Iterator<E> iterator();

		void addLast(E e);

	    E getFirst();

	    E getLast();

	    E first();

	    E last();

	    boolean isEmpty();

	    int size();

	}
	private class SinglyLinkedList<E> implements LinkedList<E> {

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
		
		private class Node<E> {
			
			Node<E> next;
			E element;
			
			Node(E e) {
				this.element = e;
			}
			
		}

		@Override
		public Iterator<E> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

	}
	

}

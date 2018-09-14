package com.csc205.demos.module7.DoublyLinkedList;

import java.util.NoSuchElementException;

import com.csc205.demos.module7.iterations.LinkedList;

public class DoublyLinkedList<E> implements LinkedList<E> {
		 
	    private Node head;
	    private Node tail;
	    private int size;
	     
	    public DoublyLinkedList() {
	        this.size = 0;
	        head = tail = null;
	    }
	    /**
	     * this class keeps track of each element information
	     * @author java2novice
	     *
	     */
	    private class Node {
	        E element;
	        Node next;
	        Node prev;
	 
	        public Node(E element, Node next, Node prev) {
	            this.element = element;
	            this.next = next;
	            this.prev = prev;
	        }
	    }
	    /**
	     * returns the size of the linked list
	     * @return
	     */
	    public int size() { return size; }
	     
	    /**
	     * return whether the list is empty or not
	     * @return
	     */
	    public boolean isEmpty() { return size == 0; }
	     
	    /**
	     * adds element at the starting of the linked list
	     * @param element
	     */
	    public void addFirst(E element) {
	        Node temp = new Node(element, head, null);
	        if(head != null ) {head.prev = temp;}
	        head = temp;
	        if(tail == null) { tail = temp;}
	        size++;
	        System.out.println("adding: "+element);
	    }
	     
	    /**
	     * adds element at the end of the linked list
	     * @param element
	     */
	    public void addLast(E element) {
	         
	        Node temp = new Node(element, null, tail);
	        if(tail != null) {tail.next = temp;}
	        tail = temp;
	        if(head == null) { head = temp;}
	        size++;
	        System.out.println("adding: "+element);
	    }
	     
	    /**
	     * this method walks forward through the linked list
	     */
	    public void iterateForward(){
	         
	        System.out.println("iterating forward..");
	        Node tmp = head;
	        while(tmp != null){
	            System.out.println(tmp.element);
	            tmp = tmp.next;
	        }
	    }
	     
	    /**
	     * this method walks backward through the linked list
	     */
	    public void iterateBackward(){
	         
	        System.out.println("iterating backword..");
	        Node tmp = tail;
	        while(tmp != null){
	            System.out.println(tmp.element);
	            tmp = tmp.prev;
	        }
	    }
	     
	    /**
	     * this method removes element from the start of the linked list
	     * @return
	     */
	    public E removeFirst() {
	        if (size == 0) throw new NoSuchElementException();
	        Node temp = head;
	        head = head.next;
	        head.prev = null;
	        size--;
	        System.out.println("deleted: "+temp.element);
	        return temp.element;
	    }
	     
	    /**
	     * this method removes element from the end of the linked list
	     * @return
	     */
	    public E removeLast() {
	        if (size == 0) throw new NoSuchElementException();
	        Node temp = tail;
	        tail = tail.prev;
	        tail.next = null;
	        size--;
	        System.out.println("deleted: "+temp.element);
	        return temp.element;
	    }

		@Override
		public E getFirst() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public E getLast() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public E first() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public E last() {
			// TODO Auto-generated method stub
			return null;
		}}
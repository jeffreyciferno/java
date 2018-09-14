package com.csc205.demos.module7.iterations;

public interface LinkedList<E> {

    void addFirst(E e);

    void addLast(E e);

    E getFirst();

    E getLast();

    E first();

    E last();

    boolean isEmpty();

    int size();

}

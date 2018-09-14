package com.csc205.activities.activity7;

import java.util.Iterator;

/**
 * Driver for LinkedStack
 * <p>
 * Output should be as follows
 * <p>
 * <pre>
 *     6 5 4 1 2 3
 *     6 5 4 1 2 3
 *     2 3
 *     2 2
 *     3
 * </pre>
 */
public class Driver {

    public static void main(String[] args) {

        LinkedStack<Integer> list = new LinkedStack<>();

        list.push(3);
        list.push(2);
        list.push(1);
        list.push(4);
        list.push(5);
        list.push(6);

        // using forEach method
        for (Integer value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

        // using explicit iterator
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        list.pop();
        list.pop();
        list.pop();
        list.pop();

        for (Integer value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print(list.peek() + " ");
        System.out.println(list.pop() + " ");

        for (Integer value : list) {
            System.out.print(value + " ");
        }

        System.out.println();

    }
}

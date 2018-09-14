package com.csc205.activities.activity4;

/**
 * Utility class for recursive methods.
 */
public class Recursion {

    /**
     * Recursive factorial function.
     *
     * @param n n
     * @return nth factorial
     */
    public static int fact(int n) {
//base case
    if (n==1) {
    	return 1;
    }
//recursion
    return (n) * fact(n-1);
    }

    /**
     * Recursive fibonacci function.
     * @param n n
     * @return nth fibonacci
     */
    public static int fib(int n) {
    	//base case
        if (n==0) {
        	return 0;
        }
        //base case
        if (n==1) {
        	return 1;
        }
        //recursion
        return fib(n-1)+ fib(n-2);
        }

   

    /**
     * Recursive greatest common denominator (GCD) function.
     *
     * @param a a
     * @param b b
     * @return gcd(a,b)
     */
    public static int gcd(int a, int b) {

    	//base case
        if (b==0) {
        	return a;
        }
        //recursion
        return gcd(b, a%b);
        }

    }



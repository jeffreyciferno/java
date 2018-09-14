package com.csc205.projects.project4;
/**
 * Public Class Recursion, a series of methods that all use recursion t produce output. They recursively call themselves to compute powers, odds, etc.
 * Date: 2/11/18
 * @author Jeffrey Ciferno
 *
 */
public class Recursion {
	 
	/**
	 * Power method, takes the power of variable x raised to variable y. All without calling the Math.pow() method. Uses recursion to compute power function.
	 * @param x
	 * @param y
	 * @return
	 */
	public static int power(int x, int y) {
			 if(y==0)
			  return 1;

			  if(y<0){
			      x = 1/x;
			      y = -y;
			  }
			 int out = power(x,y/2);
			 out = out * out;
			 if(y%2!=0)
			   out = out * x;
			 return out;

	}
	/**
	 * Ackerman method, takes the x and y variables and grows very quickly to compute the equation. Uses recursion multiple times.
	 * @param x
	 * @param y
	 * @return
	 */
	public static int ack(int x, int y) {
		if (x==0) {
			return y + 1;
		}
		else if (x > 0 && y==0) {
			return y = ack(x-1,1);
		}
		else if (x > 0 && y > 0) {
			return y = ack(x-1,ack(x,y-1));
		}
		return y;
		
	}
	/**
	 *  Public Odd method, takes the x variable input and puts it into the Private Odd by setting the x as x and x as y. Uses recursion to implement into the private equation.
	 * @param x
	 * @return
	 */
	public static int odd(int x) {
        if ((x % 2) == 0) {
            return odd(x - 1, x);
        }
        return odd(x, x);
    }
	/**
	 * Private Odd method, takes the x from the Public Odd and sets the x and y to the public x. Uses recursion multiple times.
	 * @param y
	 * @param x
	 * @return
	 */
	
    private static int odd(int x, int y) {
        int bValue = (2 * y - 1);
        if (x == bValue) {
            return x;
        }
        return odd(x + 1, y);        
    }}

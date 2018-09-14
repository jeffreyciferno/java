package com.csc205.activities.activity8;

import java.security.InvalidAlgorithmParameterException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
*  Implementation of the Shunting Yard Algorithm, first proposed by Dr. 
Edsger Wybe Dijkstra in the Mathematisch
*  Centrum (MR35) in 1961.
*
*  reference:
*  https://en.wikipedia.org/wiki/Shunting-yard_algorithm
*
*  <pre>
*  The algorithm is as follows...
*
*  while there are tokens to be read:
*
*  read a token.
*
*  if the token is a number, then:
*  push it to the output queue.
*
*  if the token is an operator, then:
*  while there is an operator at the top of the operator stack with
*  greater than or equal to precedence and the operator is left 
associative:
*  pop operators from the operator stack, onto the output queue.
*  push the read operator onto the operator stack.
*
*  if the token is a left bracket (i.e. "("), then:
*  push it onto the operator stack.
*
*  if the token is a right bracket (i.e. ")"), then:
*  while the operator at the top of the operator stack is not a left 
bracket:
*  pop operators from the operator stack onto the output queue.
*  pop the left bracket from the stack.
*
*  Note: if the stack runs out without finding a left bracket, then there 
are
*  mismatched parentheses.
*
*  if there are no more tokens to read:
*  while there are still operator tokens on the stack:
*  pop the operator onto the output queue.
*
*  Note: if the operator token on the top of the stack is a bracket, then
*  there are mismatched parentheses.
*
*  exit
*  </pre>




*/
//regx101.com
public class ShuntingYard {
public static String convert(String infix)
throws InvalidAlgorithmParameterException {
// Create stack and queues used for algorithm
	Queue<String> input = new LinkedList<>();
	Stack<String> operatorStack = new Stack<>();
	Queue<String> output = new LinkedList<>();
// split input into tokens
	 String[] tokens = infix.split(" ");
// add tokens to input
	 for (String value: tokens) {
		 input.add(value);
	 }
// start algorithm
	 
// while there are tokens to be read:
	 while (!input.isEmpty()) {
// read a token.
		 String token = input.poll();
// if the token is a number, then push it to the output queue.
		 if (isNumber(token)) {
			 output.add(token);
		 }
/*
if the token is an operator, then:
while there is an operator at the top of the operator 
stack with
greater than or equal to precedence and the operator 
is left associative:
pop operators from the operator stack, onto the 
output queue.
push the read operator onto the operator stack.
*/
		 else if (isOperator(token)) {
			
			 if (!operatorStack.isEmpty()) {
				 while(operatorGreaterOrEqual(token, operatorStack.peek())) {
					 output.offer(operatorStack.pop());
				 }
			 }
			 operatorStack.push(token);
		 }
		 
/*
if the token is a left bracket (i.e. "("), then:
push it onto the operator stack.
*/
		 else if (isLeftParenthesis(token)) {
			 operatorStack.push(token);
		 }
		 
/*
if the token is a right bracket (i.e. ")"), then:
while the operator at the top of the operator stack is not 
a left bracket:
pop operators from the operator stack onto the output 
queue.
pop the left bracket from the stack.
*/
		 else if (isRightParenthesis(token)) {
			 if (!operatorStack.isEmpty()) {
				  while(!isLeftParenthesis(operatorStack.peek())) {
					  output.add(operatorStack.pop());
				  }
			 }
		 
		 try {
			 operatorStack.pop();
		 } catch (Exception e) {
			 throw new InvalidAlgorithmParameterException("Token: " + token);
		 
		 }} else {
		 throw new InvalidAlgorithmParameterException("Token: " + token);
	 }
	 }
/*
if there are no more tokens to read:
while there are still operator tokens on the stack:
*  if the operator token on the top of the stack is a 
bracket, then
there are mismatched parentheses.
pop the operator onto the output queue.
*/
while (!operatorStack.empty()) {
	String operator = operatorStack.pop();
		if (isLeftParenthesis(operator) || isRightParenthesis(operator)) {
			throw new InvalidAlgorithmParameterException("Token: " + operator);
		} output.add(operator);
}
return toString(output);
}
private static boolean isNumber(String token) {
try {
double d = Double.parseDouble(token);
} catch (NumberFormatException nfe) {
return false;
}
return true;
// return token.matches("-?\\d+(\\.\\d+)?");
}
private static boolean isOperator(String token) {
String[] tokens = {"^", "*", "/", "+", "-"};
for (String t : tokens) {
if (t.equalsIgnoreCase(token)) {
return true;
}
}
return false;
}




private static boolean isLeftParenthesis(String token) {
return "(".equals(token);
}
private static boolean isRightParenthesis(String token) {
return ")".equals(token);
}
private static boolean operatorGreaterOrEqual(String token, String 
operator) {
boolean valid = false;
if (isOperator(operator)) {
int tokenPrecedence = getPrecedence(token);
int operatorPrecedence = getPrecedence(operator);
if ((operatorPrecedence >= tokenPrecedence) 
&& !isRightAssociativity(operator)) {
valid = true;
}
}
return valid;
}
private static int getPrecedence(String operator) {
int precedence = -1;
if ("^".equals(operator)) {
precedence = 4;
} else if ("*".equals(operator) || "/".equals(operator)) {
precedence = 3;
} else if ("+".equals(operator) || "-".equals(operator)) {
precedence = 2;
}
return precedence;
}
private static boolean isRightAssociativity(String operator) {
boolean rightAssociativity = false;
if ("^".equals(operator)) {
rightAssociativity = true;
}
return rightAssociativity;
}




private static String toString(Queue<String> output) {
StringBuffer buffer = new StringBuffer();
for (String token : output) {
buffer.append(token);
buffer.append(" ");
}
return buffer.toString();
}
}

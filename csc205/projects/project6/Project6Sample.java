package com.csc205.projects.project6;
/**Output:
 * 
 * Stack: First Second Fourth 
Queue: Third Fourth Fifth 

Are we not drawn onward to new era is a palindrome.
A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama! is a palindrome.
I'm pretty sure this isn't a palindrome. is NOT a palindrome.


erA ew ton nward drawno ot wen 
olleH dna 
 * 
 * I cannot figure out why it cuts off after the palindrome
 * 
 * @author Jeffrey Ciferno
 * Date: 4/11
 */



//This class performs some basic tests on your stack & queue classes as well as your 
//changeit & palindrome method.  It assumes you have a class called Project6 with 
//methods called changeIt() and isPalindrome()

/* Sample output:
	Stack: top -> Fourth Second First 
	Queue: front -> Third Fourth Fifth  <- rear
	
	Are we not drawn onward to new era is a palindrome.
	A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama! is a palindrome.
	I'm pretty sure this isn't a palindrome. is NOT a palindrome.
	
	
	erA ew ton nward drawno ot wen are 
	olleH dna eybdooG 
*/

public class Project6Sample {

public static void main(String[] args) {
	
	String line = "Are we not drawn onward to new era";
	String line2 = "A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!";
	String line3 = "I'm pretty sure this isn't a palindrome.";
	String line4 = "Hello Asa and Anna! Goodbye";

	StackADT<String> s = new StackADT<String>(100000);
	QueueADT<String> q = new QueueADT<String>();

	// Test stack
	s.push("First");
	s.push("Second");
	s.push("Third");
	s.pop();
	s.push("Fourth");
	s.push("Fifth");
	s.pop();
	
	System.out.println("Stack: " + s);
	
	q.enqueue("First");
	q.enqueue("Second");
	q.enqueue("Third");
	q.dequeue();
	q.enqueue("Fourth");
	q.enqueue("Fifth");
	q.dequeue();
	
	System.out.println("Queue: " + q + "\n");
	
	// Check if the palindrome method works 
    checkPalindrome(line);
    checkPalindrome(line2);
    checkPalindrome(line3);
    
    System.out.println("\n");
    
    // Check if the checkIt method works
    Project6.changeIt(line); System.out.println("");
    Project6.changeIt(line4); System.out.println("");

}

public static void checkPalindrome(String s) {
	   if (Project6.isPalindrome(s))
		   System.out.println(s + " is a palindrome.");
	   else
		   System.out.println(s + " is NOT a palindrome.");

}

}

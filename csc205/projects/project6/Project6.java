package com.csc205.projects.project6;
/**
 * 
 * @author Jeffrey Ciferno
 *Date: 4/11
 */

public class Project6 {
/**
 * Method changeIt: Changes the word if it is a palindrome
 * @param word
 */
	
	public static void changeIt(String word) {
		
		String rev = StringUtil.stripPunctuation(word);
		
		int size = rev.length();

		QueueADT<Character> Aqueue = new QueueADT<>();
		StackADT<Character> Astack = new StackADT<>(size);

		for (int x = 0; x < size; x++) {
			
			Aqueue.enqueue(rev.charAt(x));
			
		}

		for (int x = 0; x < size; x++) {
			
			char let = Aqueue.dequeue();
			
			if (let != ' ') {
				Astack.push(let);
				
			} else {
				String oneWord = "";
				int wordleng = Astack.size();
				
				for (int y = 0; y < wordleng; y++) {
					oneWord += Astack.pop();
				}

				if (!isPalindrome(oneWord))
					System.out.print(oneWord + " ");
			}
		}

	}
/**
 * Method isPalindrome: Determines if its a palindrome or not
 * @param word
 * @return
 */
	
public static boolean isPalindrome(String word) {
	
	word = StringUtil.stripSpaces(StringUtil.stripPunctuation((StringUtil.lowerCase(word))));

	int size = word.length();
	QueueADT<Character> queue = new QueueADT<>();
	StackADT<Character> stack = new StackADT<>(size);
	
	for (int x = 0; x < size; x++) {
		stack.push(word.charAt(x));
		queue.enqueue(word.charAt(x));
	}

	boolean isPalindrome = true;

	for (int i = 0; i < size; i++) {
		
		char letter = stack.pop();
		
		if (letter != queue.dequeue()) {
			isPalindrome = false;
			break;
		}
	}
	return isPalindrome;
}
}
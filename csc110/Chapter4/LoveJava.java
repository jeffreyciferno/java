package Chapter4;
// ****************************************************************
// Class Name :  LoveJava.java
// Author : Kaden & Jeff
// Date Written :
// Class : CSC110 or CIS163
// Brief Description:  Use a while loop to print many messages 
//                     declaring your passion for Java
// ****************************************************************
import java.util.Scanner;
public class LoveJava
{
    public static void main(String[] args)
    {
	   int limit = 5;
    	int count ;
    	int sum = 0;
		
    	
    	
    	System.out.println("How many times do you want to print the message? ");
    	Scanner scan = new Scanner(System.in);
    	limit = scan.nextInt();
		count = 1;
		while (count <= limit)
		{
			
		    System.out.println("I love Java!!");
		    sum=sum+count;
		    count++;
		    
		   
if ((count % 2 ==0)){
	    		
		   		System.out.println("even");}
	    		
	    
	    		else
	    			
	    			System.out.println("odd");}
	    		
    
		System.out.println("Message was printed " + limit + " times.");
		System.out.println("The sum of the numbers from 1 to " + limit + " is " + sum);
		scan.close();
		
    }
}
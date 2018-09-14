/* 
  Program Name : Usernamegenerator.java
  Author : Jeff Ciferno
  Date Written : 
  Class : CSC110AB
  Brief Description: Generates a ranodm username using scanner and string classes

		  
		  
  */
package Chapter3;
 import java.util.Random;
 import java.util.Scanner;

  public class Usernamegenerator
  {

	  	public static void main(String[] args)
	  	{
	  		
	  		int birthyear;
	  		String lastname;
	  		String firstname;
	  		String first;
	  		String second;
	  		String third;
	  	    int rnum1;
	  	    int rnum2;
	  	    int rnum3;
	  		
	  		Random generator = new Random();
	  		rnum1 = generator.nextInt(26) + 50;
	  		rnum2 = generator.nextInt(101);
	  		rnum3 = generator.nextInt(1001) +1000;
	   
	  	    Scanner scan = new Scanner(System.in); 
	  	
	  	
	  		System.out.println("Enter in your first name: ");
	  		firstname = scan.nextLine();
	  		System.out.println("Enter in your last name: ");
	  		lastname = scan.nextLine();
	  		System.out.println("Enter in your birthyear: ");
	  		birthyear = scan.nextInt();
	  	
	  		first = firstname.substring(0,2) + firstname.length() + lastname + rnum1;
	  		second = firstname.substring(0,1) +lastname + (birthyear%100) + rnum2;
	  		third = lastname.substring(0,3) + (birthyear/100) + firstname + rnum3;
	
	  		System.out.println("Here are the Three possible usernames generated for you:");
	  		System.out.println(first);
	  		System.out.println(second);
	  		System.out.println(third);
		  }

	
		}
	/*

Enter in your first name: 
jeffrey
Enter in your last name: 
ciferno
Enter in your birthyear: 
1998
Here are the Three possible usernames generated for you:
je7ciferno65
jciferno9810
cif19jeffrey1603
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  */
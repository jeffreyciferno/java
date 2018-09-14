package Chapter4;
//Program ID : JellyBeanGame
//Author : Jeff Ciferno
//Date Written : 9/26/17
//Class : CSC110AB
//Brief Description:
//		This program generates a number of jelly beans,  Uses do while loop. 
import java.util.Random;
import java.util.Scanner;
public class JellyBeanGame {

	public static void main(String[] args)
	{ int NumberOfJellyBeans = 0;    
    int guess = 0;               
    int guesses = 0;          
    String play = null;      


     Random gen = new Random();
     Scanner scan = new Scanner (System.in);

do
     {  NumberOfJellyBeans = gen.nextInt(1000) + 1;
    System.out.println("There are between 1 and 1000 jellybeans in the jar.");
    System.out.println("How many do you think are in the jar?");
    
do
{ System.out.print("Enter your guess: ");
    guess = scan.nextInt();

     if (guess > NumberOfJellyBeans)
     { System.out.println("Too high!");
         guesses++;  }
     else if (guess < NumberOfJellyBeans)
     { System.out.println("Too low!");
         guesses++; }
     }    while (guess != NumberOfJellyBeans);

System.out.println("High Five! You got it, after " + (guesses + 1) + " guesses!!");

System.out.print("Play again? Y or N: ");
play = scan.next();
guesses = 0;

} while (play.equalsIgnoreCase("Y"));

     System.out.println("See you later!");

     scan.close();}}

/*
















*/
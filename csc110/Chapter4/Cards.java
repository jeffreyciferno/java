//Program ID : Cards
//Author : Jeff Ciferno
//Date Written : 9/18/17
//Class : CSC110Ab
//Brief Description:
//		This program determines a random card out of a 52 card stack. 
package Chapter4;


import java.util.Random;

public class Cards {
	public static void main (String[] args)
	{

	String cardSuit = null;
	String cornumber = null;
	
	int face;
	int number;
	
	Random generator = new Random();
	face = generator.nextInt(4)+1;
	switch (face) {
	
	case 1: cardSuit = "Diamonds";
	break;
	
	case 2: cardSuit = "Hearts";
	break;
	
	case 3: cardSuit = "Clubs";
	break;
	
	case 4: cardSuit = "Spades";
	break;
	

	}
	number = generator.nextInt(13)+1;
	switch (number) {
	
	case 1: cornumber = "ace";
	break;
	
	case 2: cornumber = "2";
	break;
	
	case 3: cornumber = "3";
	break;
	
	case 4: cornumber = "4";
	break;
	
	case 5: cornumber = "5";
	break;
	
	case 6: cornumber = "6";
	break;
	
	case 7: cornumber = "7";
	break;
	
	case 8: cornumber = "8";
	break;
	
	case 9: cornumber = "9";
	break;
	
	case 10: cornumber = "10";
	break;
	
	case 11: cornumber = "Jack";
	break;
	
	case 12: cornumber = "Queen";
	break;
	
	case 13: cornumber = "King";
	break;

	}
	System.out.println("You have selected the " + cornumber+ " of " + cardSuit);
			}}
		    

	/*
You have selected the 10 of Hearts
You have selected the King of Spades
You have selected the ace of Diamonds
You have selected the 7 of Spades
You have selected the 4 of Clubs
You have selected the 2 of Hearts
You have selected the 8 of Hearts
You have selected the 6 of Spades
	*/

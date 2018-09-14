package Chapter10;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Point;


public class Game {

	// ----------------------------------------------//
	// instance variables - DONT TOUCH DIS
	private static int xCoordinate = 10;
	private static int yCoordinate = 10;
	private static GamePanel object = new GamePanel(30); // creates GamePanel object
														 // parameter represents amount of seconds


	// Create a static variable to represent how many times you attempt to click the circle
		public static int count = 0;
	
	// Create a static variable to represent how many times you successfully click the circle
		public static int goodCount = 0;
	
	
	// ----------------------------------------------//
	// Setup of GUI Program - DONT TOUCH DIS EITHER
	public static void main(String[] args) {
		//Replace the --- with your name! Or whatever you want..
		JFrame frame = new JFrame("---'s Clicker Game");	

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.add(object);
		object.addMouseListener(new MouseListener());

	}

	// ----------------------------------------------//
	// MouseListener Class

	static class MouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			Random gen = new Random();


			Point click = e.getPoint();
			// Add a count to your click attempt variable 
			count++;

			if (Math.abs(click.getX() - xCoordinate) < 10 && Math.abs(click.getY() - yCoordinate) < 10) {
				xCoordinate = gen.nextInt(150) + 1; // Randomly generates X Coordinate for a new circle
				yCoordinate = gen.nextInt(150) + 1; // Randomly generates Y Coordinate for a new circle

				object.drawing(xCoordinate - 10, yCoordinate - 10);

				System.out.println("HIT!"); // Displays you successfully hit the circle
				goodCount++;
				// Add a count to your success variable
				
			}

			// ----------------------------------------------//
			// display the following statements to your console (Sys.out.print):
		
			
			// Display the click position of X and Y
			
			System.out.print( "You clicked: " + click);

			// Display the amount of times the GUI Program was clicked
			// (Shows how many times you attempted to click the circle but failed miserably)
			
			System.out.print( "You clicked: " + count);

			// Display the amount of times you clicked the circle
			
			System.out.print( "You successfully clicked: " + goodCount);

			// Display the accuracy of you hitting the circles


		}

	}

}

package Chapter10;


import javax.swing.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class GamePanel extends JPanel {
	
	//----------------------------------------------------------------------------------------------//
		// instance variables 
	private static int xCoordinate;
	private static int yCoordinate;
	private static int clickAttempt = 0;
	private JLabel theEndLabel;
	private JLabel scoreLabel;
	
	// create a Timer variable for your Timer in the program
	
	
	public GamePanel(int seconds) {
		// Create your Timer object
	    Timer timer;
	    
	    // Set the time of the timer (WE WILL EXPLAIN THIS OK)
	    timer = new Timer();
	    timer.schedule(new RemindTask(), seconds *1000);
	}
	
	//----------------------------------------------------------------------------------------------//
		// Creates the paint tool for the shape - DON'T TOUCH
	public void drawing(int xx, int yy) {
		xCoordinate = xx;
		yCoordinate = yy; 
		clickAttempt++;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.RED);
		g2.fillOval(xCoordinate, yCoordinate, 20, 20);
	}
	//----------------------------------------------------------------------------------------------//
		//Creates the end screen of GUI that displays score - DON'T TOUCH EXCEPT FOR THAT LAST PART
	class RemindTask extends TimerTask {
	    public void run() {
	    	theEndLabel = new JLabel ("");
	    	scoreLabel = new JLabel ("");
	        
	        
	        add(theEndLabel);
	        add(scoreLabel);
	        
	        Font font = new Font("Courier", Font.BOLD, 18 );
	        theEndLabel.setFont(font);
	        theEndLabel.setForeground(Color.BLACK);
	        theEndLabel.setText("Time's up! ");
	        setBackground(Color.RED);
	        
	        Font font2 = new Font("Courier", Font.BOLD ,16 );
	        scoreLabel.setFont(font2);
	        scoreLabel.setForeground(Color.BLACK);
	        scoreLabel.setText("YOU HIT " + clickAttempt + " CIRCLES");
	        setBackground(Color.RED);
	        
	        // Terminate the timer thread using the cancel method (similar to closing a scanner)
	        
	    }
	}

	    
}
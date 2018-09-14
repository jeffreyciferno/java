//********************************************************************
//  Program Name:CarCounter.java   CarCounter 1 Activity     
//  Author :  P Baker / P Jalowiec
//  Date :  
//
//  Brief Description: Demonstrates a graphical user interface and an event listener.
//********************************************************************
package Chapter6;
import javax.swing.JFrame;

public class CarCounter
{
   public static void main(String[] args)
   {
 	  //Create frame and panel
      JFrame frame = new JFrame("Car Counter-JMC");
      CarCounterPanel panel = new CarCounterPanel();

	  //set frame behavior
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	  //place panel in frame
      frame.getContentPane().add(panel);
		
	  //format frame and make available/visible
      frame.pack();
      frame.setVisible(true);
   }
}

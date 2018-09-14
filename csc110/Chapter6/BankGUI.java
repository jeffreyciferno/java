//********************************************************************
//  Program Name:BankGUI.java      
//  Author : Jeff Ciferno 
//  Date: 10/24/17
//  Class: CSC110AB
//  Brief Description: Creates a simple GUI for the BankAccount Class
//********************************************************************
package Chapter6;
import javax.swing.JFrame;

public class BankGUI
{
   //-----------------------------------------------------------------
   //  Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("My Bank Account");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      BankPanel panel = new BankPanel();
      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
  
      
      
      
   }
}

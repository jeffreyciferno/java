//********************************************************************
// Program Name:  CarCounterPanel.java  Starting File - CarCounter 1 Activity 
// Author : P Baker / P Jalowiec
// Date : 
//
// Brief Description:
// 	Demonstrates a graphical user interface and an event listener.
//		Frames, Panels, labels, textfields, buttons
//********************************************************************
package Chapter6;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class CarCounterPanel extends JPanel
{
    private int carCount;
    private JLabel carLabel;
	private JTextField carTextField;
	private JButton carButton;
	private Random gen;
	private JTextField carMakeTextField;
	private JLabel carMakeLabel;
	
	private JLabel carPassengerLabel;
	private JTextField carPassengerTextField;
	private JButton carPassengerButton;
	
	private JLabel passengersPerCarLabel;
	private JTextField passengersPerCarTextField;
	private int passengersPerCar;
 	//Constructor:  Sets up the Panel  
	public CarCounterPanel()
   {
		gen = new Random();
      carCount = 0;
		
	  //create panel components
	  carLabel = new JLabel ("Number of cars: " );
	  carTextField = new JTextField(10);
	  carButton = new JButton("Press Here");
	  carMakeLabel = new JLabel("Car make:");
	  carMakeTextField = new JTextField(10);
	  
	  carPassengerLabel = new JLabel("Passenger");
	  carPassengerTextField = new JTextField (15);
	  carPassengerButton = new JButton("Estimate Passengers");
	  
	  	passengersPerCarLabel = new JLabel("Passengers per car");
		passengersPerCarTextField= new JTextField(10);
		passengersPerCar = 0;
      //add components to panel.  order is important
		add(carLabel);
		add(carTextField);
		add(carButton);
        add(carMakeLabel);
        add(carMakeTextField);
        
        add(passengersPerCarLabel);
        add(passengersPerCarTextField);
        
        add(carPassengerLabel);
        add(carPassengerTextField);
        add(carPassengerButton);
      //connect event handler to event source
    carButton.addActionListener(new ButtonListener());
	
    carPassengerButton.addActionListener(new ButtonListener());	
				
	  //configure panel.  
      setBackground(Color.cyan);
      setPreferredSize(new Dimension(175, 300));
	  carTextField.setText(Integer.toString(0));
   }

   //private internal class that is a listener for button push (action) events.
	//also called an event handler
	private class ButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
    	  
    	  if (event.getSource() == carButton)
    	  {
			//update the counter and the textField with the button is pushed
           carCount = gen.nextInt(51);
           carTextField.setText(Integer.toString(carCount));
			  if (carCount %2 ==1)
			  {  setBackground(Color.YELLOW);
			  		carMakeTextField.setText("Ford");}
			  else
			  {  setBackground(Color.GREEN);
			  carMakeTextField.setText("Chevy");}
			   } 
    	   carPassengerTextField.setText("TBD");
      if(event.getSource() == carPassengerButton){
    	  passengersPerCar= gen.nextInt(3)+1;
    	  passengersPerCarTextField.setText(Double.toString(passengersPerCar));}
    double totalPassengers = Double.parseDouble(carTextField.getText()) *2.0;
	  carPassengerTextField.setText(Double.toString(totalPassengers));}
    
      }//end of ActionPerformed method
		
   }//end of ButtonListener
	
//end of CarCounterPanel

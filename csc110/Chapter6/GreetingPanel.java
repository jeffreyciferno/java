	//********************************************************************
	// Program Name:  GreetingPanel.java  - Starting Code 
	// Author : Jeff Ciferno
	// Date : 10/24/2017
	//
	// Brief Description:  User puts their name in the JTextField.  When the
    //                       button is clicked, the name is retrieved and 
    //                       a nice message is displayed by setting the
    //                       text of a JLabel.
	//********************************************************************
	package Chapter6;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	

	public class GreetingPanel extends JPanel
	{
	   
	   private JLabel questionLabel;  
	   private JTextField answerTextField;
	   private JButton button;
	   private JLabel niceMessageLabel;
	     

	 	//Constructor:  Sets up the Panel  
	   public GreetingPanel()
	   {
	
			//create all the panel components
			
	        questionLabel = new JLabel("What is your name?");
		    button = new JButton("Press Here!");
		    answerTextField = new JTextField(12);
		    niceMessageLabel = new JLabel("Hello, " );
		   
			//add all the components to panel.  order is important
		    add(questionLabel);
		    add(answerTextField);
		    add(button); 
		    add(niceMessageLabel);
	        //connect event handler to event source
	        button.addActionListener(new ButtonListener());
					
			//configure panel.  
	        setBackground(Color.LIGHT_GRAY);
	        setPreferredSize(new Dimension(140, 180));
		  
	   }

	   //private internal class that is a listener for button push (action) events.
		//also called an event handler
		private class ButtonListener implements ActionListener
	   {
	      public void actionPerformed (ActionEvent event)
	      {
	    	  if (answerTextField != null)
	    	  {
	    		  String lastName = answerTextField.getText( );
	    		  niceMessageLabel.setText("Hello, " + lastName);
	    		  
	    	  }
			
			//get the name the user put in the answerTextField
	    	 
	    	   
	    	   //now set the text of the niceMessageLabel 
	    	   //to a nice message that includes the name 
	    	 
	           
				  
	    	  setBackground(Color.GREEN);  
	      }//end of ActionPerformed method
			
	   }//end of ButtonListener
		
	}//end of GreetingPanel



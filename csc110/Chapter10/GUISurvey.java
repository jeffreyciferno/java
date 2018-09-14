//************************************************************************
//Filename:					GUISurvery.java
//Authors:					Seyed Alireza Fasihy, Sam Gurtler,
//							Austin McAvoy, Max Manning, Chris Wilburn
//Description:				Utilizes JFrame components to create a
//							short survey; outputs to a text file.
//************************************************************************

package Chapter10;

import javax.swing.JFrame;


public class GUISurvey {	

	public static void main(String[] args) 
	{
		// create frame and panel
		JFrame frame = new JFrame("GUI Survey");
		SurveyPanel panel = new SurveyPanel();

		// set frame behavior
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
		// place panel in frame
		frame.getContentPane().add(panel);
					
		// format frame and make available/visible
		frame.pack();
		frame.setVisible(true);
	}
}

//************************************************************************
//Filename:					SurveyPanel.java
//Authors:					Seyed Alireza Fasihy, Sam Gurtler,
//							Austin McAvoy, Max Manning, Chris Wilburn
//Description:				Utilizes JFrame components to create a
//							short survey; outputs to a text file.
//************************************************************************

package Chapter10;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingUtilities;


public class SurveyPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	// instance variables
	private JLabel radioButtonLabel, radioButtonLabel2;
	private JRadioButton radioButton1, radioButton2, radioButton3;

	private JLabel checkBoxLabel, checkBoxLabel2;
	private JCheckBox checkBox1, checkBox2, checkBox3;

	private JLabel sliderLabel, sliderLabel2;
	private JSlider surveySlider; 

	private JLabel commentsLabel;
	private JTextField commentsTextField;

	private JButton submitButton;

	private ButtonGroup group = new ButtonGroup();

	public SurveyPanel()
	{
		// box layout code
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		/** CREATE PANEL COMPONENTS **/
		/** radio button section **/
		radioButtonLabel = new JLabel("Radio Buttons: \n");
		radioButtonLabel2 = new JLabel("Select the option that reflects how much are you enjoying this Java class");
		radioButton1 = new JRadioButton("Not at all\n");
		radioButton2 = new JRadioButton("It's okay\n");
		radioButton2 = new JRadioButton("I'm loving it\n");
		/** check box section **/
		checkBoxLabel = new JLabel("Check Boxes: \n");
		checkBoxLabel2 = new JLabel("Please select the class you are currently enrolled in: (select all that apply)\n");
		checkBox1 = new JCheckBox("CSC110");
		checkBox2 = new JCheckBox("CSC205");
		checkBox3 = new JCheckBox("CSC240");
		checkBox1.setSelected(false); 
		checkBox2.setSelected(false); 
		checkBox3.setSelected(false); 
		radioButton1.setSelected(false); 
		/** slider section **/
		sliderLabel = new JLabel("Slider: \n");
		sliderLabel2 = new JLabel("How ready are you for the weekend?\n");
		surveySlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);

		// lambda expression updating sliderLabel with surveySlider's value.
		surveySlider.addChangeListener(l-> sliderLabel.setText("Slider: " + surveySlider.getValue()));

		/** comments section **/
		commentsLabel = new JLabel("Additional Comments: ");
		commentsTextField = new JTextField(50);

		// submit button and listener
		submitButton = new JButton("Submit");
		submitButton.addActionListener(new Listener());

		/** ADD COMPONENTS TO PANEL AND LAYOUT CONFIGURATION**/
		// creates button group so that only one radio button can be selected	
		add(radioButtonLabel);
		add(radioButtonLabel2);
		add(radioButton1);
		add(radioButton2);
		add(radioButton3);
		
		add(checkBoxLabel);
		add(checkBoxLabel);
		
		add(checkBox1);
		add(checkBox2);
		add(checkBox3);
		
		add(sliderLabel);
		add(sliderLabel2);
		
		add(surveySlider);
		
		add(commentsLabel);
		add(commentsTextField);
		group.add(radioButton1);
		group.add(radioButton2);
		group.add(radioButton3);
		
		group.add(checkBox1);
		group.add(checkBox2);
		group.add(checkBox3);
		group.add(submitButton);
		// layout configuration
		GroupLayout gp = new GroupLayout(this);
		gp.setHorizontalGroup(gp.createParallelGroup(GroupLayout.Alignment.CENTER)
				.addGroup(gp.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButtonLabel)
						.addComponent(radioButtonLabel2)
						
						.addComponent(radioButton1)
						.addComponent(radioButton2)
						.addComponent(radioButton3)
						
						.addComponent(checkBoxLabel)
						.addComponent(checkBoxLabel2)
						
						.addComponent(checkBox1)
						.addComponent(checkBox2)
						.addComponent(checkBox3)
						
						.addComponent(sliderLabel)
						.addComponent(sliderLabel2)
						
						.addComponent(surveySlider)
						
						.addComponent(commentsLabel)
						.addComponent(commentsTextField))

				.addGroup(gp.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(submitButton)));

		gp.setVerticalGroup(gp.createSequentialGroup()
				
				.addComponent(radioButtonLabel)
				.addComponent(radioButtonLabel2)
				
				.addComponent(radioButton1)
				.addComponent(radioButton2)
				.addComponent(radioButton3)
				
				.addComponent(checkBoxLabel)
				.addComponent(checkBoxLabel2)
				
				.addComponent(checkBox1)
				.addComponent(checkBox2)
				.addComponent(checkBox3)
				
				.addComponent(sliderLabel)
				.addComponent(sliderLabel2)
				
				.addComponent(surveySlider) 
				
				.addComponent(commentsLabel)
				.addComponent(commentsTextField)
				.addComponent(submitButton));

		gp.setAutoCreateContainerGaps(true);
 
		setBackground(new Color(225,225,225));						// sets background color defined as RGB
		setPreferredSize(new Dimension(500, 500));					// setPreferredSize(new Dimension(x, y))
		setLayout(gp);		
	}//END GUISurveyPanel    

	private class Listener implements ActionListener
	{
		PrintWriter outFile;
		public void actionPerformed (ActionEvent event)
		{
			if(event.getSource() == submitButton && group.getSelection() != null && 
					(checkBox1.isSelected() || checkBox2.isSelected() || checkBox3.isSelected()))			
			{			
				SwingUtilities.getWindowAncestor(submitButton).dispose();
				JOptionPane.showMessageDialog(null, "Thank you for your feedback!");
				try {
					/** YOUR CODE GOES HERE **/
					// general formating
					outFile = new PrintWriter("src/guiSurvey/SurveyResults.txt");
					outFile.println("Java Class Survey Results");
					outFile.println("-------------------------");

					// radio button output
					

					// check box output
					
					
					// slider output
					

					// additional comments output
					outFile.println("Additional Comments: \n");
					outFile.println(commentsTextField.getText());
					outFile.close();				
				} 
				catch (FileNotFoundException e) 
				{
					e.printStackTrace();
				}	
			}else if (event.getSource() == submitButton)
				JOptionPane.showMessageDialog(null, "Please complete the form before submitting");		
		}
	}//END Listener
}//END CLASS

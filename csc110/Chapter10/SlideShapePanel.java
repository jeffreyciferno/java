package teachIn;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SlideShapePanel extends JPanel
{
	//Panel component instances (do not edit)
	private JRadioButton blackButton, whiteButton, neutralButton;
	private JCheckBox redBox, greenBox, blueBox;
	private JSlider heightSlider, widthSlider;
	private JLabel backgroundColorLabel, colorLabel, heightLabel, widthLabel;
	private JPanel controls, shapePanel;
	
	public SlideShapePanel()
	{
		//Radio Buttons (do not edit)
		blackButton = new JRadioButton("Black");
		whiteButton = new JRadioButton("White");
		neutralButton = new JRadioButton("Neutral", true);
		
		//Button Group
		/*Create new ButtonGroup and add blackButton, whiteButton, and neutralButton*/
		
		//(your code here)
		
		/**/
		
		//Check Boxes (do not edit)
		redBox = new JCheckBox("Red    ");
		redBox.setBackground(Color.RED);
		greenBox = new JCheckBox("Green");
		greenBox.setBackground(Color.GREEN);
		blueBox = new JCheckBox("Blue   ");
		blueBox.setBackground(Color.BLUE);
		
		//Sliders
		heightSlider = new JSlider(JSlider.HORIZONTAL, 0, 250, 250);
		heightSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
		heightSlider.setMajorTickSpacing(50);
		heightSlider.setMinorTickSpacing(10);
		heightSlider.setPaintTicks(true);
		heightSlider.setPaintLabels(true);
		
		widthSlider = new JSlider(JSlider.HORIZONTAL, 0, 250, 250);
		widthSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
		/* Configure widthSlider to look like heightSlider*/
		
		//(your code here)
		
		/**/
		
		/*add listeners to buttons, check boxes, and sliders*/
		//ButtonListener for Radio Buttons
		ButtonListener buttonListener = new ButtonListener();
		
		//(your code here)
		
		
		//BoxListener for Check Boxes
		BoxListener boxListener = new BoxListener();
		
		//(your code here)
		
		
		//SliderListener for Sliders
		SliderListener sliderListener = new SliderListener();
		
		//(your code here)
		
		
		/**/
		
		//Labels (do not edit)
		backgroundColorLabel = new JLabel("Background Color");
		colorLabel = new JLabel("Color");
		heightLabel = new JLabel("Height: 250");
		heightLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		widthLabel = new JLabel("Width: 250");
		widthLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		//Panels using BoxLayout (do not edit)
		controls = new JPanel();
		BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
		controls.setLayout(layout);
		controls.add(backgroundColorLabel);
		controls.add(blackButton);
		controls.add(whiteButton);
		controls.add(neutralButton);
		controls.add(Box.createRigidArea(new Dimension (0, 20)));
		controls.add(colorLabel);
		controls.add(redBox);
		controls.add(greenBox);
		controls.add(blueBox);
		controls.add(Box.createRigidArea(new Dimension (0, 20)));
		controls.add(heightLabel);
		controls.add(heightSlider);
		controls.add(Box.createRigidArea(new Dimension (0, 20)));
		controls.add(widthLabel);
		controls.add(widthSlider);
		
		shapePanel = new JPanel();
		shapePanel.setPreferredSize(new Dimension (250, 250));
		shapePanel.setBackground(new Color (0, 0, 0));
		
		add(controls);
		add(shapePanel);
		setPreferredSize(new Dimension(500,400));
	}
	
	//ButtonListener Class
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			/* setBackground to color of selected button*/
			
			//(your code here)
			
			/**/
		}
	}
	
	//BoxListener Class
	private class BoxListener implements ItemListener
	{
		private int red, green, blue;
		
		public void itemStateChanged(ItemEvent event)
		{
			red = 0;
			green = 0;
			blue = 0;
			
			/*if box isSelected, set color value to 255*/
			
			//(your code here)
			
			/**/
			
			shapePanel.setBackground(new Color(red, green, blue));
		}
	}
	
	//SliderListener Class
	private class SliderListener implements ChangeListener
	{
		private int height, width;
		
		public void stateChanged(ChangeEvent event)
		{
			/* getValue of sliders & update heightLabel and widthLabel*/
			
			//(your code here)
			
			/**/
			
			shapePanel.setPreferredSize(new Dimension (width, height));
		}
	}
}

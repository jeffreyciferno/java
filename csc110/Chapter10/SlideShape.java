package teachIn;

import java.awt.*;
import javax.swing.*;

public class SlideShape
{
	//----------------------------------------------------------
	//	Presents a frame with a control panel, and a panel that
	//	changes size as sliders are adjusted, color as boxes
	//	are checked, and background as buttons are selected
	//----------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Slide Shape");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new SlideShapePanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
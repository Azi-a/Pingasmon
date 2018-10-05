package plasma;
/**
 *  CarTester.java tests the individual methods of the Car class, making
 *  sure the car can be drawn and moved forward.
 *  @author Tracy Ishman
 *  Date: 12 Sep 16
 */

import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class PlasmaTester extends JComponent
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	private static final int[] RESOLUTION = {1920,1080};
	@Override
	public void paintComponent(Graphics g)
	{
		Plasma p = new Plasma()
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(Plasma);
		// Create a Car object and draw it
		
	}
	
	
	public static void main(String[] args)
	{
		// Create a frame for drawing and add this component
		JFrame frame = new JFrame("Plasma");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation((RESOLUTION[0]/2)-WIDTH/2,(RESOLUTION[1]/2)-HEIGHT/2);
		frame.add(new PlasmaTester());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
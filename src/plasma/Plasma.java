package plasma;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import ec.util.MersenneTwisterFast;

public class Plasma 
{
	private MersenneTwisterFast rng = new MersenneTwisterFast();
	
	public static final int numColors = 5;
	public static final int baseheight = 20;
	public static final int basewidth = 100;
	
	
	
	Line2D  hoey;
	
	private int stx;
	private int sty;
	private int lx;
	private int ly;
	
	Color[] paints;	 //array bc of multiple colors to color different parts of the car
	
	
	/*
	 * Constructs a Car Object, specifically, defines the starting point
	 * (top left hand corner) for the distance of the Car to branch from, and main color
	 * @param stemX starting point
	 * @param stemY starting point( 
	 */
	public Plasma(int length,int branches, double branchVariation)
	{
		
		paints = new Color[numColors];
		
		paints[1] = Color.BLACK;
	}
	
	/*
	 * Draws the Car object, using a various combinations of shapes to make it up.
	 */
	public void draw(Graphics2D gr)
	{
	gr.drawLine(x1, y1, x2, y2);
	}
	
	/*
	 * (non-Javadoc)
	 * @see Racer#moveForward(int)
	 */
	
	public Line2D branch(int branchAmt)
	{
		
		for(int x = 0; x<branchAmt; x++)
		{
			
		}
		
	}
}

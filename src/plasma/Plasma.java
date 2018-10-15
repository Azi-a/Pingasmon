package plasma;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Line2D;

import javax.swing.plaf.multi.MultiTableHeaderUI;

import ec.util.MersenneTwisterFast;
import javafx.scene.Node;
import javafx.scene.shape.Line;

public class Plasma 
{
	private MersenneTwisterFast rng = new MersenneTwisterFast();
	
	
	
	public Plasma(int length,int branches, double branchSizeVariation, double branchAngleVariation)
	{
		
	}
	
	
	public void draw(Graphics2D gr)
	{
	
	}
	
	
	public Line branch(Line parent, double angleMod, double sizeMod)
	{
		double angle = 2.0;
		
		Point begin = new Point(parent.getStartX(),parent.getStartY());
		double sizex = parent.getEndX() - parent.getStartX();
		double sizeY = parent.getEndY() - parent.getStartY(); 
		
		
		
		double modifier = (rng.nextDouble()*angleMod/2) - angleMod /2;
		
		
		
		
		System.out.println(angleMod + " " + modifier);
		return new Line();
	}
	
	private double pyth(double x, double y, double sizeChange)
	{	
		
		double angle = 0;
		
		double a = Math.cos(angle);
		double b = Math.sin(angle);
		
		
		a	= (int) (Math.ceil(a));
		b 	= (int)(Math.ceil(b));
		
		
		
		
		
		return sizeChange*Math.sqrt((a^2)*(b^2)); 
	}
	
		public float getAngle(Point target) {
	    float angle = (float) Math.toDegrees(Math.atan2(target.y - y, target.x - x));

	    if(angle < 0){
	        angle += 360;
	    }

	    return angle;
	}
	
}

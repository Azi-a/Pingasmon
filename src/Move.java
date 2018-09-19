import java.util.Scanner;

import ec.util.MersenneTwister;

public class Move
{
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String name; // atk name
	public String category; // physical or special
	public double accuracy;
	public int bp;
	public String type; /* i've used this for stab, i'll leave an empty method for you */
	
	public int[] statuses = new int[6]; 
	public int pp;
	public int ppMax;
	
	
		public Move()
		{
			
		}
	

	//move constuctor for loaded moves
		public Move (String name, String category, int bp, int[] statuses, double accuracy, int pp, 
				int ppMax, String type)
		{
		}
		  //compact move definer for unloaded moves
	   public Move(String name, int pp)
	   {
	   }
	  

	   
	   
	public static Move parseMove(String chunk) 
	{ 	Move movieWoovie = new Move();
		Scanner scan = new Scanner(chunk);
		movieWoovie.name = scan.next();
		movieWoovie.category = scan.next();
		movieWoovie.bp = scan.nextInt();
		movieWoovie.accuracy = scan.nextDouble();
		movieWoovie.type = scan.next();
		scan.close();
		return movieWoovie;
	}
	
	 @Override
	   public String toString()
	   {
		   String weed = "";
		   weed += this.name + " ";
		   weed += this.category + " ";
		   weed += String.valueOf(this.bp) + " ";
		   weed += String.valueOf(this.accuracy) + " ";
		   weed += this.type;
		   return weed;
		   
	   }
	 
	 
}

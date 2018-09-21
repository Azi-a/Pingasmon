import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import ec.util.MersenneTwisterFast;

/**
 * @author zayd.moosajee.1
 *
 */
public abstract class Life 
{
	protected static String name;
	protected int[] stats;
	protected Move[] moves;
	protected File target;
	
	private MersenneTwisterFast rng;
	private PrintWriter out;
	private Scanner in;
	

	/*
	 * Creates a new lifeform, generating predefined RNG values
	 * 
	 */
	public Life(String name, Move[] moves, int[] base)
	{
		
	}
	
	/*
	 * Creates a new lifeform with predefined RNG values(ivs, nature)
	 * @param base base stats
	 * @param
	 */
	public Life(String name, Move[] moves, int[] base, int[] ivs, int[] nature)
	{
		
	}
	
	
	
	
}

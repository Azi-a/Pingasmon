import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author zayd.moosajee.1
 *
 */
public abstract class Life 
{
	protected static String name;
	protected Move[] moves;
	protected int[] stats;
	
	private PrintWriter out;
	private Scanner in;
	protected File target;

	public Life()
	{
		
	}
	
	/*
	 * Creates a new lifeform
	 * @param
	 * @param
	 */
	public Life(String name, Move[] moves, int[] stats)
	{
		
	}
}

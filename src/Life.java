import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import ec.util.MersenneTwisterFast;

/**
 * @author zayd.moosajee.1
 *
 */
public abstract class Life implements Serializable
{
	protected static String name;
	protected int[] stats;
	private double currhp;
	protected Move[] moves;
	private int level;
	private double exp;
	
	private MersenneTwisterFast rng;
	
	private File target;
	private static String destination;
	private FileInputStream in;
	private ObjectInputStream loader;
	private FileOutputStream out;
	private ObjectOutputStream saver;
	
	private static String systemType;
	
	/**
	 * Creates a bare-bones Lv. 1 Lifeform with a name and IVs
	 * @param name the name of the lifeform
	 */
	public Life(String name)
	{
		//Instantiation
		rng = new MersenneTwisterFast();
		level = 1;
		exp = 0.0;
		moves = new String{"Tackle","Falcon Pawnch"};
		int[] IVs = new int[6];
		//IV generation
		
		for(int x = 0; x < 6;x++)
		{
			IVs[x]=rng.nextInt(31);
		}
	}
	
	/*
	
	/**
	 * Creates a new lifeform interactively, generating predefined RNG values
	 * @param name name of this lifeform
	 * @param types all types of this lifeform
	 * @param base base stats of this lifeform
	 * @param moves array of moves this lifeform knows
	 
	public Life(String name, String types, int[] base, Move[] moves)
	{
		//automatic RNG creation to be used when creating a new Life for debug purposes
	//	Scanner scan = new Scanner(System.in);
		System.out.println();
		rng = new MersenneTwisterFast();
		int a = rng.nextInt();
		System.out.println(a);
	}
	
	/**
	 * Creates a new lifeform automatically with manually defined RNG values (ivs, nature)
	 * @param name name of this lifeform
	 * @param types types of this lifeform, in this format: "type1 type2 type3".
	 *  'x' indicates no type
	 * @param base base stats of this lifeform
	 * @param ivs ivs of this lifeform
	 * @param nature nature of this lifeform in the format[hindered,boosted]
	 * @param moves array of moves this lifeform knows
	 
	public Life(String name, String types, int[] base, int[] nature, int[] ivs,  Move[] moves)
	{
		//manual defining of every value for pinpointing/uploading detailed Life data
	}
	
	
	
	/**
	 * @param lifeform
	 */
	public static void save(Life lifeform)
	{
		//TODO check to make sure core directory exists, throwing an exception if it doesn't
		//TODO check for lifeform subdirectory, creating it if it doesn't exist(with a user warning)
		//TODO use Object writers to efficiently save data
	
	}
	
	
}

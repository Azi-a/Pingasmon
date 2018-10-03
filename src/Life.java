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
	
	private MersenneTwisterFast rng;
	
	private File target;
	private static String destination;
	private FileInputStream in;
	private ObjectInputStream loader;
	private FileOutputStream out;
	private ObjectOutputStream saver;
	
	private static String systemType;
	

	/*
	 * Creates a new lifeform, generating predefined RNG values
	 * @param name name of this lifeform
	 * @param types all types of this lifeform
	 * @param base base stats of this lifeform
	 * @param moves array of moves this lifeform knows
	 */
	public Life(String name, String types, int[] base, Move[] moves)
	{
		
	}
	
	/*
	 * Creates a new lifeform with predefined RNG values (ivs, nature)
	 * @param name name of this lifeform
	 * @param types types of this lifeform, in this format: "type1 type2 type3".
	 *  'x' indicates no type
	 * @param base base stats of this lifeform
	 * @param ivs ivs of this lifeform
	 * @param nature nature of this lifeform in the format[hindered,boosted]
	 * @param moves array of moves this lifeform knows
	 */
	public Life(String name, String types, int[] base, int[] nature, int[] ivs,  Move[] moves)
	{
		
	}
	
	//TODO check to make sure core directory exists, throwing an exception if it doesn't
	//TODO check for lifeform subdirectory, creating it if it doesn't exist(with a user warning)
	//TODO use Object writers to efficiently save data
	public static void save(Life lifeform)
	{
		
	
	}
	
	
}

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
	/**
	 * name of the lifeform
	 */
	protected static String name;
	
	private int[] stats;
	
	private Move[] moves;
	
	private double currhp;
	
	
	private MersenneTwisterFast rng;
	
	private static File target;
	private static String destination;
	private FileInputStream in;
	private ObjectInputStream loader;
	private FileOutputStream out;
	private ObjectOutputStream saver;
	
	private static String systemType;
	private static String seperator;

	/**
	 * Creates a new lifeform, generating predefined RNG values
	 * @param name name of this lifeform
	 * @param types all types of this lifeform
	 * @param base base stats of this lifeform
	 * @param moves array of moves this lifeform knows
	 */
	public Life(String name, String types, int[] base, Move[] moves)
	{
		
	}
	
	/**
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
	/**
	 * Saves the lifeform into the respective folder in the core directory.
	 * This only works with Life that is either a trainer or is owned by one.
	 * @param lifeform Life's data to save
	 */
	public static void save(Life lifeform)
	{
		//systemType = System.getProperty("os.name");
		destination = System.getProperty("user.home");
		seperator = System.getProperty("file.seperator");
//		target = new File(destination + "/.Pingasmon 4.1.0").mkdir();
		System.getProperties();
		
	//	target = new Folder
	// "C:\Users\zayd.moosajee.1
	
	}
	
	
}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author zayd.moosajee.1
 *
 * @param <T> the type of the object being loaded/saved
 */
public class PmonIO<T> implements Serializable
{
	//for specified update checks on the first few lines of an object
	private static PrintWriter out;
	private static Scanner in;
	
	//loader
	private static FileInputStream fileIn;
	private static ObjectInputStream objIn;
	
	//saver
	private static FileOutputStream fileOut;
	private ObjectOutputStream objOut;
	
	//target File
	private static File target;
	
	/**
	 * The hashmap which maps every major object in the game to a string location
	 * <li>
	 * trainers
	 * pmon
	 * core data
	 * 
	 * <li>
	 */
	private HashMap tracer;
	
	
	/**
	 * 
	 */
	public PmonIO() 
	{
		super();
		
	}

	
	
	/**
	 * saves the given object T, without handling exceptions internally
	 * Prepare yourself for handling an exceptionpocalypse
	 * @throws FileNotFoundException do i really need to explain this???
	 * @throws IOException general exception whichll prob be handled internally anyways
	 * 
	 */
	public void saveFlex(T saveMe) throws FileNotFoundException,IOException
	{
		fileOut = new FileOutputStream("null(?)");
		
		objOut = new ObjectOutputStream(fileOut);
		
		objOut.writeObject(saveMe);
	}
	
	/**
	 * saves an object, handling all exceptions internally
	 * internally handled exceptions means more work for me, but less for you!
	 * @param saveMe
	 */
	public void saveAuto(T saveMe)
	{
		try {
		fileOut = new FileOutputStream("null(?)");
		
		objOut = new ObjectOutputStream(fileOut);
		
		objOut.writeObject(saveMe);
			}
		catch(FileNotFoundException e)
		{
			
		} catch (IOException e) {
			
		}
	}
	
	
	/**
	 * 
	 */
	public File getAddress()
	{
		
	}
	
	
	
	/**
	 * @return the loaded Object.
	 */
	public T load()
	{
		return null;
		
	}
	
	//make a hashtree to point file/object/trainer names to their locations on disk.
	
}

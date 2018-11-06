import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.security.KeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Azi-a
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
	private HashMap<String[],String> tracer;
	
	
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
	 * uses the tracer(HashMap) and the key given to produce the respective File
	 * @param theory the name of the object
	 * @param theory code of the object--see ???.txt
	 * @return File that corellates with the given String
	 * @throws KeyException when the key cannot be found
	 */
	public String getAddress(String theory) throws KeyException
	{	Iterator<String[]> iter;
		Set arc = tracer.keySet();
		iter = arc.iterator();
		while(iter.hasNext())
		{
			String[] blarg = iter.next();
			for(String yhe : blarg)
			{
			if(theory.equals(blarg))
			return tracer.get(blarg);
			System.out.println(".");
			
			
			
			}
			
		
		}
		
		String conf;
		
		
		return new File("");
		
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

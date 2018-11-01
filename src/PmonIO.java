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
	
	private HashMap tracer;
	
	
	/**
	 * 
	 */
	public PmonIO() 
	{
		super();
		
	}

	
	
	/**
	 * saves the given object T
	 */
	public void save(T saveMe)
	{
		fileOut = new FileOutputStream("null(?)");
		objOut = new ObjectOutputStream(fileOut);
		objOut.writeObject(saveMe);
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

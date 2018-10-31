import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

/**
 * @author zayd.moosajee.1
 *
 * @param <T> type of the object being loaded/saved
 */
public class PmonIO<T> implements Serializable
{


	private PrintWriter out;
	private Scanner in;
	

	
	FileInputStream fileIn;
	ObjectInputStream objIn;
	
	
	/**
	 * 
	 */
	public void save()
	{
		
	}
	
	/**
	 * @return the loaded Object.
	 */
	public T load()
	{
		return null;
		
	}
	
	
	
}

//TODO make a universal PmonObject superclass that is a subclass ofthe Object interface
	//TODO make a getName method, and a SetName/constructor method 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.file.FileAlreadyExistsException;
import java.security.KeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException;
import java.io.IOException;
import ec.spec.arrS;
/**
 * @author Azi_a
 *
 * @param <T> the type of the object being loaded/saved
 */
public class PmonIO<T> implements Serializable
{
	
	protected static File core;
	protected static HashMap<String[],String> tracer;
	
	
	//saver
	private static FileOutputStream fileOut;
	private ObjectOutputStream objOut;
	
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
	 * @param saveMe object to save
	 * @throws FileNotFoundException do i really need to explain this???
	 * @throws IOException general exception whichll prob be handled internally anyways
	 * 
	 */
	public void saveFlex(T saveMe) throws FileNotFoundException,IOException
	{
		fileOut = new FileOutputStream("null(?)");
		
		this.objOut = new ObjectOutputStream(fileOut);
		
		this.objOut.writeObject(saveMe);
	}
	
	/**
	 * saves an object, handling all exceptions internally
	 * internally handled exceptions means more work for me, but less for you!
	 * @param saveMe object to save
	 */
	public void saveAuto(T saveMe)
	{
		try {
		fileOut = new FileOutputStream("null(?)");
		
		this.objOut = new ObjectOutputStream(fileOut);
		
		this.objOut.writeObject(saveMe);
			}
		catch(FileNotFoundException e)
		{			//
		} 
		catch (IOException e) 
		{
			//
		}
	}
	
	
	
	
	
	/**
	 * @return the loaded Object.
	 */
	public T load()
	{
		return null;
		
	}
	
	//make a hashtree to point file/object/trainer names to their locations on disk.
	
	
/** The Tracer class manages the tracer(aka just an ordinary hashmap), loading data and maybe saving it.
 * But for now all it does is just get adresses for objects in an efficient way.
 * @author zayd.moosajee.1
 *
 */
public static class Tracer
{
		private Scanner meme;
		
		private static final String tracerFilePath = "";
	//	private static final String tracerFilePath = ;
		
		
		
		
		
		/** Tracer "tester" #1--automatic, constructs on the spot, always does getAddress
		 * @param theory object to retrieve
		 * 
		 */
		public Tracer(String theory)
		{
			File loc = new File(tracerFilePath);
			tracer = new HashMap<>();
			try {this.meme = new Scanner(loc);} 
		catch (FileNotFoundException e) {e.printStackTrace();}
			
		}
		
		
		
		
		/**
		 * uses the tracer and the key given to produce the requested File
		 * @param theory the name of the object OR it's code. See (reallyhelpfuljavadoc) 
		 * for the exact codes. 
		 * @return File that corellates with the given String
		 * @throws KeyException when the key cannot be found
		 */
		public File getAddress(String theory) throws KeyException
		{	
			Iterator<String[]> iter;
			Set<String[]> arc = tracer.keySet();
			
			iter = arc.iterator();
			while(iter.hasNext())
			{
				String[] blarg = iter.next();
				for(int x = 0; 0 < blarg.length; x++)
				{
					if(theory.equalsIgnoreCase((blarg[x])))
					{
						System.out.println("The address for " +  
					blarg[0] + " was found: \t" + tracer.get(blarg)); 
						return new File(blarg[x]);
					}
				}
				
			
			}
			
			throw new KeyException();
			
		}
		
}
	
	
/** The CoreManager inner class manages retreiving and returning locations on the disk, as well as doing tasks
 * like returning a filepath which the OS can understand.
 * This class differentiates from PmonIO in that it handles getting the location of physical files. 
 * I mean i guess i could just intergrate it with the PmonIO class. 
 * but then it'd be really messy.
 *@author Azi-a 
 *@version 0.0
 */
public static class CoreManager
{						
	
	
	// 2 backslashes cuz escape characters			
		private static final String PISDCORE  = ("H:\\Pingasmon");
		private static final String GENCORE = (System.getProperty("user.home") +
		System.getProperty("file.separator") + "Pingasmon");
		protected static boolean pi = false;
		
		
		
		
//		private static Scanner manualIn = new Scanner(System.in);
		
		
		/**
		 * @return core directory File
		 */
		public static File getCoreDirectory()
		{
		
			if(checkCore())
			return core;
			
			try 
			{
				createNewCore(pi);
			}
			catch (FileAlreadyExistsException e) 
			{
				System.out.print("The core folder already exists. ");
				final String optinos = "Select an option.\n"
						+ 	"\t1	|	cancel\n"
						+ 	"\tn/a	|	overwrite\n"
						+ 	"\tn/a	|	backup&overwrite";
				System.out.println();
				System.out.println();
				
				
				Scanner scan = new Scanner(System.in);
				while((scan.next())!="1")
				{
					System.out.println("Invalid option. Try again.");
					System.out.println(optinos);
				}
				scan.close();
				
				
			}
			return core;
				
			
		}
		
		
		
		
		
		/** Checks to see if the core exists, initializing it if it does.
		 * 	Does NOT verify if subfiles exist.
		 * @return true if core exists, false otherwise
		 */
		static boolean checkCore()
		{
			
			File PISD = new File(PISDCORE);
			File winlinux = new File(GENCORE);
			//check for PISD core
			if(isPISD())
			{	pi=true;
				if(PISD.exists())
				{
					core = PISD;
					System.out.println("Core found and set to " + PISD);
					System.out.println(arrS.pr(PISD.listFiles()));
					return true;
				}
				return false;
				
			}	
			if(winlinux.exists())
			{
				System.out.println("Core found and set to " + winlinux);
				core = winlinux;
				return true;
			}
			System.out.println("No core was found.");
			return false;
			
			//who cares about mac

		}
		
		
		/**
		 * @param ispisd
		 * @throws FileAlreadyExistsException if the directory already exists, an exception will be thrown.
		 */
		private static void createNewCore(boolean ispisd) throws FileAlreadyExistsException
		{
			core.mkdirs();
		}
		/**
		 * 
		 * @return whether the current username is in PISD format
		 */
		private static boolean isPISD()
		{
			
		//	File tester = new File(GENCORE);
			String[] split = System.getProperty("user.name").split("[.]");
			
			for(int x = 1; x < split[0].length(); x++)
			{
				if(Character.isUpperCase(split[0].charAt(x)))
					return false;
			}
			for(int x = 1; x < split[1].length(); x++)
			{
				if(Character.isUpperCase(split[1].charAt(1)))
					return false;
			}	
			
			if(!Character.isDigit(split[2].charAt(0)))
			return false;
			
		/*	if(!tester.exists())
			{
			System.out.println("PISD Apps weren't found, is this a PISD computer?");
			if((manualIn.next()).contains("y"))
			return true;
			return false;
			}
		*/
			if(new File("H:\\").exists()) 
			{
				System.out.println("PISD computer detected.");
			return true;
			}
			return false;
		}
		
		
		
		//TODO make method that creates the core directory, with all main subfolders and directories
}

	
}

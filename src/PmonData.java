


import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *@author Azi-a 
 *@version 0.0
 */
public class PmonData implements Serializable
{
	private static final String sp = System.getProperty("file.separator");
	private static final String Core = System.getProperty("user.home") + sp + "Pingasmon";
	private static final String f = null;
	
	String destination;
	private PrintWriter out;
	private Scanner in;
	
	File 
	private static Scanner manualIn = new Scanner(System.in);
	
	
	
	/**
	 * @return core directory File
	 */
	public static File getCoreDirectory()
	{
		
		
		
		//set destination to home directory regardless of OS
			
			
		//detect if it is running on a PISD computer(via the format of the username of first.last.#)
			
			
			//	target = new Folder
			// "C:\Users\zayd.moosajee.1
			return null;
	}
	/**
	 * @return
	 */
	public static boolean coreExists()
	{
		//check for PISD core
		if(isPISD())
			if (new File("H:\\Pingasmon").exists())
			s
			return true;
		//check for generic Windows core
		if()
		//check for generic Linux core
		
		//who cares about mac
		
		
	}
	
	
	private static void createNewCore()
	{
		
	}
	
	private static boolean isPISD()
	{
		
		File tester = new File("C: " + sp + "Program Files (x86) " + sp + "Netop" + sp + "Vision" + sp + "lock.bmp");
		String[] split =System.getProperty("user.name").split(".");
		
		for(int x = 0; x < split[0].length(); x++)
		{
			if(Character.isUpperCase(split[0].charAt(x)))
				return false;
		}	
		if(split[1].charAt(0)!='.')
				return false;
		for(int x = 0; x < split[2].length(); x++)
		{
			if(Character.isUpperCase(split[2].charAt(x)))
				return false;
		}	
		
		if(!Character.isDigit(split[3].charAt(0)))
		return false;
		
		if(!tester.exists())
		{
		System.out.println("Netop wasn't found, but your username was in PISD format."
				+ " \n Is this a PISD computer?");
		if((manualIn.next()).contains("y"))
		return true;
		return false;
		}
		return true;
		
	}
	
	
	
	
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
	public Object load()
	{
		return fileIn;
		
	}
	
	//TODO make method that creates the core directory, with all main subfolders and directories
}

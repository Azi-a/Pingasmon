


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
	private static final String PISDCORE  = ("H:\\Pingasmon");
	private static final String GENCORE = (System.getProperty("user.home") +
	System.getProperty("file.separator") + "Pingasmon");
	private static final String sp = System.getProperty("file.separator");
	private static final String f = null;
	
	String destination;
	private PrintWriter out;
	private Scanner in;
	
 
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
	public static File getCoreType()
	{
		File PISD = new File(PISDCORE);
		File winlinux = new File(GENCORE);
		//check for PISD core
		if(isPISD())
		{
			if(PISD.exists())
			return PISD;
			return null;
		}	
		if(winlinux.exists())
		return winlinux;
		return null;
		
		//who cares about mac
		
		
	}
	
	
	private static void createNewCore(String loc)
	{
		
	}
	
	private static boolean isPISD()
	{
		
	//	File tester = new File(GENCORE);
		String[] split = System.getProperty("user.name").split("[.]");
	
		for(String a : split)
		{
			System.out.println(a);
		}
	
		
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
		return true;
		return false;
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

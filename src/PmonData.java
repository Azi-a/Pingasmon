


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *@author Azi-a 
 *@version 0.0
 */
public class PmonData
{										// 2 backslashes cuz escape characters			
	private static final String PISDCORE  = ("H:\\Pingasmon");
	private static final String GENCORE = (System.getProperty("user.home") +
	System.getProperty("file.separator") + "Pingasmon");

	
	
	private static File core;

	
	/**
	 * "tests" the various methods in the class, for the purpose of built in, efficient 
	 * exception handling.
	 * 	 * efficiently 
	 * @param option choice 
	 */
	public void psuedoTester(int option)
	{
		
	}
	
	
	
	
	
//	private static Scanner manualIn = new Scanner(System.in);
	
	
	/**
	 * @return core directory File
	 */
	public static File getCoreDirectory()
	{
		
		checkCore();
		
		return core;
	}
	
	
	
	
	
	/**
	 * @return
	 * Checks if a core exists, setting the target(the variable core) to the file if it does
	 */
	static boolean checkCore()
	{
		
		File PISD = new File(PISDCORE);
		File winlinux = new File(GENCORE);
		//check for PISD core
		if(isPISD())
		{
			if(PISD.exists())
			{
				core = PISD;
				return true;
			}
			return false;
			
		}	
		if(winlinux.exists())
		{
			core = winlinux;
			return true;
		}
		return false;
		
		//who cares about mac

	}
	
	
	/**
	 * @param loc
	 * @throws FileAlreadyExistsException if the directory already exists, an exception will be thrown.
	 */
	public static void createNewCore(String loc) throws FileAlreadyExistsException
	{
		
	}
	/**
	 * 
	 * @return whether the current username is in PISD format
	 */
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
	
	
	
	//TODO make method that creates the core directory, with all main subfolders and directories
}

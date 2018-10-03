


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *@author Azi-a 
 *@version 0.0
 *@
 */
public class PmonData 
{
	private static final String sp = System.getProperty("file.separator");
	private static final String Core = System.getProperty("user.home") + sp + "Pingasmon";
	private static final String 
	
	private PrintWriter out;
	private Scanner in;
	
	private static Scanner manualIn = new Scanner(System.in);
	
	
	
	public static File getCoreDirectory()
	{
		String destination;
		
		
		//set destination to home directory regardless of OS
			
			
		//detect if it is running on a PISD computer(via the format of the username of first.last.#)
			
			
			//	target = new Folder
			// "C:\Users\zayd.moosajee.1
			return null;
	}
	public static boolean coreExists()
	{
		destination
		if(!isPISD() && new File(""))
	}
	
	public static void createNewCore()
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
		else return false;
		}
		return true;
		
	}
	
	
	
	
	
	
	
	
	public void save()
	{
		
	}
	
	public Object load()
	{
		return new Pmon();
	}
	
	//TODO make method that creates the core directory, with all main subfolders and directories
}

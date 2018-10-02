import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.File;

/**
 * @author Azi-a
 *
 */
public class PmonData implements Serializable
{
	private PrintWriter out;
	private Scanner in;
	private static File core;
	private static String destination;
	/**
	 * List of all folder names created in the directory
	 * 
	 */
	public static final String[] FOLDERS = {}
	
	public void save()
	{
		System.getProperties();
	}
	
	public Object load()
	{
		return new Pmon();
	}
	
	//TODO make method that creates the core directory, with all main subfolders and directories
	/** 
	 * Creates the main directory for data. VERY DANGEROUS if not done correctly, as it will wipe out all data. 
	 */
	public static void createCore()
	{
	destination = System.getProperty("user.home") + System.getProperty("file.seperator") + "Pingasmon 4.1.0";
	if((core = new File(destination)).exists())
		{
		System.out.println("Stage 1 failed: Core directory already exists");
			System.exit(0);
		}
	else if(core.mkdirs())
		{
			System.out.println("Stage 1 complete");
			
		}
	}
	
	/**
	 * Retreives a file from any given location, in the respective Pmon directory
	 * @param path path of the target file, ex. "Data Humans Jyo". Starts at the core Pmon directory
	 */
	public File pingFile(String path)
	{
		
		return new File(destination);
	}
	
	/**
	 * @param toSave the object that needs to be saved
	 * @param target the target directory starting at the core Pmon directory
	 */
	public static void saveObject(Object toSave, Path target)
	{
		
	}
	
	public static Object loadObject()
	{
		
	
	}
	
}

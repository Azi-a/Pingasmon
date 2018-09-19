import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Write a description of class Types here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Type
{
    // instance variables - replace the example below with your own
    int value;
    String name;
    String shortname;
    //type creation
    private static double[][] matchups;
    static Type[] types;
    static int numTypes;
    
    /**
     * Constructor for objects of class Types
     */
    public Type()
    {
       value = -1;
       name = "Null";
       shortname = "NLL";
    }
    public Type(int value, String name, String shortname)
    {
    	
    }
    
   
   
    
    public static void loadTypes() throws FileNotFoundException
    {
    	Path path;
    	Scanner s;
    	String nam = "";
    	String shor= "";
    	double n = 0;
    	
    	path = Paths.get("/home/euglena/Pmon/Data/System/types");
    	
    	s = new Scanner(new BufferedReader(new FileReader((path.toString()))));
    	numTypes = s.nextInt();
    	
    	types = new Type[numTypes];
    	matchups = new double[numTypes][numTypes];
    	
    	for(int counter = 0; counter < numTypes; counter++)
    	{
    	types[counter] = new Type();
    	types[counter].value = counter;
    	types[counter].name = s.next();
    	types[counter].shortname = s.next();
    	}
    	System.out.println(s.next());
    	for(int defend = 0; defend<numTypes;defend++)
    	{
    		System.out.println();
    		for(int attack = 0; attack<numTypes;attack++)
    		{
    			n = s.nextDouble();
    			System.out.print(n + " ");
    			matchups[attack][defend] = n;
    		}
    		
    	}
    	s.close();
    }
  
    
    public static void dispTypes()
    {
    	System.out.println("Individual type data");
    	for(int x = 0; x<numTypes;x++)
    	{
    		System.out.println(types[x].value + " " + 
    	types[x].shortname + " " + types[x].name);
    		
    	}
    }
    public String toString;
    {
    	
    }
    
    
    
    	
    
    
}

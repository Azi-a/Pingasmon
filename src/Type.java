import java.io.File;
import java.util.Scanner;

/**
 * 
 * @author euglena
 *
 */
public class Type 
{

 static final double[] MATCHUP_POWER = {2,3,5};
 
 
	private String[] ref; //the index of the type is it's index in both dimensions of matchups, and the string is it's name.
	private int[][] matchups;
	private Scanner in;
	File typedata;
//first dimension is defending type, second is attacking


	/**
	 * 
	 * @param attacking attacking type in form of ("type")
	 * @param defending defending type in form of ("type1 type2 type3")
	 * @return power of the attack
	 */
	public double getTypeMatchup(String attacking, String[] defending)
	{
		return 0.0;
		
	}
}

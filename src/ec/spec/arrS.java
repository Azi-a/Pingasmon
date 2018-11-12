package ec.spec;

/**
 * just gives a method to easily print the contents of an array.
 */
public class arrS
{
	/**
	 * 
	 */
	protected static String normal = "";
	/**
	 * @return
	 */
	public static String pr(Object[] array)
	{
		
		normal+="[";
		for(int x = 0; x < array.length; x++)
		{	
			normal+= array[x];
			if(x<array.length-1)
				normal+= ", ";
		}
		return normal+="]";
	}
}

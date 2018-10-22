import java.util.Map;
/**
 * @author zayd.moosajee.1
 *
 */
public class Human extends Battler  
{
	private static int id;
	
	
	//TODO look into Maps as a way to store trainers by their ID
	
	private Pmon[] party;
	
	/**
	 * 
	 */
	public Human() 
	{
		super();
		
	}

	/**
	 * @param name
	 * @param level
	 * @param stats
	 * @param move
	 */
	public Human(String name, int level, int[] stats, Move[] move)
	{
		super()
	}
	
	/**
	 * @return
	 */
	public static int getID()
	{
		return id;
	}
	
	
	/**
	 * @param party
	 */
	public static void setParty(Pmon[] party)
	{
		
	}
	
	
	
}

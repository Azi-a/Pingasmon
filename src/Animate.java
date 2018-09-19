
public class Animate {
	public static final double DEFAULT_WAIT=0.02;
	static int seconds;
	String[] text;
// scroll animation that scrolls text when printing, like it does in the game.
	//println/print version default wait
	public static void scroll()
	{
		seconds = (int) (DEFAULT_WAIT*1000);
		String theString = "Insert your message here! You can use Scroll methods to mimic println and print, and you can also use another constructor to specify the wait time in between each printed character! How cool is that?";
		for(int x = 0; x < theString.length(); x++)
		{
			System.out.print(theString.charAt(x));
			try        
				{
				    Thread.sleep(seconds);
				} 
			catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
		}
	}
	public static void scroll(String theString,int oneprintsln)
	{	seconds = (int) (DEFAULT_WAIT*1000);
	
		for(int x = 0; x < theString.length(); x++)
		{
			System.out.print(theString.charAt(x));
			try        
				{
				    Thread.sleep(seconds);
				} 
			catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
			
		
		}
		
		if(oneprintsln==1)
			System.out.println();
		@SuppressWarnings("unused")
		String derp;
		derp = System.console().readLine();
		
	}
	//println/print version custom wait
	public static void scroll(String theString, int oneprintsln, double secondsToWait)
	{
		seconds = (int) (DEFAULT_WAIT*1000);
		
		for(int x = 0; x < theString.length(); x++)
		{
			System.out.print(theString.charAt(x));
			try        
				{
				    Thread.sleep(seconds);
				} 
			catch(InterruptedException ex) 
				{
				    Thread.currentThread().interrupt();
				}
			
		
		}
		
		if(oneprintsln==1)
			System.out.println();
		
	}
	
//wait method which takes a double and waits for that many seconds.
	
	public static void wait(double secondsToWait)
	{
		seconds = (int) secondsToWait*1000;
		try        
			{
			    Thread.sleep(1000);
			} 
		catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
	}
	
//TODO screen clear effect which prints enough lines to render the entire screen blank.
//TODO effect which prints multiple lines in a simple and easy to type format.
	public static void multiLine(int newLines)
	{
		for(int x=0; x < newLines; x++)
		{
			System.out.println();
		}
	}
	
	
	
	
	
}

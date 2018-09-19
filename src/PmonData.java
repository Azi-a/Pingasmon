import java.io.PrintWriter;
import java.util.Scanner;

public abstract class PmonData 
{
	private PrintWriter out;
	private Scanner in;
	
	public void save()
	{
		
	}
	
	public Object load()
	{
		return new Pmon();
	}
	
	
}

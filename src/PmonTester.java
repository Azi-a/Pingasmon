import java.util.Properties;

public class PmonTester 
{

	public static void main(String[] args)
	{
	System.out.println(System.getProperty("os.name"));
	System.out.println(System.getProperty("os.version"));
	System.out.println(System.getProperty("os.arch"));
	System.out.println(System.getProperty("os.name"));
	System.out.println(System.getProperty("os.version"));
	System.out.println(System.getProperty("os.arch"));
	System.out.println(System.getProperty("user.home") + System.getProperty("os.separator"));
	Properties props = System.getProperties();
	props.list(System.out);
	System.getProperties();
	}

}

//  
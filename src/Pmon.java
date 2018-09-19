import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author euglena
 *
 */
public class Pmon 
{
	
	
	public Pmon() 
	{
		
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args)
	{	
		mainEngine();
	}
	
	public static void mainEngine()
	{	
		
		ArrayList<Human> HumanData = new ArrayList<Human>();
		ArrayList<Object> master = new ArrayList<Object>();
		master.add(HumanData);
		
		String[] option;
	
		boolean exit;
		String chunk;
		
		option = new String[10];
		exit = false;
		int count = 0;
		
		option[0]= "pending";
		Scanner scan = new Scanner(System.in);
		
		while(exit == false)
		{			
			System.out.println("Welcome to Pingasmon! \n What will you do?");
			System.out.println("1. Load...");
			System.out.println("2. Save...");
			System.out.println("3. Display...");
			System.out.println("0. Exit");
			chunk = scan.nextLine();
			Scanner comp = new Scanner(chunk);
			while(comp.hasNext())
			{
				option[count] = comp.next();
				count++;
			}
			
			comp.close();
			count=0;
			//1. Load
			while(option[0].equals("1") && exit == false)
			{
				System.out.println("  1. Load Human data...");
				System.out.println("  2. Load Type data");
				System.out.println("  0. Back");
				option[1]= scan.next();
				
				//1 3. Load Human data
				if (option[1].equals("1"))
				{
					boolean exists = false;
					
					int id;
					String namea;
					option[2]= "pending";
					while(!option[2].equals("2"))
					{
						System.out.println("Enter the human's ID");
						id = scan.nextInt();
						System.out.println("Enter the human's name");
						namea = scan.next();
						
						try 
						{
							
							
							for(int x = 0; x< HumanData.size();x++)
							{
								if(HumanData.get(x).name.equals(namea))
									exists=true;
							}
							if (exists==false)
							{
								HumanData.add(Human.LoadHuman(id, namea));
							}
							else if (exists==true)
							{
								System.out.println("This human is already loaded, dingus");
							}
							System.out.println("Load another human's data? \n 1. Yes \n 2. No");
							option[2]=scan.next();
						} 
							catch (FileNotFoundException e) 
							{
								e.printStackTrace();
								System.out.println("Invalid data was entered; data wasn't found.");
								option[2]="1";
								
							}
						
					}
				}
				//1 2. Load Type Data
				else if(option[1].equals("2"))
				{
				
					try 
					{
						Type.loadTypes();
					}
					catch (FileNotFoundException e) 
					{
						e.printStackTrace();
					}
				
				}
			
				
				//1 0. Back
				else if(option[1].equals("0"))
				{
					option[0]="Pending";
					option[1]="Pending";
					exit = true;
				}
			}
			//2. Save
			while(option[0].equals("2") && exit == false)
			{
				System.out.println("  1. Save Human data...");
				System.out.println("  0. Back");
				option[1]= scan.next();
				//2 1 .Save Human data
				if(option[1].equals("1"))
				{
					int indeex=-1;
					boolean exists=false;
					Human subject;
					int id;
					String namea;
				
					option[2]= "pending";
					while(!option[2].equals("2"))
					{
						namea =scan.next();
						for(int x = 0; x< HumanData.size();x++)
						{
							
							if(HumanData.get(x).name.equals(namea))
								exists=true;
							indeex=x;
						}
						if (exists==false)
						{
							System.out.println("This human isn't loaded, dingus");
						}
						else if (exists==true)
						{
								try {
									System.out.println("Attempting save...");
							Human.SaveHuman(HumanData.get(indeex));
								}
						
								catch(IOException e) 
								{
								e.printStackTrace();
								System.out.println("Invalid data was entered; data wasn't found.");
								option[2]="1";
							
								}
								catch (NullPointerException n)
								{
								System.out.println(n.getMessage());
								System.out.println("Critical error saving data, save aborted to protect "
										+ "current save data. \n "
										+ "Check: \n 1. LoadHuman \n 2. SaveHuman \n 3. structure of the save file");
								
								
								
								}
								option[2] = "1";
								
						}
					}
					
				}
				//2 0.Back
				else if(option[1].equals("0"))
				{
					exit = true;
				}
			}
			while(option[0].equals("3") && exit == false)
			{
				System.out.println("  1. Display Human Data...");
				System.out.println("  2. Display Type Matchups");
				System.out.println("  0. Back");
				option[1]= scan.next();
				//3 1 .Display Human data
				if(option[1].equals("1"))
				{
					
				}
				//3 2 .Display Type Data
				if(option[1].equals("2"))
				{
					Type.dispTypes();
				}
				//3 0. Display
				else if(option[1].equals("0"))
				{
					exit = true;
				}
			}
		exit = false;
		}
		scan.close();
	}
}



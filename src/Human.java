import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Human 
{
	//Constants
	public static final double dataversion=1.01;
	public static final int TEMP_PMON=6;
	
	
	//block A
	private double version;
	String name;
	int id;
	private String hiddenId;
	//
	//
	//block B
	double money;
	//
	//
	private int[][] cvs = new int[6][8];
	//block C
	private int[] nature = new int[2]; //in format of [hindered,boosted]
	private String gender;
	private int[] ivs = new int[6];
	//
	//
	//
	//block D
	private int starrank;			//star rank formula--- y = (x(.9)^{105})^{-1}
	private int[] basestats = new int[6];
	//block E
	Move[] moves = new Move[4];
	//
	//
	//
	//
	//block F
	int xp;
	int[] evs = new int[6];
	//block G
	//
	double currhp;
	//block h
	//
	//
	//
	//
	//
	//
	//
	//
	//block I
	private boolean isHacked;
	private int errorcount;
	//
	//
	//
	private String datagenType;	//How was this data generated?

	//block J
	int partyPmonamt;
	String[] partyPmon = new String[TEMP_PMON]; //needs to be changed later to mold to amt of Pmon in party
	//block K
	//
	//
	//block L
	//
	//
	//
	//
	//block M
	//
	//
	//block X
	//
	
	public Human()
	{
	}
	
	public Human(int a)
	{
		version=1.01;
		name="seed";
		id=414;
		hiddenId="aaaaaaaa";
		money=1.1;
		gender="NaN";
		for(int cat = 0;cat<7;cat++)							//cvs
		{
			for (int value=0;value<6;value++)
			{
				
					cvs[value][cat]=value + cat;
					cvs[value][7]+=cvs[value][cat];
			}																
		}
		nature[0]=5;
		nature[1]=4;
		
		starrank=0;
		for (int value=0;value<6;value++)
		{
			partyPmon[value] = "Pika" + String.valueOf((value*value*value*value)+10);
			basestats[value]=value*40;
			ivs[value]=value*4;
			evs[value]=value*130;
		}
		for (int x=0;x<4;x++)
		{
			moves[x]= new Move(this.name + String.valueOf(x),x);
			
			
		}
		xp=124021;
		
		isHacked=true;
		errorcount=0;
		datagenType="rogue";
		
		partyPmonamt=6;
		
		
	}
	
	
	
	
	
	//block 1(not in file)
	int lint;
	int[] trueivs = new int[6];
	int[] stats = new int[6];
	double level;
	
	/**Player Upload-Uploads a players data to the console.
	*@param ID the Id of the player in relation to the human.
	*@param name the name of the player to load must be in sentence case(ex. "Azi")
	*@return Human that has been compiled into the system as an object.
	*@throws FileNotFoundException knock knock its knuckles
	*/
	@SuppressWarnings("unused")
	public static Human LoadHuman(int id, String name) throws FileNotFoundException
	{
		//block SCAN
		Path path;
		Scanner s;
		//block INST
		Human soul;
		int debug = 0;	//System.out.println((debug+=1) + ": " + s.nextLine());
		
	 	
	System.out.println();
		path = Paths.get("/home/euglena/Pmon/Data/Humans/" + id + "-" + name +  "/" + id + "-" + name);
		
		soul = new Human();

		s = new Scanner(new BufferedReader(new FileReader((
				path.toString()))));
		
		//block a uploading
		s.next();							//A
			s.nextLine();
		if(s.hasNextDouble())
		{
			soul.version = s.nextDouble();
		}
		else s.next();
		
		soul.name=s.next();							//name
		
			s.nextLine();
		if(s.hasNextInt()==true)
		{
			soul.id=s.nextInt();							//id
		}
		else 
		{
			s.next();
		}
			s.nextLine();
		soul.hiddenId = s.next();		//hidden ID
			s.nextLine();
		s.next();					//appearance
			s.nextLine();
		s.next();							//location of origin
			s.nextLine();
		s.next();									//B
			s.nextLine();
		if(s.hasNextDouble()==true)
		{
			soul.money = s.nextDouble();					//$$$
		}
		else
		{
			s.next();
		}
			s.nextLine();
		s.next();												//unknown
		for(int cat = 0;cat<7;cat++)							//cvs
		{
			for (int value=0;value<6;value++)
			{
				if(s.hasNextInt()==true)
				{
					soul.cvs[value][cat]=s.nextInt();
					soul.cvs[value][7]+=soul.cvs[value][cat];
				}
				else
				{
					s.next();
				}
			}																
		}
			s.nextLine();
		s.nextLine(); //CV Totals(not read because they are already defined above)
		s.next();				//C

		
			soul.nature[0] = s.nextInt();
			soul.nature[1] = s.nextInt();
		
		soul.gender = s.next();		//gender
			s.nextLine(); //validated														
		
			for(int x=0; x<6;x++)
			{
				if(s.hasNextInt())
				{
					soul.ivs[x] = s.nextInt(); 	//ivs
				}
				else
				{
					s.next();
				}
			}
			 s.nextLine(); //end of ivs
			 s.next();	//advstart date										
			s.nextLine();	//end of advstartdate
			s.next();	//location of origin									
			s.nextLine();	//end of location of origin
			s.next();	//Block D header
			s.nextLine();	//end of Block D
			
		if(s.hasNextInt())
		{
			soul.starrank = s.nextInt();									//star rank
		}
		else 
		{
			s.next();
		}
		for(int a = 0 ; a < 6 ; a ++)
		{
			soul.basestats[a] = Integer.parseInt(s.next());
		}
																		//E
		
		for(int x =0; x<4;x++)	//Move loading(uggggghhh)
			{
				int pptemp = -1;
				String movename = s.next();
				if(s.hasNextInt())
				{
				 pptemp = s.nextInt();
				}
				else
				{
					s.next();
				}
				soul.moves[x] = new Move(movename,pptemp);
			}
			
		
		
		s.nextLine();
		s.nextLine();
		s.nextLine();
		s.nextLine();
		s.nextLine();
		s.nextLine();
		s.nextLine();
		s.nextLine();
		//block F uploading
		s.nextLine();		
		if(s.hasNextInt())
		{
			soul.xp = s.nextInt();		
			soul.level = Math.pow((double)soul.xp, (1.0/3.0));
			soul.lint = (int) Math.floor(soul.level);
		}
		else
		{
			s.next();
		}
		for(int x = 0;x<6;x++)
			if(s.hasNextInt())
				soul.evs[x]= s.nextInt();	
			else
				s.next();
		s.nextLine();			//end of evs
		//block G uploading
		
		s.nextLine();	//Block G marker
		s.next();	//status condition
			s.nextLine(); //end of status condition
		if(s.hasNextDouble() ==true)
			soul.currhp = s.nextDouble(); //reads doubles if they exist
		else
			s.next();	//skips whatever if there's no doubles
			s.nextLine();	// end of currhp
		//Block H uploading
		s.nextLine();	//Block H marker
		s.nextLine();	//unused
		s.nextLine();	//unused
		s.nextLine();	//unused
		s.nextLine();	//unused
		s.nextLine();	//unused
		s.nextLine();	//unused
		s.nextLine();	//unused
		//block I uploading
		s.next();	//block I marker
			s.nextLine(); //end of block marker
		if(s.hasNextBoolean())
		{
			soul.isHacked = s.nextBoolean();//hacked boolean
		}
		else
		{
			s.next();
		}
			s.nextLine();				//end of hacked boolean
		if(s.hasNextInt())
		{
			soul.errorcount = s.nextInt(); //errorcount
		}
		else
			s.next();	//skip if not found
				s.nextLine();  //end of errorcount
		s.nextLine();	//hackedstats
		s.nextLine();
		s.nextLine();
		soul.datagenType = s.nextLine();
	//	s.nextLine();				//}
		//block J uploading
		s.nextLine();				//Block J
	//	s.nextLine();				//{
		if(s.hasNextInt())
		{
		soul.partyPmonamt = s.nextInt();//number of pmon in party
		}
		else
		{
		s.next();
		}
		soul.partyPmon = new String[TEMP_PMON];
		for(int x = 0; x < 6 ; x++)
		{
			
			soul.partyPmon[x] = s.next();
			
		
		}
		while(!s.hasNext("END"))
			s.nextLine(); //basically skips to the end of the file
		
		soul.stats = soul.CalcHumStats(soul.lint, soul.basestats, 
				soul.cvs, soul.evs, soul.nature); //calculates le stats
				//finally done
		
		
		System.out.println(soul.name +" Lv. "  + soul.lint + 
				" Data successfully loaded!");
	

		s.close();
	
		return soul;	
	}


	public static Human CreateHuman() 
	{
	Human seed = new Human();
	Scanner scan = new Scanner(System.in);
	
	
		return null;
	}
	
	public static void DumpHumanData(int id, String name) 

	{
		//block SCAN
		Path path;
		Scanner s;
		//block INST
		Human soul;
		int debug = 0;	//System.out.println((debug+=1) + ": " + s.nextLine());
		
	 	
	System.out.println();
		path = Paths.get("/home/euglena/Pmon/Data/Humans/" + id + "-" + name +  "/" + id + "-" + name);
		
		soul = new Human();

		try 
		{
			s = new Scanner(new BufferedReader(new FileReader((
					path.toString()))));
			while(!s.hasNext("END"))
				System.out.println(s.nextLine());
			
			s.close();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public static void DumpHumanData(Human player)
	{
		
	}
		
		
		
		
		
		
		
		
		
		/**
		 * 
		 * @param id The ID of the human
		 * @param target The human object's data that will be saved
		 * @throws IOException 
		 */
	 public static void SaveHuman(Human target) throws IOException
	 {
		 
	 	//block SCAN
	 	Path path = null;
	 	BufferedWriter w;
	 	//block INST
	 	Human soul = target;
	 	

	 	System.out.println();
	 	
	 	try 
	 	{
	 	path = Paths.get("/home/euglena/Pmon/Data/Humans/" + soul.id + "-" +
	 	soul.name + "/" + soul.id + "-"+ soul.name);
	 		if(path.toFile().exists()==true)
	 		{
	 		System.out.println("There is already a saved file. This file will be deleted and "
	 				+ "recreated using "
	 				+ soul.name + "'s current save data.");
	 		
	 		String str = "y";
	 			if (str == "y")
	 			{
	 				path.toFile().delete();
	 				path.toFile().createNewFile();
	 			}
	 			else if (str == "n")
	 			{
	 				System.out.println("Terminated.");
	 				System.exit(0);
	 			}
	 		}
	 		else if(path.toFile().exists()==false)
	 		{
	 			path.toFile().createNewFile();
	 		}
	 	}
	 	finally {
	 	
	 	/**
	 	 * Whenever a save file already exists
	 	 * Asks for confirmation
	 	 * if confirmed, delete the old data and then create a new and blank one to write with
	 	 */
	 
	 		
	 	
	 	
	 	
	 	try {
	 		w = new BufferedWriter(new FileWriter((path.toString())));

	 	//block a uploading
	 	w.write("						A"); 				//Block A
	 	w.newLine();
	 	w.write(String.valueOf(soul.version));
	 	w.newLine();
	 	w.write(soul.name);				//name
	 	w.newLine();
	 	w.write(String.valueOf(soul.id));
	 	w.newLine();
	 	w.write(soul.hiddenId);
	 	w.newLine();
	 	w.write("appearance");
	 	w.newLine();
	 	w.write("location of origin");
	 	w.newLine();
	 	
	 	w.write("						B");	
	 	w.newLine();
	 	w.write(String.valueOf(soul.money));
	 	w.newLine();
	 	w.write("jyosen");
	 	w.newLine();
	 	for(int cat = 0;cat<8;cat++)//cvs
	 		{
	 		for (int value=0;value<6;value++)
	 			{
	 				w.write(String.valueOf(soul.cvs[value][cat]) + " ");
	 			}		
	 		w.newLine();
	 		}
	 	
	 	w.write("						C");
	 	w.newLine();
	 	for(int a = 0; a < 2 ; a++)
	 	{
	 		w.write(String.valueOf(soul.nature[a]) + " ");
	 	}
	 	w.newLine();
	 	w.write(soul.gender);
	 	w.newLine();
	 	for(int a = 0; a < 6 ; a++)
	 	{
	 	w.write(String.valueOf(soul.ivs[a]) + " ");
	 	}
	 	w.newLine();
	 	w.write("12_19_14");
	 	w.newLine();
	 	w.write("The_Voide");
	 	w.newLine();
	 	
	 	w.write("						D");
	 	w.newLine();
	 	w.write(String.valueOf(soul.starrank));
	 	w.newLine();
	 	for(int a : soul.basestats)
	 	{
	 		w.write(String.valueOf(a));
	 		w.write(" ");
	 	}
	 	w.newLine();
	 	
	 	w.write("						E");
	 	w.newLine();
	 	for(int a = 0; a<4; a++)
	 	{
	 //	w.write(soul.Moves[a].toString());
	 	w.write(soul.moves[a].name + " " + soul.moves[a].pp);
	 	w.newLine();
	 	}
	 	w.write("jyosen");
	 	w.newLine();
	 	w.write("jyosen");
	 	w.newLine();
	 	w.write("ultimate_move");
	 	w.newLine();
	 	w.write("jyosen");
	 	w.newLine();
	 	w.write("jyosen");
	 	w.newLine();
	 	w.write("jyosen");
	 	w.newLine();
	 	w.write("						F");
	 	w.newLine();
	 	w.write(String.valueOf(soul.xp));
	 	w.newLine();
	 	for(int x = 0; x < 6; x++)
	 	{
	 		w.write(soul.evs[x] + " ");
	 	}
	 		w.newLine();
	 	w.write("						G");
	 	w.newLine();
	 	w.write("jyosen");
	 	w.newLine();
	 	w.write(String.valueOf(soul.currhp));
	 	w.newLine();
	 	w.write("						H");
	 	w.newLine();
	 	for(int x = 0 ; x < 7; x++)
	 	{
	 		w.write("0");
	 		w.newLine();
	 	}
	 	w.write("						I");
	 	w.newLine();
	 	w.write(String.valueOf(soul.isHacked));	 
	 	w.newLine();
	 	w.write(String.valueOf(soul.errorcount));
	 	w.newLine();
	 	for(int x = 0 ; x < 3; x++)
	 	{
	 		w.write("jyosen");
	 		w.newLine();
	 	}
	 	if(soul.datagenType=="rogue")
	 	w.write("rogue");
	 		else
	 	w.write("Default (Saved using SaveHuman)");
	 	w.newLine();
	 	w.write("						J");
	 	w.newLine();
	 	w.write(TEMP_PMON);			//amt of party pmon
	 	w.newLine();
	 	for(int x = 0 ; x < TEMP_PMON; x++) 
	 	{
	 		w.write(soul.partyPmon[x] + " ");
	 	}
	 	w.newLine();
	 	
	 	w.write("						K");
	 	w.newLine();
	 	for(int x = 0; x < 2; x++)
	 	{
	 		w.write("jyosen");
	 		w.newLine();
	 	}
	 		
	 	w.write("						L");
	 	w.newLine();
	 	for(int x = 0; x < 4; x++)
	 	{
	 		w.write("jyosen");
	 		w.newLine();
	 	}
	 	
	 	w.write("						M");
	 	w.newLine();
		for(int x = 0; x < 2; x++)
		{
	 		w.write("jyosen");
	 		w.newLine();
	 	}
		w.write("						X");
		w.newLine();
		for(int x = 0; x < 4; x++)
		{
	 		w.write("jyosen");
	 		w.newLine();
	 	}
		w.newLine();
	 	w.write("						END");
	 	w.close();
	 		// TODO Auto-generated catch block
 	
	 	}
	 	finally
	 		{
	 		
	 		}
	 	System.out.println("Saved!");
	 	}
	 	
	 	
	 	}
	 	
	 
	 
	 
	 /**
	  * 
	  * @param lvl the level of the Human
	  * @param base base stats of the Human
	  * @param cvs1 Combined Values of the human
	  * @param evs1 Effort Values of the hooman
	  * @return stats[] a 6 element array with the stats calculated.
	  */
	public int[] CalcHumStats(int lvl, int[] base, int[][] cvs1, int[] evs1, int[] nature1)
 	   {	
			int stats1[] = new int[6];
			double[] ivs1 = new double[6];
			for(int a = 0; a <6 ; a ++)
			{
				ivs1[a] = ((double) cvs1[a][7]);
			}
			double hp1 = 0;
			double hp = 0;
			hp1 = (2*base[0] + ivs1[0] +((int)Math.floor(evs1[0]/4))) *lvl;
			stats1[0] = (int) Math.floor((hp1/100) + lvl + 10);
			
			return null;
	 	   
	 	   }

	
	
	
	
	
	
	
	
@Override
public String toString()
{
	Animate anim = new Animate();
	int counter = 0;
	
	System.out.println("Name: " + this.name);
	System.out.println("ID: " + this.id);
	System.out.println("Hidden ID: " + this.hiddenId);
	System.out.print("Money: " + this.money);
	
	for(int cat = 0;cat<7;cat++)
	{
		System.out.println();
		for (int value=0;value<6;value++)
		{
			System.out.print(this.cvs[value][cat] + " ");
		}						//still cvs
	}
	System.out.println();
	System.out.println("Gender: " + this.gender);
	System.out.print("Ivs: ");
	for(int x=0;x<6;x++)
	System.out.print(this.ivs[x] + " ");
	System.out.println();

	//Move.movegetter(hum);
	System.out.println("xp: " + this.xp);
	System.out.print("evs: ");
	for(int x=0;x<6;x++)
		System.out.print(this.evs[x] + " ");
	System.out.println();
	System.out.print("Base stats: ");
	for(int x=0;x<6;x++)
			System.out.print(this.basestats[x] + " ");
	System.out.println();
	System.out.println("Star Rank: " + this.starrank);
	System.out.printf("Lv. %.3f", this.level);
	System.out.println();
	System.out.println("Current HP: " + this.currhp);
	System.out.print("Stats: ");
//	System.out.print((int)Math.ceil(this.currhp) + "/" + this.stats[0] + " ");
//	for(int x=1;x<6;x++)
//		System.out.print(this.stats[x] + " ");
	System.out.println();
	System.out.println("Hacked: " + this.isHacked);
	System.out.println("Data creation method: " + this.datagenType);
	System.out.println(this.partyPmonamt + " Pmon are in their party");
	for (int x = 0; x < this.partyPmonamt; x++)
		
	System.out.println("Party pmon #" + (counter+=1) + ": " + this.partyPmon[x].toString());
		
return null;

}
	
	public Pingasmon toPingas()
	{
	Pingasmon pingers = new Pingasmon(this.name,this.level,this.lint,this.stats[0],this.currhp,
			this.stats[1],this.stats[2],this.stats[3],this.stats[4],this.stats[5],this.moves);
	return pingers;
	}

	



}


public class Pingasmon {
	
//Block Pingas-Values not found inside the actual file for Pmon for various reasons and are defined inside the constructor..
	int lint; //level as an integer, ROUNDED DOWN
	int xpGiven; //exp given when killed
	
//Block A-Permanent values of a Pmon-all of these are static
	//species ID
	static String OTName; //The name of the trainer who owns the Pmon. If null, it is wild.
	static int OTID;
	static int OTHiddenId;
	static int ID;
	static int hiddenID;
	static boolean isEventPmon;
	static String languageOfOrigin;
	static String dataGenerationType;
	
//Block B- Variables that only change/are changed from species changes(like evolution and forme changes)
	int evolutionStage;
	boolean hasalternateForms;
	String currentForm;
	String ability;
	String[] type = new String[3];
	
//Block C-Values modified after each kill
	String sex;
	int[] IVS = new int[6];
	String locationFound;
	int[] datefound = new int[3];
	String encounterType;
	//ball caught in
	
//Level D-Easily visible data of a Pmon.
	String name; //the NICKNAME of the pokemon--not the species!
	int starRank; 
	
//Block E-Battle related data
	Move[] Moves = new Move[4];
	//held item
	//special Moves
	Move[] ultimateMoves = new Move[2];
	Move[] bonusMoves = new Move[2];
	
//Block F-
	int xp; //Pmon's total xp
	
//Block G-
	//status condition
	double lvl; //level of the Pingasmon
	
	double hp;
	int maxhp;
	int atk;
	int def;
	int spatk;
	int spdef;
	int spe;
	int statTotal;
	int[] bbs;
//Block H-contest related values
	//coolness
	//beauty
	//cuteness
	//intelligence
	//toughness
	//overall
	
//Block I-Data for forcefully overriding/hacking pmon values
	boolean hacked;
	int errorCount;
	//hacked stats
	int hackedLvl;
	Move[] hackedMoves = new Move[10];

	
	
	
	//Level 6-In battle data of a Pmon.
	boolean getsXp;
	
	   public Pingasmon() 
	   {
		  
		  name = "Prototyke-ERROR_FORM";
		  OTName = null;
		  lvl = 50.725;
		  lint = 50;
		  xp = 50725;
		  this.type[0] = "Cosmic";
		  this.type[1] = null;
		  this.type[2] = null;
		  
		  
		  
		  lint =(int) Math.floor(lvl);
		  maxhp=2;
		  hp = 1;
		  atk = 1;
		  def = 1;
		  spatk = 1;
		  spdef = 1;
		  spe = 1;
		  statTotal = 6;
		  xpGiven = (int)Math.sqrt(lvl)*(statTotal);
		  int[] randomarraylol = {0,0,0,0,0,0};
		  
		  Moves[0] = new Move("ERROR-SHIFT", "status",1,randomarraylol, 0.0, 1,3, "Cosmic");
		  Moves[1] = new Move("ERROR-BEAM", "special",1,randomarraylol, 0.0, 1,3, "Cosmic");
		  Moves[2] = new Move("ERROR-SLASH", "physical",1,randomarraylol, 0.0, 1,3, "Cosmic");
		  Moves[3] = new Move("ERROR-BOOST", "stat",1,randomarraylol, 0.0, 1,3, "Cosmic");
		  
		  
		  getsXp = false;
	   }
	   
	   
	   
	   
	   
	   
	   
	   /*
	    * Destitute constructor-Version used for 1.0 update.
	    * Constructs a Pingasmon object, defining all needed variagbles.
	    * @param name
	    */
	   public Pingasmon(String name, double lvl,int lint, int maxhp, double currhp, int atk, int def,
			   int spatk, int spdef, int spe, Move[] Moves)
	   {
		   this.hp=currhp;
		   this.maxhp = maxhp;
		   this.name = name;
		   
	   }
	   
	   
	   public Pingasmon LoadPingasmon()
	   {
		   return null;
	   }
	   
	   public static Pingasmon SavePingasmon()
	   {
		   return null;
	   }
	   public int[] CalcStats(int lvl, int[] base, int[] ivs, int[] evs)
	   {
		   int[] stats = new int[6];
	   	for(int x =1;x<6;x++)
	   	{
	   		stats[x] = (((2*base[x]+ivs[x]+ ( (evs[x])/4) *lvl) /100) +10 + lvl);
	   		stats[0] = (((2*base[x]+ivs[x]+ ( (evs[x])/4) *lvl) /100) +5);
	   	}
		  
		return stats;
	   }
	   
	   
	   
	   
	   
	   public void damage(double damageBy)
	   {
		   double result = this.hp - damageBy;
		   //debug
		   System.out.println(this.hp + " currhp");
		   
		   
		   //pre-damage determinations
		   if (damageBy==0.0)
		   {
			   System.out.println(this.name + " was unaffected.");
		   }
		   else if(damageBy <0.0)
		   {
			   System.out.println(this.name + " recovered " + Math.abs(damageBy) + "HP!");
		   }
		   else if(damageBy > 0.0 )
		   {
			   System.out.println(this.name + " lost " + damageBy + "HP!");
		   }
		   
		   
		   //overheal check
		   if(result >= this.maxhp)
		   {
			   this.hp = this.maxhp;
			   double overHeal = Math.floor(Math.sqrt(result +(this.hp-this.maxhp)));
			   this.hp+= overHeal;
			   System.out.println(this.name + " overhealed an additional " + overHeal + " HP above their max HP!" );
		   }
		   
		   //final stage-death determination
		   if (result < 0.0)
		   {
			 this.hp -= result;
			 System.out.println(this.name + " has " + this.hp + " HP left.");
		   }
		   else if(result <= 0.0)
		   {
			   this.hp = 0.0;
			   System.out.println(this.name + " died!");
		   }
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   public static Human toHuman()
	   {
		   return null;
	   }
	   
	   @Override
	   public String toString()
	   {
		   
		   return this.name;
	   }
	   
	   
	   
	   
	   
	   
}

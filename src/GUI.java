import java.io.FileNotFoundException;

public class GUI {

	static String concat;
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		HpBar(0,100);
		 System.out.println(concat);
		 HpBar(98.1515,100);
		 System.out.println(concat);
		 HpBar(0.01,100);
		 System.out.println(concat);
	}
	
	public GUI()
	{
		
	}
		String horiz = "═";
		String[] blocks = {		"╔","╗","╚","╝",//0,1,2,3
											"═",//4
								"╠","╦","╣","╩",//5,6,7,8
										"╢","╟",//9,10
							"█","▓","▒","░","•"	//11,12
							};

		public static String HpBar(double HP, int maxHP)
		{
			concat="╠═╢";
			double cheeseburger = (HP/(double)maxHP) ;
			System.out.printf("%2f",cheeseburger);
			
			
			return concat;

		}
					
		
		
		
	/*	System.out.println(	"╔Swineferno═════════════════Lv. 1044══╗	\n" + 
							"╠HP:999,999,999/999,999,999═╦══status═╣	\n" + 
							"╠═╢█████████████████████▓░▒_╟═100.00%═╣	\n" + 
							"╠═Spe:240══╦═CSM|FIR|DRG═╦Alertsgohere╣	\n" + 
							"╚══════════╩═trainersname╩════════════╝	\n" + 
							"		");
							*/
				}

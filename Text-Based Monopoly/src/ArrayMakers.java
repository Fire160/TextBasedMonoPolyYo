import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMakers
	{
	public static ArrayList<Square> makeBoard()
		{
		ArrayList<Square> b = new ArrayList<Square>();
		b.add(new Go());
		b.add(new Color("Dagobah Swamp", 0, 0, 0, 0, 0, 0, 60));
		b.add(new Card("Rebel Card"));
		b.add(new Color("Dagobah Yoda's House", 0, 0, 0, 0, 0, 0, 60));
		b.add(new Tax("Docking Tax"));
		b.add(new Railroad("TIE Fighter"));
		b.add(new Color("Hoth Echo Base", 0, 0, 0, 0, 0, 0, 100));
		b.add(new Card("Empire Card"));
		b.add(new Color("Hoth Plains", 1 , 1, 1, 1, 1, 1, 100));
		b.add(new Color("Hoth North Ridge", 1, 1, 1, 1, 1, 1, 120));
		
		b.add(new Jail());
		b.add(new Color("Tatooine Lar's Homestand", 0, 0, 0, 0, 0, 0, 140));
		b.add(new Utility("Reactor Core"));
		b.add(new Color("Tatooine Mos Esiley", 0, 0, 0, 0, 0, 0, 140));
		b.add(new Color("Tatooine Jaba's Palace", 0, 0, 0, 0, 0, 0, 160));
		b.add(new Railroad("Millenium Falcon"));
		b.add(new Color("Yavin Four War Room", 0, 0, 0, 0, 0, 0, 180));
		b.add(new Card("Rebel Card"));
		b.add(new Color("Yavin Four Massassi Temple", 1 , 1, 1, 1, 1, 1, 180));
		b.add(new Color("Yavin Four Temple Throne Room", 1, 1, 1, 1, 1, 1, 200));
		
		b.add(new FreeParking());
		b.add(new Color("Cloud City Landing PLatform", 0, 0, 0, 0, 0, 0, 220));
		b.add(new Card("Empire Card"));
		b.add(new Color("Cloud City Carbon Freezing Chamber", 0, 0, 0, 0, 0, 0, 220));
		b.add(new Color("Cloud City Reactor Control Room", 0, 0, 0, 0, 0, 0, 240));
		b.add(new Railroad("X-Wing Fighter"));
		b.add(new Color("Death Star Landing Bay", 0, 0, 0, 0, 0, 0, 260));
		b.add(new Color("Death Star Throne Room", 0, 0, 0, 0, 0, 0, 260));
		b.add(new Utility("Moisture Farm"));
		b.add(new Color("Death Star Central Core", 1, 1, 1, 1, 1, 1, 280));
		
		b.add(new GoToJail());
		b.add(new Color("Endor Forest", 0, 0, 0, 0, 0, 0, 300));
		b.add(new Color("Endor Shield Gen", 0, 0, 0, 0, 0, 0, 300));
		b.add(new Card("Rebel Card"));
		b.add(new Color("Endor Ewok Village", 0, 0, 0, 0, 0, 0, 320));
		b.add(new Railroad("Star Destroyer"));
		b.add(new Card("Empire Card"));
		b.add(new Color("Corusant Monument Square", 0, 0, 0, 0, 0, 0, 350));
		b.add(new Tax("Bounty"));
		b.add(new Color("Corusant Emperial Palace", 1, 1, 1, 1, 1, 1, 400));
		return b;
		}
	public static ArrayList<Player> makePlayers()
		{
		Scanner stuff = new Scanner(System.in);
		System.out.println("How many players?");
		int pN = Runner.things.nextInt();
		ArrayList<Player> p = new ArrayList<Player>();
		for(int o = 0; o < pN; o++)
			{
			System.out.println("Player " + (o+1) + "'s name?");
			String name = stuff.nextLine();
			p.add(new Player(name));
			}
		return p;
		}
	}


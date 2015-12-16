import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class ArrayMakers
	{
	public static Scanner imports;
	public static ArrayList<Square> makeBoard() throws IOException
		{
		ArrayList<Square> b = new ArrayList<Square>();
		System.out.println("Pick your board!");
		System.out.println("1: Normal Monopoly");
		System.out.println("2: StarWars Monopoly");
		int choice = Runner.things.nextInt();
		if(choice == 2)
			{
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
			
			b.add(new Jail("Death Star Holding Cell"));
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
			}
		else
			{
			b.add(new Go());
	 		b.add(new Color("Mediteranean Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Card("Community Chest"));
	 		b.add(new Color("Baltic Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Tax("Income Tax"));
	 		b.add(new Railroad("Reading Railroad"));
	 		b.add(new Color("Oriental Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Card("Chance"));
	 		b.add(new Color("Vermont Ave.", 1 , 1, 1, 1, 1, 1, 0));
	 		b.add(new Color("Connecticut Ave.", 1, 1, 1, 1, 1, 1, 0));
	 		
	 		b.add(new Jail("Jail"));
			b.add(new Color("St. Charles Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Utility("Electric Company"));
			b.add(new Color("States Ave.", 0, 0, 0, 0, 0, 0, 0));
			b.add(new Color("Virginia Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Railroad("Pensylvania Railroad"));
			b.add(new Color("St. James Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Card("Community Chest"));
			b.add(new Color("Tennessee Ave.", 1 , 1, 1, 1, 1, 1, 0));
			b.add(new Color("New York Ave.", 1, 1, 1, 1, 1, 1, 0));
	 		
	 		b.add(new FreeParking());
			b.add(new Color("Kentucky Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Card("Chance"));
			b.add(new Color("Indiana Ave.", 0, 0, 0, 0, 0, 0, 0));
			b.add(new Color("Illinois Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Railroad("B & O Railroad"));
			b.add(new Color("Atlanic Ave.", 0, 0, 0, 0, 0, 0, 0));
			b.add(new Color("Ventner Ave.", 0, 0, 0, 0, 0, 0, 0));
			b.add(new Utility("Water Works"));
			b.add(new Color("Marvin Gardens", 1, 1, 1, 1, 1, 1, 0));
	 		
	 		b.add(new GoToJail());
			b.add(new Color("Pacific Ave.", 0, 0, 0, 0, 0, 0, 0));
			b.add(new Color("North Carolina Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Card("Community Chest"));
			b.add(new Color("Pennsylvania Ave.", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Railroad("Short Line"));
	 		b.add(new Card("Chance"));
	 		b.add(new Color("Park Place", 0, 0, 0, 0, 0, 0, 0));
	 		b.add(new Tax("Luxary Tax"));
	 		b.add(new Color("Boardwalk.", 1, 1, 1, 1, 1, 1, 0));
			}
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


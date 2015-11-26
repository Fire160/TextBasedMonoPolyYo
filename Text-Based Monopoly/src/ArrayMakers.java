import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMakers
	{
	public static ArrayList<Square> makeBoard()
		{
		ArrayList<Square> b = new ArrayList<Square>();
		b.add(new Go());
		b.add(new Color("Mediteranean Ave", 0, 0, 0, 0, 0, 0, 60));
		b.add(new Card("Community Chest"));
		b.add(new Color("Baltic Ave", 0, 0, 0, 0, 0, 0, 60));
		b.add(new Tax("Income Tax"));
		b.add(new Railroad("Reading Railroad"));
		b.add(new Color("Oriental Ave", 0, 0, 0, 0, 0, 0, 100));
		b.add(new Card("Chance"));
		b.add(new Color("Vermont Ave", 1 , 1, 1, 1, 1, 1, 100));
		b.add(new Color("Connecticut Ave", 1, 1, 1, 1, 1, 1, 120));
		
		b.add(new Jail());
		b.add(new Color("St. Charles Ave", 0, 0, 0, 0, 0, 0, 140));
		b.add(new Utility("Electric Company"));
		b.add(new Color("States Ave", 0, 0, 0, 0, 0, 0, 140));
		b.add(new Color("Virginia Ave", 0, 0, 0, 0, 0, 0, 160));
		b.add(new Railroad("Pensylvania Railroad"));
		b.add(new Color("St. James Ave", 0, 0, 0, 0, 0, 0, 180));
		b.add(new Card("Community Chest"));
		b.add(new Color("Tennessee Ave", 1 , 1, 1, 1, 1, 1, 180));
		b.add(new Color("New York Ave", 1, 1, 1, 1, 1, 1, 200));
		
		b.add(new FreeParking());
		b.add(new Color("Kentucky Ave", 0, 0, 0, 0, 0, 0, 220));
		b.add(new Card("Chance"));
		b.add(new Color("Indiana Ave", 0, 0, 0, 0, 0, 0, 220));
		b.add(new Color("Illinois Ave", 0, 0, 0, 0, 0, 0, 240));
		b.add(new Railroad("B & O Railroad"));
		b.add(new Color("Atlanic Ave", 0, 0, 0, 0, 0, 0, 260));
		b.add(new Color("Ventner Ave", 0, 0, 0, 0, 0, 0, 260));
		b.add(new Utility("Water Works"));
		b.add(new Color("Marvin Gardens", 1, 1, 1, 1, 1, 1, 280));
		
		b.add(new GoToJail());
		b.add(new Color("Pacific Ave", 0, 0, 0, 0, 0, 0, 300));
		b.add(new Color("North Carolina Ave", 0, 0, 0, 0, 0, 0, 300));
		b.add(new Card("Community Chest"));
		b.add(new Color("Pennsylvania Ave", 0, 0, 0, 0, 0, 0, 320));
		b.add(new Railroad("Short Line"));
		b.add(new Card("Chance"));
		b.add(new Color("Park Place", 0, 0, 0, 0, 0, 0, 350));
		b.add(new Tax("Luxary Tax"));
		b.add(new Color("Boardwalk", 1, 1, 1, 1, 1, 1, 400));
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


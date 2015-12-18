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
		Scanner boat;
		System.out.println("Pick your board!");
		System.out.println("1: Normal Monopoly");
		System.out.println("2: StarWars Monopoly");
		int choice = Runner.things.nextInt();
		if(choice == 2)
			{
			boat = new Scanner(new File("StarWars"));
			}
		else
			{
			boat = new Scanner(new File("StarWars"));
			}
		b.add(new Go());
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 60));
		b.add(new Card(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 60));
		b.add(new Tax(boat.nextLine()));
		b.add(new Railroad(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 100));
		b.add(new Card(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 1 , 1, 1, 1, 1, 1, 100));
		b.add(new Color(boat.nextLine(), 1, 1, 1, 1, 1, 1, 120));
		
		b.add(new Jail(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 140));
		b.add(new Utility(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 140));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 160));
		b.add(new Railroad(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 180));
		b.add(new Card(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 1 , 1, 1, 1, 1, 1, 180));
		b.add(new Color(boat.nextLine(), 1, 1, 1, 1, 1, 1, 200));
		
		b.add(new FreeParking());
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 220));
		b.add(new Card(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 220));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 240));
		b.add(new Railroad(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 260));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 260));
		b.add(new Utility(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 1, 1, 1, 1, 1, 1, 280));
		
		b.add(new GoToJail());
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 300));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 300));
		b.add(new Card(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 320));
		b.add(new Railroad(boat.nextLine()));
		b.add(new Card(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 0, 0, 0, 0, 0, 0, 350));
		b.add(new Tax(boat.nextLine()));
		b.add(new Color(boat.nextLine(), 1, 1, 1, 1, 1, 1, 400));
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


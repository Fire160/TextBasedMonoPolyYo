import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{

	public static void main(String[] args)
		{
		ArrayList<Square> board = makeBoard();
		ArrayList<Player> persons = new ArrayList<Player>();
		persons.add(new Player(500, "Michael"));
		Scanner things = new Scanner(System.in);
		boolean running = true;
		while(running == true)
			{
			Movement.playerMove(persons, 0, board);
			things.nextLine();
			}
		things.close();
		}
	public static ArrayList<Square> makeBoard()
		{
		ArrayList<Square> b = new ArrayList<Square>();
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
		
		b.add(new Jail());
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
		return b;
		}
	}

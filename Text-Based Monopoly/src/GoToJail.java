import java.util.ArrayList;

public class GoToJail extends Square
	{
	public GoToJail()
		{
		name = "Go To Jail";
		}
	public void runSquare(ArrayList<Player> players,int player, ArrayList<Square> b, int place)
		{
		System.out.println("You go directly to " + b.get(10).getName());
		players.get(player).setSpot(10);
		players.get(player).setJail(true);
		}
	}

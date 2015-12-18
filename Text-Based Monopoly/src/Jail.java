import java.util.ArrayList;

public class Jail extends Square
	{
	public Jail(String n)
		{
		name = n;
		}
	public void runSquare(ArrayList<Player> players,int player, ArrayList<Square> b, int place)
		{
		if(players.get(player).isJail() == true)
			{
			System.out.println("You are in " + b.get(10).getName() + " bro.");
			}
		if(players.get(player).isReverse() == true)
			{
			System.out.println("You are now unreversed!");
			players.get(player).setReverse(false);
			}
		else
			{
			System.out.println("You are now reversed!");
			players.get(player).setReverse(true);
			}
		}
	}

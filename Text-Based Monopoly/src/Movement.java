import java.util.ArrayList;

public class Movement
	{
	public static void playerMove(ArrayList<Player> players,int player, ArrayList<Square> b)
		{
		int dieO = (int) (Math.random()*6) + 1;
		int dieT = (int) (Math.random()*6) + 1;
		int roll = dieO + dieT;
		int doubles = 0;
		System.out.println("You rolled a " + dieO + " and a " + dieT + " for a total of " + roll);
		if(dieO == dieT)
			{
			doubles++;
			}
		for(int i = 0; i < roll; i++)
			{
			if(players.get(player).getSpot() >= b.size())
				{
				players.get(player).setSpot(0);
				}
			else
				{
				players.get(player).setSpot(players.get(player).getSpot() + 1);
				}
			}
		System.out.println("You landed on " + b.get(players.get(player).getSpot()).getName());
		}
	}

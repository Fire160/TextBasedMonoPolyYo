import java.util.ArrayList;

public class Movement
	{
	public static void playerMove(ArrayList<Player> players,int player, ArrayList<Square> b)
		{
		System.out.println("You are on "  + b.get(players.get(player).getSpot()).getName());
		int dieO = (int) (Math.random()*6) + 1;
		int dieT = (int) (Math.random()*6) + 1;
		int roll = dieO + dieT;
		//int doubles = 0;
		System.out.println("You rolled a " + dieO + " and a " + dieT + " for a total of " + roll);
		if(dieO == dieT)
			{
			//doubles++;
			}
		for(int i = 0; i < roll; i++)
			{
			if(players.get(player).getSpot() >= b.size() - 1)
				{
				players.get(player).setSpot(0);
				System.out.println("You passed GO and got $200!");
				players.get(player).setMoney(players.get(player).getMoney() + 200);
				System.out.println("You now have " + players.get(player).getMoney());
				}
			else
				{
				players.get(player).setSpot(players.get(player).getSpot() + 1);
				}
			}
		System.out.println("You landed on " + b.get(players.get(player).getSpot()).getName());
		}
	}

import java.util.ArrayList;

public class Movement
	{
	public static void playerMove(ArrayList<Player> players, ArrayList<Square> b)
		{
		int doubles = 0;
		for(int g =0; g < players.size(); g++)
			{
			System.out.println("+-----(PLAYER " + (g+1) + "'s TURN)-----+");
			System.out.println("Your current money: " + players.get(g).getMoney());
			System.out.println("Your current Properties: " + players.get(g).getProperties());
			System.out.println("You are on "  + b.get(players.get(g).getSpot()).getName() + ". Press anything to roll the dice!");
			Runner.things.nextLine();
			int dieO = (int) (Math.random()*6) + 1;
			int dieT = (int) (Math.random()*6) + 1;
			int roll = dieO + dieT;
			if(dieO == dieT)
				{doubles++;}
			if(doubles == 3)
				{
				System.out.println("Three doubles! Go To Jail!");
				}
			System.out.println("You rolled a " + dieO + " and a " + dieT + " for a total of " + roll);
			for(int i = 0; i < roll; i++)
				{
				if(players.get(g).getSpot() >= b.size() - 1)
					{
					players.get(g).setSpot(0);
					System.out.println("You passed GO and got $200!");
					players.get(g).setMoney(players.get(g).getMoney() + 200);
					System.out.println("You now have " + players.get(g).getMoney());
					}
				else
					{
					players.get(g).setSpot(players.get(g).getSpot() + 1);
					}
				}
			System.out.println("You landed on " + b.get(players.get(g).getSpot()).getName());
			b.get(players.get(g).getSpot()).runSquare(players, g, b, players.get(g).getSpot());
			Runner.things.nextLine();
			}
		}
	}

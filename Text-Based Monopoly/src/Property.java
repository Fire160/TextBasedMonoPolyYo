import java.util.ArrayList;

public abstract class Property extends Square
	{
	protected int price, mortgauge;
	protected boolean isOwned;
	protected int owner;
	public abstract void runProperty(ArrayList<Player> players,int player, ArrayList<Square> b);
	public void runSquare(ArrayList<Player> players,int player, ArrayList<Square> b, int place)
		{
		if(isOwned == true)
			{
			runProperty(players,player,b);
			}
		else
			{
			System.out.println("Would you like to buy " + name + " for " + price + "? (1 = yes, you have " + players.get(player).getMoney() + ")");
			int g = Runner.things.nextInt();
			if(g == 1 && players.get(player).getMoney() >= price)
				{
				System.out.println("Congrats you now own " + name + "!");
				players.get(player).setMoney(players.get(player).getMoney() - price);
				isOwned = true;
				players.get(player).addProperty(b.get(place));
				}
			else if(g == 1)
				{
				System.out.println("Sorry you don't have enough money! :(");
				}
			}
		}
	}

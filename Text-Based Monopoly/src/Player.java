import java.util.ArrayList;

public class Player
	{
	private int money, playerNum, spot;
	private String playerName;
	private ArrayList<Square> properties;
	private boolean isJail;
	public Player(String o)
		{
		money = 1500;
		playerName = o;
		spot = 0;
		properties = new ArrayList<Square>();
		isJail = false;
		}
	public int getSpot()
		{
		return spot;
		}
	public void setSpot(int spot)
		{
		this.spot = spot;
		}
	public String getPlayerName()
		{
		return playerName;
		}
	public void setPlayerName(String playerName)
		{
		this.playerName = playerName;
		}
	public int getPlayerNum()
		{
		return playerNum;
		}
	public void setPlayerNum(int playerNum)
		{
		this.playerNum = playerNum;
		}
	public int getMoney()
		{
		return money;
		}
	public void setMoney(int money)
		{
		this.money = money;
		}
	public int getProperties()
		{
		for(int i = 0; i < properties.size(); i++)
			{
			System.out.print(properties.get(i).getName() + ", ");
			}
		System.out.println();
		return properties.size();
		}
	public void setProperties(ArrayList<Square> properties)
		{
		this.properties = properties;
		}
	public void addProperty(Square temp)
		{
		properties.add(temp);
		}
	public boolean isJail()
		{
		return isJail;
		}
	public void setJail(boolean isJail)
		{
		this.isJail = isJail;
		}
	}

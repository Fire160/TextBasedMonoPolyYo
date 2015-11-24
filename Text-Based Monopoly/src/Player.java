import java.util.ArrayList;

public class Player
	{
	private int money, playerNum;
	private String playerName;
	private int spot;
	private ArrayList<Property> properties;
	public Player(int i, String o)
		{
		money = 500;
		playerNum = i;
		playerName = o;
		spot = 0;
		properties = new ArrayList<Property>();
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
	public ArrayList<Property> getProperties()
		{
		return properties;
		}
	public void setProperties(ArrayList<Property> properties)
		{
		this.properties = properties;
		}
	public void addProperty(Property temp)
		{
		properties.add(temp);
		}
	}

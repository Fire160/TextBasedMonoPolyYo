import java.util.ArrayList;

public class Player
	{
	private int money, playerNum, spot;
	private String playerName;
	private ArrayList<Square> properties;
	public Player(String o)
		{
		money = 1500;
		playerName = o;
		spot = 0;
		properties = new ArrayList<Square>();
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
	public ArrayList<Square> getProperties()
		{
		return properties;
		}
	public void setProperties(ArrayList<Square> properties)
		{
		this.properties = properties;
		}
	public void addProperty(Square temp)
		{
		properties.add(temp);
		}
	}

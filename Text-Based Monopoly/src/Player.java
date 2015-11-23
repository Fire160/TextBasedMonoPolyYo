public class Player
	{
	private int money, playerNum;
	private String playerName;
	private int spot;
	public int getSpot()
		{
			return spot;
		}
	public void setSpot(int spot)
		{
			this.spot = spot;
		}
	public Player(int i, String o)
		{
		money = 0;
		playerNum = i;
		playerName = o;
		setSpot(0);
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
	}

import java.util.ArrayList;

public class Color extends Property
	{
	private int baseRent;
	private int houseRent;
	private int diHouseRent;
	private int triHouseRent;
	private int quadHouseRent;
	private int HotelRent;
	private int numOfHouse;
	public Color(String n, int y, int u, int i, int o, int p, int a, int q)
		{
		setName(n);
		baseRent = y;
		houseRent = u;
		diHouseRent = i;
		triHouseRent = o;
		quadHouseRent = p;
		HotelRent = a;
		numOfHouse = 0;
		price = q;
		mortgauge = price / 2;
		isOwned = false;
		}
	public void runProperty(ArrayList<Player> players, int player, ArrayList<Square> b)
		{
		
		}
	public int getBaseRent()
		{
		return baseRent;
		}
	public void setBaseRent(int baseRent)
		{
		this.baseRent = baseRent;
		}
	public int getHouseRent()
		{
		return houseRent;
		}
	public void setHouseRent(int houseRent)
		{
		this.houseRent = houseRent;
		}
	public int getDiHouseRent()
		{
		return diHouseRent;
		}
	public void setDiHouseRent(int diHouseRent)
		{
		this.diHouseRent = diHouseRent;
		}
	public int getTriHouseRent()
		{
		return triHouseRent;
		}
	public void setTriHouseRent(int triHouseRent)
		{
		this.triHouseRent = triHouseRent;
		}
	public int getQuadHouseRent()
		{
		return quadHouseRent;
		}
	public void setQuadHouseRent(int quadHouseRent)
		{
		this.quadHouseRent = quadHouseRent;
		}
	public int getHotelRent()
		{
		return HotelRent;
		}
	public void setHotelRent(int hotelRent)
		{
		HotelRent = hotelRent;
		}
	public int getNumOfHouse()
		{
		return numOfHouse;
		}
	public void setNumOfHouse(int numOfHouse)
		{
		this.numOfHouse = numOfHouse;
		}
	}

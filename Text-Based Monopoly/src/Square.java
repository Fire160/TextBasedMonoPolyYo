import java.util.ArrayList;

public abstract class Square
	{
	protected String name;
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	protected abstract void runSquare(ArrayList<Player> players,int player, ArrayList<Square> b, int place);
	}

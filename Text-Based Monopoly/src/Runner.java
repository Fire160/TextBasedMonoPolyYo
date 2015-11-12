import java.util.ArrayList;

public class Runner
	{

	public static void main(String[] args)
		{
		ArrayList<Square> board = makeBoard();
		}
	public static ArrayList<Square> makeBoard()
		{
		ArrayList<Square> b = new ArrayList<Square>();
		b.add(new Go());
		return b;
		}
	}

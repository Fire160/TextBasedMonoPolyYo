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
		b.add(new ());
		b.add(new ());
		b.add(new ());
		b.add(new ());
		b.add(new ());
		b.add(new ());
		b.add(new ());
		b.add(new Color("Vermont Ave.", ));
		b.add(new Color("Connecticut Ave.", 1, 1, 1, 1, 1, 1, 1));
		return b;
		}
	}

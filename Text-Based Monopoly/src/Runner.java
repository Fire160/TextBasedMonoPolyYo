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
		b.add(new Railroad());
		b.add(new Color());
		b.add(new Card());
		b.add(new Color("Vermont Ave.", 1 ,1,1,1,1,1,1));
		b.add(new Color("Connecticut Ave.", 1, 1, 1, 1, 1, 1, 1));
		return b;
		}
	}

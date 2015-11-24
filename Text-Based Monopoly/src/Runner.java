import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
	public static Scanner things = new Scanner(System.in);
	public static void main(String[] args)
		{
		ArrayList<Square> board = ArrayMakers.makeBoard();
		ArrayList<Player> persons = ArrayMakers.makePlayers();
		boolean running = true;
		while(running == true)
			{
			Movement.playerMove(persons, board);
			}
		}
	}

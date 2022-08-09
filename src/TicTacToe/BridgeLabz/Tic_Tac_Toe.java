package TicTacToe.BridgeLabz;

public class Tic_Tac_Toe {
private static char board[]=new char[10];
	
	/*
	 * UC-1 Initialized Tic Tac Toe Game Board
	 */
	static void createBoard()
	{
		for(int i = 1; i <= 9; i++) 
		{
			board[i] = ' ';
		}
	}
	
	
	public static void main(String a[])
	{
		System.out.println("Welcome to Tic Tac Toe Game....!");
		
		createBoard();
	}

}

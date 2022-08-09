package TicTacToe.BridgeLabz;

import java.util.Scanner;

public class Tic_Tac_Toe {
	
	
	private static char board[]=new char[10];
	private static char player1;
	
	static Scanner sc=new Scanner(System.in);
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
	
	/*
	 * UC-2 Taking Player Symbol from user
	 */
	static void playerInput()
	{
		System.out.println("Player 1 Please Select the Symbol (X/O) :");
		player1 = sc.next().charAt(0);
		
		if ( player1 == 'X' || player1 == 'O') {
			System.out.println( "Player 1 Symbol :" +player1);	
		}
		else {
			System.out.println( "Invalid Symbol..Please Enter the Valid Symbol (X/O) :");
			playerInput();
		}
	}
	
	
	
	public static void main(String a[])
	{
		System.out.println("Welcome to Tic Tac Toe Game....!");
		
		createBoard();
		playerInput();
	}

}

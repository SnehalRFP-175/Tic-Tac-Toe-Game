package TicTacToe.BridgeLabz;

import java.util.Scanner;

public class Tic_Tac_Toe {
	
	final static Character[][] board = {
			{'_','|','_','|','_'},
			{'_','|','_','|','_'},
			{' ','|',' ','|',' '},
			};
	private static char player1;
	
	static Scanner sc=new Scanner(System.in);
	/*
	 * UC-1 Initialized Tic Tac Toe Game Board
	 */
	public static void createBoard()
	{
		for(Character r[]:board) 
		{
			for(Character c:r)
			{
				System.out.print(c);
			}
			System.out.println( );	       	
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
	
	/*
	 * UC-3 showBoard Method to display current board
	 */
	 static void showBoard()
	 {
		 createBoard();
	 }
	
	 
	public static void main(String a[])
	{
		System.out.println("Welcome to Tic Tac Toe Game....!");
		
		createBoard();
		playerInput();
		showBoard();
	}

}

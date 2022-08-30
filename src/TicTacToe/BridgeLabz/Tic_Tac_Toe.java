package TicTacToe.BridgeLabz;

import java.util.Random;
import java.util.Scanner;

public class Tic_Tac_Toe {
	
	final static Character[][] board = {
			{'_','|','_','|','_'},
			{'_','|','_','|','_'},
			{' ','|',' ','|',' '},
			};
	private static char playerSymbol;

	static Integer syspos=0;
	static Integer playerpos=0;
	
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
		playerSymbol = sc.next().charAt(0);
		
		if ( playerSymbol == 'X' || playerSymbol == 'O') {
			System.out.println( "Player 1 Symbol :" +playerSymbol);	
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
	
	 /*
	  * UC-4 playerMove method for Player to select the index from 1-9 
	  */
	 static void playerMove()
	 {
		 	System.out.println("Enter Your position 1-9");
			Scanner sc=new Scanner(System.in);
			playerpos=sc.nextInt(10);
	 
			System.out.println("Position->"+playerpos);
		
			
			switch(playerpos)
			{
			case 1:
				board[0][0]=playerSymbol;
				break;
			case 2:
				board[0][2]=playerSymbol;
				break;
			case 3:
				board[0][4]=playerSymbol;
				break;
			case 4:
				board[1][1]=playerSymbol;
				break;
			case 5:
				board[1][3]=playerSymbol;
				break;
			case 6:
				board[1][4]=playerSymbol;
				break;
			case 7:
				board[2][1]=playerSymbol;
				break;
			case 8:
				board[2][2]=playerSymbol;
				break;
			case 9:
				board[2][4]=playerSymbol;
				break;
			
		}
			
			
			showBoard();
	}

	 
	 public static void computerMove()
		{
			
			System.out.println("Computer Your position 1-9");
			Random r=new Random();
			syspos=r.nextInt(10);
			

			System.out.println("Position->"+syspos);	
			
			if(syspos!=0)
			{
			switch(syspos)
			{
			case 1:
				if(playerSymbol=='X')
				board[0][0]='O';
				else
				board[0][0]='X';
				break;
			case 2:
				if(playerSymbol=='X')
					board[0][2]='O';
					else
					board[0][2]='X';
					break;
			case 3:
				if(playerSymbol=='X')
					board[0][4]='O';
					else
					board[0][4]='X';
					break;
			case 4:
				if(playerSymbol=='X')
					board[1][0]='O';
					else
					board[1][0]='X';
					break;
			case 5:
				if(playerSymbol=='X')
					board[1][3]='O';
					else
					board[1][3]='X';
					break;
			case 6:
				if(playerSymbol=='X')
					board[1][4]='O';
					else
					board[1][4]='X';
					break;
			case 7:
				if(playerSymbol=='X')
					board[2][1]='O';
					else
					board[2][1]='X';
					break;
			case 8:
				if(playerSymbol=='X')
					board[2][2]='O';
					else
					board[2][2]='X';
					break;
			case 9:
				if(playerSymbol=='X')
					board[2][4]='O';
					else
					board[2][4]='X';
					break;
		}
			
			showBoard();
			
			}
			else
				System.out.println("Position must be between 1-9");
		}
		 
	 
	public static void main(String a[])
	{
		System.out.println("Welcome to Tic Tac Toe Game....!");
		
		createBoard();
		playerInput();
		showBoard();
		computerMove();
		playerMove();
		
	}

}

// CMP128-80227: COMPUTER SCIENCE I
// PROFESSOR TIRRITO
// COUNTY COLLEGE OF MORRIS
// LAB: TIC-TAC-TOE
// CREATED BY: MICHAEL SIDARAS-TIRRITO
// LAST DATE MODIFIED: 10/02/2015

import java.util.Scanner;

public class TicTacToe
{
	public static void main(String [] args)
	{
		// DECLARING AND INITIALIZING VARIABLES
		byte currentPlayer = 1;
		boolean isWon, isTurnOver;
		isWon=isTurnOver=false;
		char space1, space2, space3, space4, space5, space6, space7, space8, space9, player1sym, player2sym;
		space1=space2=space3=space4=space5=space6=space7=space8=space9=' ';
		player1sym = 'X';
		player2sym = 'O';
		byte turn,  choice, winTextTest;
		turn=choice=winTextTest=0;
		String player1name, player2name;
		player1name=player2name="";
		Scanner newInput = new Scanner(System.in);


		// DISPLAYING GAME BANNER
		System.out.println("************************************************************");
		System.out.println("*             Welcome to the Tic-Tac-Toe Game              *");
		System.out.println("*           -----------------------------------            *");
		System.out.println("************************************************************");
		System.out.println("");

		// GETTING PLAYER NAMES
		System.out.println("Player 1: Please Enter Your Name");
		player1name = newInput.nextLine();
		System.out.println("Player 2: Please Enter Your Name");
		player2name = newInput.nextLine();
		System.out.println("");

		// DISPLAYING GAME BOARD
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
		System.out.println("__1|__2|__3");
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
		System.out.println("__4|__5|__6");
		System.out.println("   |   |   ");
		System.out.println("   |   |   ");
		System.out.println("  7|  8|  9");
		System.out.println("");
		System.out.println("");

		System.out.println(player1name + ", Please choose a space (1-9)");
		choice = newInput.nextByte();

		// EVALUATING CHOSEN SPACE
		if (choice == 1)
		{
			if (space1 == 'X' || space1 == 'O')
			{

			}
			else
			{
				if (currentPlayer == 1)
				{
					space1 = player1sym;
					isTurnOver = true;
				}
				else
				{
					space1 = player2sym;
					isTurnOver = true;
				}
			}// closes empty space analysis
		}// closes path1

		else if (choice == 2)
		{
			if (space2 == 'X' || space2 == 'O')
			{

			}
			else
			{
				if (currentPlayer == 1)
				{
					space2 = player1sym;
					isTurnOver = true;
				}
				else
				{
					space2 = player2sym;
					isTurnOver = true;
				}
			}// closes empty space analysis
		}// closes path2

		else if (choice == 3)
		{
			if (space3 == 'X' || space3 == 'O')
			{

			}
			else
			{
				if (currentPlayer == 1)
				{
					space3 = player1sym;
					isTurnOver = true;
				}
				else
				{
					space3 = player2sym;
					isTurnOver = true;
				}
			}// closes empty space analysis
		}// closes path3

		else if (choice == 4)
		{
			if (space4 == 'X' || space4 == 'O')
			{

			}
			else
			{
				if (currentPlayer == 1)
				{
					space4 = player1sym;
					isTurnOver = true;
				}
				else
				{
					space4 = player2sym;
					isTurnOver = true;
				}
			}// closes empty space analysis
		}// closes path4

		else if (choice == 5)
		{
			if (space5 == 'X' || space5 == 'O')
			{

			}
			else
			{
				if (currentPlayer == 1)
				{
					space5 = player1sym;
					isTurnOver = true;
				}
				else
				{
					space5 = player2sym;
					isTurnOver = true;
				}
			}// closes empty space analysis
		}// closes path1

		else if (choice == 6)
		{
			if (space6 == 'X' || space6 == 'O')
			{

			}
			else
			{
				if (currentPlayer == 1)
				{
					space6 = player1sym;
					isTurnOver = true;
				}
				else
				{
					space6 = player2sym;
					isTurnOver = true;
				}
			}// closes empty space analysis
		}// closes path6

		else if (choice == 7)
		{
			if (space7 == 'X' || space7 == 'O')
			{

			}
			else
			{
				if (currentPlayer == 1)
				{
					space7 = player1sym;
					isTurnOver = true;
				}
				else
				{
					space7 = player2sym;
					isTurnOver = true;
				}
			}// closes empty space analysis
		}// closes path1

		else if (choice == 8)
		{
			if (space8 == 'X' || space8 == 'O')
			{

			}
			else
			{
				if (currentPlayer == 1)
				{
					space8 = player1sym;
					isTurnOver = true;
				}
				else
				{
					space8 = player2sym;
					isTurnOver = true;
				}
			}// closes empty space analysis
		}// closes path8

		else if (choice == 9)
		{
			if (space9 == 'X' || space9 == 'O')
			{

			}
			else
			{
				if (currentPlayer == 1)
				{
					space9 = player1sym;
					isTurnOver = true;
				}
				else
				{
					space9 = player2sym;
					isTurnOver = true;
				}
			}// closes empty space analysis
		}// closes path9
		else
		{
			System.out.println("You have made an invalid selection! Please Try Again!");
		}// closes entire else-if structure

		// RE-DISPLAYING GAME BOARD
		System.out.println("   |   |   ");
		System.out.println(" " + space1 + " | " + space2 + " | " + space3 + " ");
		System.out.println("__1|__2|__3");
		System.out.println("   |   |   ");
		System.out.println(" " + space4 + " | " + space5 + " | " + space6 + " ");
		System.out.println("__4|__5|__6");
		System.out.println("   |   |   ");
		System.out.println(" " + space7 + " | " + space8 + " | " + space9 + " ");
		System.out.println("  7|  8|  9");
		System.out.println("");
		System.out.println("");

		if (isTurnOver)
		{
			turn++; // turn = turn +1; could be used instead
		}


		// TESTING TO SEE IF THERE IS A WIN
		if (turn >=5)
		{
			winTextTest++;
			switch (winTextTest)
			{
				case 1:
					break;

				case 2:
					break;

				case 3:
					break;

				case 4:
					break;

				case 5:
					break;

				case 6:
					break;

				case 7:
					break;

				case 8:
					break;

				default:
					break;
			}// end switch winText
		}// end if turn >=5


	}
}
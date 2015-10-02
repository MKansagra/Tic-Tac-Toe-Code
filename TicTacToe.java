import java.util.Scanner;

	public class TicTacToe
		{

		public static void main(String [] args)
		{

//Declaring and Initializing Variables
	byte curentPlayer = 1;
	boolean isWon, isTurnOver;
	isWon=isTurnOver=false;
	char space1, space2, space3, space4, space5, space6, space7, space8, space9;
	space1=space2=space3=space4=space5=space6=space7=space8=space9=' ';
	player1sym = 'X';
	player2sym = "O";
	byte turn, choice, winTest;
	turn=choice=winTest=0;
	String player1name, player2name;
	Scanner newInput = new Scanner(System.in);

//Displaying Game Board

	System.out.println("************************************************************");
	System.out.println("*               WELCOME TO THE TIC=TAC-TOE GAME            *");
	System.out.println("*               -------------------------------            *");
	System.out.println("************************************************************");
	System.out.println("");

//Getting Player Names
	System.out.println("Player 1: Please Enter Your Name");

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
		//===============================================================
		//Player makes a choice
		System.out.println(player1name + ", Please Choose Your Space(1-9)");
		choice=newInput.nextByte();
		if (choice == 1)
		{
			if (space1 == ' ')
			{
				if(currentPlayer == 1)
				{
					space1 = Player1sym;
					isTurnOver = true;
				}
				else
				{
					space1 = player2sym;
					isTurnOver = true;
				}//Closes Current Player Nested If
			}//Closes Current Space Nested If
		}//Closes Choice Analysis 1

		//===============================================================
				if (choice == 2)
				{
					if (space2 == ' ')
					{
						if(currentPlayer == 1)
						{
							space2 = Player1sym;
							isTurnOver = true;
						}
						else
						{
							space2 = player2sym;
							isTurnOver = true;
						}//Closes Current Player Nested If
					}//Closes Current Space Nested If
		}//Closes Choice Analysis 2

		//===============================================================
				if (choice == 3)
				{
					if (space3 == ' ')
					{
						if(currentPlayer == 1)
						{
							space3 = Player1sym;
							isTurnOver = true;
						}
						else
						{
							space3 = player2sym;
							isTurnOver = true;
						}//Closes Current Player Nested If
					}//Closes Current Space Nested If
		}//Closes Choice Analysis 3


				//===============================================================
						if (choice == 4)
						{
							if (space4 == ' ')
							{
								if(currentPlayer == 1)
								{
									space4 = Player1sym;
									isTurnOver = true;
								}
								else
								{
									space4 = player2sym;
									isTurnOver = true;
								}//Closes Current Player Nested If
							}//Closes Current Space Nested If
				}//Closes Choice Analysis 4


						//===============================================================
								if (choice == 5)
								{
									if (space5 == ' ')
									{
										if(currentPlayer == 1)
										{
											space5 = Player1sym;
											isTurnOver = true;
										}
										else
										{
											space5 = player2sym;
											isTurnOver = true;
										}//Closes Current Player Nested If
									}//Closes Current Space Nested If
						}//Closes Choice Analysis 5


		//===============================================================
				if (choice == 6)
				{
					if (space6 == ' ')
					{
						if(currentPlayer == 1)
						{
							space6 = Player1sym;
							isTurnOver = true;
						}
						else
						{
							space6 = player2sym;
							isTurnOver = true;
						}//Closes Current Player Nested If
					}//Closes Current Space Nested If
		}//Closes Choice Analysis 6


		//===============================================================
				if (choice == 7)
				{
					if (space1 == ' ')
					{
						if(currentPlayer == 1)
						{
							space7 = Player1sym;
							isTurnOver = true;
						}
						else
						{
							space7 = player2sym;
							isTurnOver = true;
						}//Closes Current Player Nested If
					}//Closes Current Space Nested If
		}//Closes Choice Analysis 7


		//===============================================================
				if (choice == 8)
				{
					if (space8 == ' ')
					{
						if(currentPlayer == 1)
						{
							space8 = Player1sym;
							isTurnOver = true;
						}
						else
						{
							space8 = player2sym;
							isTurnOver = true;
						}//Closes Current Player Nested If
					}//Closes Current Space Nested If
		}//Closes Choice Analysis 8


		//===============================================================
				if (choice == 9)
				{
					if (space9 == ' ')
					{
						if(currentPlayer == 1)
						{
							space9 = Player1sym;
							isTurnOver = true;
						}
						else
						{
							space9 = player2sym;
							isTurnOver = true;
						}//Closes Current Player Nested If
					}//Closes Current Space Nested If
		}//Closes Choice Analysis 9







	}
}

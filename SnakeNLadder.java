package snakeNLadder;

import java.util.Random;

public class SnakeNLadder {
	
Random random = new Random();
	
	int WIN_POSITION=100;
	
	public static void main (String[]args) {
		
		SnakeNLadder sn = new SnakeNLadder();
		
		sn.Start_Game_Position();
	}
	
	public void Start_Game_Position() {
		int player1Position = 0, diceValue=0, player1DiceCount=0;
		int player2Position = 0, player2DiceCount=0;
		int currentPlayer = -1;
		while(true) {
			diceValue = DiceRoll();
			
			if(currentPlayer == -1) {
			player1DiceCount++;
			player1Position = PlayerPosition(player1DiceCount, diceValue);
			System.out.println("Player position: "+player1Position);
			if(player1Position == WIN_POSITION) {
				System.out.println("Player wins the game");
				System.out.println("Die rolled: "+player1DiceCount);
				break;
			}
		}
			
			else {
				player2DiceCount++;
				player2Position =PlayerPosition(player2DiceCount, diceValue);
				System.out.println("Player2 position: "+player2Position);
				if(player2Position == WIN_POSITION) {
					System.out.println("Player2 wins the game");
					System.out.println("Die rolled: "+player2DiceCount);
					break;
				}
			}
				currentPlayer = -(currentPlayer);
		}
	}
	
public int DiceRoll() {
	
	int ran=1+random.nextInt(6);
	
	return ran;
}
			
	public int PlayerPosition(int player, int diceValue) {
		if(player < WIN_POSITION) {
		int option;
		option= random.nextInt(3);
		switch(option) {
		case 0:
			System.out.println("No play");
			break;
		case 1:
			System.out.println("Ladder");
			player = player + diceValue;
			break;
		default:
			System.out.println("Snake");
			player = player - diceValue;
			break;
		
		}
		if (player < 0) {
			player =0;
			}
		
		}
		else {
			player = player - diceValue;
			
		}
		
		return player;

		}
	}


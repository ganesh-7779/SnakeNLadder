package snakeNLadder;

import java.util.Random;

public class SnakeNLadder {
	
	public static void main (String[]args) {
		
		SnakeNLadder sn = new SnakeNLadder();
		
		sn.Start_Game_Position();
	}
	
	public void Start_Game_Position() {
		int playerPosition = 0, diceValue=0;
		int playerDiceCount=0;
		
		while(true) {
			diceValue = DiceRoll();
			playerDiceCount++;
			playerPosition = PlayerPosition(playerDiceCount, diceValue);
			System.out.println("Player position: "+playerPosition);
			if(playerPosition == WIN_POSITION) {
				System.out.println("Player wins the game");
				System.out.println("Die rolled: "+playerDiceCount);
				break;
			}
		}
	}
	
	
	
	
	Random random = new Random();
	int player = 0;
	int WIN_POSITION=100;
	
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


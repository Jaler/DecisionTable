package Jaler.RockPaperScissorsGame;

import org.junit.Before;
import org.junit.Test;


public class PlayerGameTest {
	
	PlayGame playGame = null;
	@Before
	public void init(){
		playGame = new PlayGame(new Player("player1"), new Player("player2"));
	}
	
	@Test
	public void playTwoRoundResultInRandomResult(){
		playGame.loadDecisionTable("rule");
		String result = playGame.play(10);
		System.out.println(result);
		
	}
}

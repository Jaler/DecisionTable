package Jaler.RockPaperScissorsGame;

import java.util.Random;

import org.springframework.beans.factory.config.YamlProcessor.MatchStatus;

import com.technoseals.dt4j.model.DecisionTable;
import com.technoseals.dt4j.model.DecisionTableContext;

/**
 * Hello world!
 *
 */
public class PlayGame 
{
	Player player1;
	Player player2;
	DecisionTable decisionTable = null;
    public PlayGame(Player player1, Player player2){
    	this.player1 = player1;
    	this.player2 = player2;
    }
    
    public void loadDecisionTable(String dir){
    	decisionTable = new DecisionTable(dir);
    }
    
    public String play(int round){
    	if(round < 0 ) return "at least play 1 round";	
    	playerReset();
    	DecisionTableContext decisionTableContext = new DecisionTableContext();
    	decisionTableContext.addVariable("player1", player1);
    	decisionTableContext.addVariable("player2", player2);
    	Random random = new Random();
    	for(int i = 0; i < round; i++){
    		player1.setAction(Action.getByIndex(random.nextInt(3)));
    		player2.setAction(Action.getByIndex(random.nextInt(3)));
    		decisionTable.execute(decisionTableContext);
    	}
    	return getResult();
    }

    private String getResult(){
    	return player1.toString() + player2.toString();
    }
	private void playerReset() {
		player1.reset();
		player2.reset();
	}
}

package Jaler.RockPaperScissorsGame;

public class Player {
	
	private int score = 0;
	private Action action = null;
	private String name = null;
	
	public Player(){
		
	}
	
	public Player(String name){
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public Action getAction() {
		return action;
	}
	
	public void setAction(Action action) {
		this.action = action;
	}	
	
	public void addScore(int value){
		score += value;
	}
	
	public void reset(){
		score = 0;
	}
	public String toString(){
		return name + "'s total score is " + score + System.lineSeparator();
	}
}

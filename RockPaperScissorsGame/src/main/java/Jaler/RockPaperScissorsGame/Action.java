package Jaler.RockPaperScissorsGame;

public enum Action {
	Rock, Paper, Scissors;
	
	public static Action getByIndex(int index){
		switch (index) {
		case 0:
			return Action.Rock;
		case 1:
			return Action.Paper;
		case 2:
			return Action.Scissors;

		default:
			return Action.Rock;
		}
	}
}

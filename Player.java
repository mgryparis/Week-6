package week06_Coding_Assignment;

public class Player {
	public Hand hand;
	public int score;
	public String name;
	
	public Player(String playerName)	{
		Hand hand = new Hand(playerName);
		this.hand = hand;
		this.name=playerName;
		this.score=0;
	}
	
	public void incrementScore()	{
		score++;
	}
}

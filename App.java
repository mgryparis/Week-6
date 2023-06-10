package week06_Coding_Assignment;
import java.util.concurrent.TimeUnit;

public class App	{

	//	2	Create a class called App with a main method.
//		a.	Instantiate a Deck and two Players, call the shuffle method on the deck.
//		b.	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration 
//			using the Deck you instantiated.
//		c.	Using a traditional for loop, iterate 26 times and call the flip method for each player.
//		d.	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on 
//			the player whose card has the higher value.
//		e.	After the loop, compare the final score from each player. 
//		f.	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score
//			is higher or if they are both the same.


	public static void main(String[] args) throws InterruptedException {

		//	Setup the game
		System.out.println("\n__  WAR!  (The Card Game Sim)  ____________________________");
		System.out.println("This sim deals out 26 cards to 2 players and then automatically plays the War card game.");
		TimeUnit.SECONDS.sleep(4);
	
		//  Instantiate a new Deck and Shuffle
		Deck warDeck = new Deck("warDeck");
		System.out.println("\n__  Unwrapping a new Deck...___________________________________");
		TimeUnit.SECONDS.sleep(1);
		warDeck.describe();
		TimeUnit.SECONDS.sleep(4);
		System.out.println("\nShuffle...");
		warDeck.shuffle2();
		TimeUnit.MILLISECONDS.sleep(300);
		System.out.println("Shuffle...");
		warDeck.shuffle2();
		TimeUnit.MILLISECONDS.sleep(300);
		System.out.println("Shuffle...");
		warDeck.shuffle2();
		TimeUnit.MILLISECONDS.sleep(300);
		System.out.println("\n__  Shuffled Deck: ____________________________________________");
		TimeUnit.SECONDS.sleep(1);
		warDeck.describe();
		TimeUnit.SECONDS.sleep(4);
		
		//	Instantiate 2 players
		System.out.println("\n__  Instantiating our 2 War players  __________________________");
		TimeUnit.SECONDS.sleep(2);
		Player player1 = new Player ("Player 1");
		Player player2 = new Player ("Player 2");
		player1.hand.describe();
		player2.hand.describe();
		
		//	Deal out the game
		System.out.println("\n__  Deal out the hands  _______________________________________");
		TimeUnit.SECONDS.sleep(2);
		for (int i=0; i<52; i++)	{
			if (i%2==0)	{
				player1.hand.addCard(warDeck.drawACard());
			}	else	{
				player2.hand.addCard(warDeck.drawACard());
			}
		}
		player1.hand.describe();
		TimeUnit.SECONDS.sleep(3);
		player2.hand.describe();
		TimeUnit.SECONDS.sleep(3);
		
		//	Play the game
		System.out.println(" \n__  Play the Game  ____________________________________________\n");
		TimeUnit.SECONDS.sleep(2);
		int c1val = 0;
		int c2val = 0;
		int diff = 0;
		for (int i = 1; i < 27; i++) {
			System.out.println("\n_[TURN "+i+"/26]_____________________");
			Card card1 = player1.hand.flip();
			Card card2 = player2.hand.flip();
			System.out.print("Player 1 Flip:  ");
			card1.describe();
			System.out.print("\nPlayer 2 Flip:  ");
			card2.describe();
			c1val = card1.value - 1;
			c2val = card2.value - 1;
			diff = c1val - c2val;
			if (diff < 0) {
				System.out.println("\nTurn Winner:    Player 2");
				player2.incrementScore();
			} else if (diff > 0) {
				System.out.println("\nTurn Winner:    Player 1");
				player1.incrementScore();
			} else {
				System.out.println("\nTurn Winner:    none/tie");
			}
			System.out.println("Score (P1:P2):  "+player1.score + " : " + player2.score);
			TimeUnit.SECONDS.sleep(1);
		}
		System.out.println("\n__  Game Over  __________________________________________________\n");
		player1.hand.describe();
		player2.hand.describe();

		if (player2.score>player1.score) {
			System.out.println("\nWinner:  Player 2");
		} else if (player1.score>player2.score) {
			System.out.println("\nWinner:  Player 1");
		} else {
			System.out.println("\nThe Game is a Draw");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
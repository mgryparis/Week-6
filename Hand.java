package week06_Coding_Assignment;
import java.util.ArrayList;
import java.util.List;

public class Hand {
	public String handName;
	List<Card> hand;
	public int numCards;
	
	public Hand(String handName) {
		List<Card> hand = new ArrayList<Card>();
		this.hand = hand;
		this.handName = handName;
		this.numCards = hand.size();
	}
	
	public String getHandName()	{
		return this.handName;
	}

	public int getNumCards()	{
		return numCards;
	}
	
	public void describe()	{
		int i = 0; int j = 1;
		if (numCards==0)	{
			System.out.println(handName+" has no cards (hand is empty)");
		}	else	{
			System.out.println(handName+"'s hand - as currently ordered, top to bottom:");
			for (Card card : hand)	{
				System.out.print(j+": ");
				card.describe();
				i++;j++;
				if	(i%4 != 0)	{
					System.out.print("\t");
				}	else	{
					System.out.print("\n");
				}
			}
			System.out.print("\n\n");
		}
	}
	public void addCard(Card card)	{
		hand.add(card);
		numCards = hand.size();
	}
	public Card drawACard()	{
		Card drawnCard = (hand.remove(0));
		numCards = hand.size();
		return drawnCard;
	}

	public Card flip() {
		Card drawnCard = (hand.remove(0));
		numCards = hand.size();
		return drawnCard;
	}

}

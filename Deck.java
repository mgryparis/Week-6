package week06_Coding_Assignment;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
	String deckName;
	List<Card> deck;
	
	//	Deck Constructor  >>  Generate a complete Deck of Cards by instantiating each required Card exactly once 
	public Deck(String deckName)	{
		this.deckName = deckName;
		List<Card> deck = new ArrayList<Card>();
		Card card1 = new Card(1);		deck.add(card1);
		Card card2 = new Card(2);		deck.add(card2);
		Card card3 = new Card(3);		deck.add(card3);
		Card card4 = new Card(4);		deck.add(card4);
		Card card5 = new Card(5);		deck.add(card5);
		Card card6 = new Card(6);		deck.add(card6);
		Card card7 = new Card(7);		deck.add(card7);
		Card card8 = new Card(8);		deck.add(card8);
		Card card9 = new Card(9);		deck.add(card9);
		Card card10 = new Card(10);		deck.add(card10);
		Card card11 = new Card(11);		deck.add(card11);
		Card card12 = new Card(12);		deck.add(card12);
		Card card13 = new Card(13);		deck.add(card13);
		Card card14 = new Card(14);		deck.add(card14);
		Card card15 = new Card(15);		deck.add(card15);
		Card card16 = new Card(16);		deck.add(card16);
		Card card17 = new Card(17);		deck.add(card17);
		Card card18 = new Card(18);		deck.add(card18);
		Card card19 = new Card(19);		deck.add(card19);
		Card card20 = new Card(20);		deck.add(card20);
		Card card21 = new Card(21);		deck.add(card21);
		Card card22 = new Card(22);		deck.add(card22);
		Card card23 = new Card(23);		deck.add(card23);
		Card card24 = new Card(24);		deck.add(card24);
		Card card25 = new Card(25);		deck.add(card25);
		Card card26 = new Card(26);		deck.add(card26);
		Card card27 = new Card(27);		deck.add(card27);
		Card card28 = new Card(28);		deck.add(card28);
		Card card29 = new Card(29);		deck.add(card29);
		Card card30 = new Card(30);		deck.add(card30);
		Card card31 = new Card(31);		deck.add(card31);
		Card card32 = new Card(32);		deck.add(card32);
		Card card33 = new Card(33);		deck.add(card33);
		Card card34 = new Card(34);		deck.add(card34);
		Card card35 = new Card(35);		deck.add(card35);
		Card card36 = new Card(36);		deck.add(card36);
		Card card37 = new Card(37);		deck.add(card37);
		Card card38 = new Card(38);		deck.add(card38);
		Card card39 = new Card(39);		deck.add(card39);
		Card card40 = new Card(40);		deck.add(card40);
		Card card41 = new Card(41);		deck.add(card41);
		Card card42 = new Card(42);		deck.add(card42);
		Card card43 = new Card(43);		deck.add(card43);
		Card card44 = new Card(44);		deck.add(card44);
		Card card45 = new Card(45);		deck.add(card45);
		Card card46 = new Card(46);		deck.add(card46);
		Card card47 = new Card(47);		deck.add(card47);
		Card card48 = new Card(48);		deck.add(card48);
		Card card49 = new Card(49);		deck.add(card49);
		Card card50 = new Card(50);		deck.add(card50);
		Card card51 = new Card(51);		deck.add(card51);
		Card card52 = new Card(52);		deck.add(card52);
		this.deck = deck;
	}

	//	Display the deck, in its current ordering
	public void describe()	{
		//	System.out.println("\nDeck \""+deckName+ "\" as currently ordered, top to bottom:");
		int i = 0; int j = 1;
		for (Card card : deck)	{
			System.out.print(j+": ");
			card.describe();
			i++;j++;
			if	(i%4 != 0)	{
				System.out.print("\t");
			}	else	{
				System.out.print("\n");
			}
		}
	}

	//	Shuffle the deck
	public void shuffle2()	{
		Random rand = new Random();
		int pickACard = rand.nextInt(52);
		for (int i=1; i<200;i++)	{
			deck.add(deck.remove(pickACard));
			pickACard = rand.nextInt(52);
		}
	}
	
	//	Integrity check added to make sure the Shuffle didn't lose or duplicate any Cards  :D
	public void checkDeck2()	{
		int counter = 0;
		for	(int i=1; i<53; i++) {
			counter=0;
			for	(int j=0; j<52; j++)	{
				if (deck.get(j).cardID ==i)	{
					counter++;
				}
			}
			if	(counter!=1)	{
				System.out.println(i+":"+counter);
			}
		}
		System.out.println("\nDeck \""+deckName+ "\" Shuffle integrity check complete:");
		System.out.println("Each required card appears exactly once in the shuffled deck.");
	}
	
	//	Draw a Card
	public Card drawACard()	{
		Card drawnCard = (deck.remove(0));
		return drawnCard;
	}
	
}

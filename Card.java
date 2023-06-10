/**
 * 
 */
package week06_Coding_Assignment;

public class Card {
	String name;	// two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace
	String suit;	// spades, clubs, hearts, diamonds
	int value;		// 2, 3, 4, 5, 6, 7, 8, 9, 10, j=11, q=12, k=13, a=14
	int cardID;		// unique cardID within a deck
	/*
	 *	card	2s	3s	4s	5s	6s	7s	8s	9s	10s	js	qs	ks	as
	 *	ID		1	2	3	4	5	6	7	8	9	10	11	12	13
	 *
	 *	card	2c	3c	4c	5c	6c	7c	8c	9c	10c	jc	qc	kc	ac
	 *	ID		14	15	16	17	18	19	20	21	22	23	24	25	26
	 * 
 	 *	card	2h	3h	4h	5h	6h	7h	8h	9h	10h	jh	qh	kh	ah
	 *	ID		27	28	29	30	31	32	33	34	35	36	37	38	39
	 *
	 *	card	2d	3d	4d	5d	6d	7d	8d	9d	10d	jd	qd	kd	ad
	 *	ID		40	41	42	43	44	45	46	47	48	49	50	51	52
	 */
	
	public Card(int cardID) {
		String[] names = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		if (cardID>52) {
			System.out.println("ERROR: Cannot create Card ID "+cardID+" (>52)");	//error out
		}	else if	(cardID>39){
				this.cardID = cardID;
				this.name = names[cardID-40];
				this.suit = "Diamonds";
				this.value = cardID-39;			
		}	else if (cardID>26) {
				this.cardID = cardID;
				this.name = names[cardID-27];
				this.suit = "Hearts";
				this.value = cardID-26;			
		}	else if (cardID>13)	{
				this.cardID = cardID;
				this.name = names[cardID-14];
				this.suit = "Clubs";
				this.value = cardID-13;			
		}	else if (cardID>0)	{
				this.cardID = cardID;
				this.name = names[cardID-1];
				this.suit = "Spades";
				this.value = cardID;			
		}	else	{
			System.out.println("ERROR: Cannot create Card ID "+cardID+" (<1)");	// error out
		}
	}
	public void describev()	{
		if (cardID>52)	{
			System.out.println("ERROR: Cannot describe Card ID "+cardID+" (>52)");
		}	else if	(cardID<1)	{
			System.out.println("ERROR: Cannot describe Card ID "+cardID+" (<1)");
		}	else	{
			System.out.println("CardID "+cardID+" is the "+name+" of "+suit);
		} 
		
	}
	
	public void describe()	{
		if (cardID>52)	{
			System.out.println("ERROR: Cannot describe CardID "+cardID+" (>52)");
		}	else if	(cardID<1)	{
			System.out.println("ERROR: Cannot describe CardID "+cardID+" (<1)");
		}	else	{
			System.out.print(name+" of "+suit);
		}
		
	}
} 

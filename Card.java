package Errthang;

public class Card {
	public static enum Suit
	{
		HEART, DIAMOND, CLUB, SPADE;
	}
	
	public static enum Number
	{
		ACE, TWO, THREE, FOUR, FIVE, SIX,
		SEVEN, EIGHT, NINE, TEN, JACK,
		QUEEN, KING
	}
	
	public Suit suit;
	public Number number;
	
	public Card(Suit s, Number n)
	{
		if(s != null && n.ordinal() < 13)
		{
			suit = s;
			number = n;
		}
	}
	
	public Card() {
		
	}

	public static Card randomCard()
	{
		int randSuit = (int) (Math.random() * 4) ;
		//System.out.println(randSuit);
		int randNumber = (int) (Math.random() * 13);
		//System.out.println(randNumber);
		Card c = new Card();
		c.suit = Suit.values()[randSuit];
		c.number = Number.values()[randNumber];
		return c;
	}
	
	public void print()
	{
		System.out.println(number.toString() + " of " +suit.toString() + "S");
	}
}

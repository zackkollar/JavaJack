package Errthang;
import java.util.ArrayList;
import Errthang.Card;
public class CardGame {
	public ArrayList<Card> deck;
	public ArrayList<Card> sortedDeck;
	
	public CardGame()
	{
		deck = new ArrayList<Card>();
		sortedDeck = new ArrayList<Card>();
	}
	
	public void startGame()
	{
		for(int x = 0; x < 4; x++)
		{
			for(int y = 0; y < 13; y++)
			{
				deck.add(new Card(Card.Suit.values()[x], Card.Number.values()[y]));
			}
		}
	}

	
	public void shuffle()
	{
		int cardsleft = 52;
		for (int i=0;i<cardsleft;cardsleft--)
		{
			int rnum = (int)(Math.random() * ( cardsleft - 0 ));
			sortedDeck.add(deck.get(rnum));
			deck.remove(rnum);

		}
		for (int i = 0; i < sortedDeck.size(); i++) 
		{
			Card c = sortedDeck.get(i);
			c.print();
		}
	}
}

package warGame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Deck extends LinkedList<Card> {
	
	private static final int Rank_start = 2;
	private List<String> cardValue = List.of("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");
	private List<String> Suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");
	
	
	
	public Deck () {

		for (int rank = Rank_start; rank < Rank_start + cardValue.size(); rank ++ ) {
		String cardName =  cardValue.get(rank - Rank_start);
		cardsforPrincesses(rank, cardName) ;
	}
	}

	private void cardsforPrincesses(int rank, String cardName) {
		for (String suit : Suits) {
			this.add(new Card(cardName, suit, rank));
		
		
		}
	}

	public void shuffle() {
		Collections.shuffle(this);
		
	}
	
}

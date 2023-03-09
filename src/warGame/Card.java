package warGame;

import java.util.List;

public class Card {
	
	private String name;
	private String suit;
	private int rank;
	

	public Card(String cardName, String suit, int rank) {
			
			this.name = cardName;
			this.suit = suit; 
			this.rank = rank;
					
			
		}


		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + " of " + suit;
		}


		public int getRank() {
			return rank;
		}

	
}
package warGame;

public class Player {
	
	private String princess;
	
	private Hand hand = new Hand();
	
	private int score;

	public Player(String princess) {
		
		
			this.princess = princess;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return princess;
	}

	public void draw(Deck deck) {
		getHand().add(deck.remove());
		
		
	}

	public Hand getHand() {
		return hand;
	}

	public Card flip() {
	
		return hand.remove();
	}

	public void addscore() {
		score = getScore() + 1;
		
	}

	public int getScore() {
		return score;
	}

}

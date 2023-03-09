package warGame;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class DisneyPrincessGalacticWar {

	
	private List<String> PrincessPlayers = List.of("Mulan", "Belle", "Cinderella", "Snow White", "Jasmine", "Rapunzel", 
													"Tiana", "Moana", "Pocahontas", "Ariel", "Aurora");
	
	
	private Random random = new Random();
	
	private Player  player1;
	private Player  player2;
	
	
	Deck deck; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new DisneyPrincessGalacticWar().run();
		
	}

	private void run () {
		selectPlayers();
		createDeck();
		cardDeal();
		gamePlay();
		identifyWinner();
		
		
		
		//System.out.println(player1.getHand());
		//System.out.println(player2.getHand());
		
}

	private void identifyWinner() {
		if (player1.getScore() > player2.getScore()) {
			printWinner(player1);
			printLoser(player2);
			
		}
		
		else if (player2.getScore() > player1.getScore()) {
			printWinner(player2);
			printLoser(player1);
			
		}
		
		else {
			printTie(player1, player2);
		
		}
		
	}

	private void printTie(Player player1, Player player2) {
		System.out.println(player1 + " & " + player2 + " tied with a score of " + player1.getScore() + ". The Kingdom Palace demands a rematch." );
		
	}

	private void printLoser(Player loser) {
		System.out.println(loser + " has failed as a Disney Princess and is the loser with a score of "
				+ loser.getScore() + ". Don't cry too hard now sweetheart!");
		
	}

	private void printWinner(Player winner) {
		System.out.println(winner + " is the Best and Prettiest Disney Princess Winner of them all with a score of " + winner.getScore());
		
	}

	private void gamePlay() {
		int turns = player1.getHand().size();
		
		for (int turn = 0; turn < turns; turn ++) {
			playersflipcards();
		}
		
	}

	private void playersflipcards() {
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		
		System.out.println(player1 + "'s" + " hand " + card1 + ", " + player2 + "'s" + " hand " + card2);
		
		if (card1.getRank() > card2.getRank()) {
			player1.addscore();
			System.out.println("* " + player1 + " wins");
		}
	
		else if (card2.getRank() > card1.getRank()) {
			player2.addscore();
			System.out.println("* " + player2 + " wins");
		}
		
		else {
			System.out.println("It's a Tie!");
		}
	}

	private void cardDeal() {
		int size = deck.size();
		for (int index = 0; index < size; index ++ ) {
			
			if (index % 2 == 0 ) {
				player1.draw(deck);
			} else {
				
				player2.draw(deck);
			}
		}
		
	}

	private void createDeck() {
		// TODO Auto-generated method stub
		
		deck = new Deck ();
		deck.shuffle();
		//System.out.println(deck);
		
	}

	private void selectPlayers() {
		// TODO Auto-generated method stub
		
		List<String> names = new LinkedList<>(PrincessPlayers);
		
		player1 = selectPlayer(names);
		player2 = selectPlayer(names);
		
		System.out.println(player1 + " is playing " + player2);
		
	}

	private Player selectPlayer(List<String> names) {
		// TODO Auto-generated method stub
		int pos = random.nextInt(names.size());
		String princess = names.remove(pos);
		return new Player(princess);
	}
}
package week06FINALPROJECT;

import java.util.ArrayList;
import java.util.List;

public class Player {

//	hand (list of cards)
	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
//	score (set to 0 in the constructor)
	
	public Player (String name) {
		this.score = 0;
		this.name = name;
	}
	
//	describe (prints out information about the player and calls the describe method for each
//	card in the Hand List)
	
	public void describe() {
		for (Card card : this.hand) {
			card.describe();
		}
	}
//	flip (removes and returns the top card of the hand)
	
	public Card flip() {
		return hand.remove(0);	
	}
//	draw (takes a deck as an arguments and calls the draw method on the deck, adding the returned
//	Card to the hand field)
	
	public void draw (Deck deck) {
		hand.add(deck.draw());	
	}
	
//	incrementScore (adds 1 to the Player's score field)
	
	public void incrementScore() {
		this.score++;
	}
	
	public int getScore() {
		return score;
	}

	
}

	
	
	
	




	   
	
	

	





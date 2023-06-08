package week06FINALPROJECT;

import java.util.ArrayList;
import java.util.List;

public class Player {

	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player (String name) {
		this.score = 0;
		this.name = name;
	}
	
	public void describe() {
		for (Card card : this.hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);	
	}
	
	public void draw (Deck deck) {
		hand.add(deck.draw());	
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	public int getScore() {
		return score;
	}

	
}

	
	
	
	




	   
	
	

	





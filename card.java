package week06FINALPROJECT;


public class Card {
	String name;
	String suit;
	int value;
	
//	value (contains a value from 2-14 representing cards 2-Ace)

	Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

//	1ii1)	Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	

//		1aii2)	describe (prints out information about a card)
	
	public void describe() {
		System.out.println(this.name + " of " + this.suit + ": " + this.value);
	}

}

	
	

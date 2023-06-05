package week06FINALPROJECT;

public class App {

	public static void main(String[] args) {

		
	Deck deck = new Deck();
	deck.describe();
	
	System.out.println("**********************************************************************");
	
	deck.shuffle();
	deck.describe();

	System.out.println("**********************************************************************");

	Card drawnCard = deck.draw();
	drawnCard.describe();
		
	System.out.println("**********************************************************************");

	System.out.println();
	
		}

	}

package week06FINALPROJECT;

public class App {
	
	public static void main(String[] args) {

//	2a)	instantiate a Deck and two Players

	Deck deck = new Deck();	
	
//	deck.describe();
	
	Player player1 = new Player("1");
	Player player2 = new Player("1");
	
//	2a)	call the shuffle method on the deck
	
	deck.shuffle();
	
//	deck.describe();
	
//	2b)	using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration 
//		using the Deck you instantiated.
		
	for (int i = 0; i < 52; i++) {
        if ( i % 2 == 0) {
            player1.hand.add(deck.draw());
        } else {
            player2.hand.add(deck.draw());       
        }
	}
	
//	System.out.println("Player 1 -----------------------------");
//	player1.describe();
//	System.out.println("Player 2 -----------------------------");
//	player2.describe();

	
//	2c)	using a traditional for loop, iterate 26 times and call the flip method for each player.
	
	for (int i = 0; i < 26; i++) {
		 Card player1Card = player1.flip();
		 Card player2Card = player2.flip();
	
	
	System.out.println("Player 1 -----------------------------");
	player1Card.describe();
	System.out.println("Player 2 -----------------------------");
	player2Card.describe();
	

		 
//	2d)	compare the value of each card returned by the two player’s flip methods. Call the incrementScore 
//	method on the player whose card has the higher value.

	player1Card.getValue();
	player2Card.getValue();
	
	if (player1Card.getValue() > player2Card.getValue()) {
		player1.incrementScore();
	} else if (player1Card.getValue() < player2Card.getValue()) {
		player2.incrementScore();
		}
	}	
	
	
//	2e) After the loop, compare the final score from each player. 

//	player1.getScore();
//	player2.getScore();
	
	System.out.println();
	System.out.println();
	System.out.println("Player 1 Final Score = " + player1.getScore());
	System.out.println("Player 2 Final Score = " + player2.getScore());

	
//	2f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which 
//		score is higher or if they are both the same.
	
	if (player1.getScore() > player2.getScore()) {
		System.out.println("Player 1 Wins!");
	}
	
	if (player1.getScore() < player2.getScore()) {
		System.out.println("Player 2 Wins!");
	}
	if (player1.getScore() == player2.getScore()) {
		System.out.println("It's A Draw!");
	}

	
	
	
	
	
	
	
	
//	Tips:  	Printing out information throughout the game adds value including easier debugging as you progress and 
//		 	a better user experience.
	
//	3a)	using the Card describe() method when each card is flipped illustrates the game play.
	
//	3b)	printing the winner of each turn adds interest. 
	
//	3c)	printing the updated score after each turn shows game progression.
	
//	3d)	at the end of the game: print the final score of each player and the winner’s name or “Draw” if the result 
//		is a tie.


	} //end of main


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	


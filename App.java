package week06FINALPROJECT;

public class App {
	
	public static void main(String[] args) {

//	instantiate a Deck and two Players

	Deck deck = new Deck();	
	
//	deck.describe();
	
	Player player1 = new Player("1");
	Player player2 = new Player("2");
	
//	call the shuffle method on the deck
	
	deck.shuffle();
	
//	deck.describe();
	
//	using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration 
//	using the Deck you instantiated.
		
	for (int i = 1; i <= 52; i++) {
        if ( i % 2 == 0) {
            player1.draw(deck);
        } else {
            player2.draw(deck);       
        }
	}
	
	
	System.out.println("Player 1 -----------------------------");
	player1.describe();
	System.out.println("Player 2 -----------------------------");
	player2.describe();

	
//	using a traditional for loop, iterate 26 times and call the flip method for each player.


	for (int i = 0; i < 26; i++) {
		player1.flip();
		player2.flip();
	}

	player1.describe();
	player2.describe();
//		---> why when i run both player1 and player2 they both come up with nothing???
	
//	2c) 	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore 
//			method on the player whose card has the higher value.
	
//	2e) 	After the loop, compare the final score from each player. 

//	2f)		Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which 
//			score is higher or if they are both the same.

//	Tips:  	Printing out information throughout the game adds value including easier debugging as you progress and 
//		 	a better user experience.
	
//	3a)		Using the Card describe() method when each card is flipped illustrates the game play.
	
//	3b)		Printing the winner of each turn adds interest. 
	
//	3c)		Printing the updated score after each turn shows game progression.
	
//	3d)		At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result 
//			is a tie.




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
	


This is a fully automated game of card game of WAR in Java.

It utilizes classes and objects.

There are no dependencies or prerequisites that need to be installed.

This project was created utilizing Java 17 in Eclipse Version: 2023-03 (4.27.0)

I'm most proud of the following lines of code during my first project.


for (int i = 0; i < 52; i++) {
        if ( i % 2 == 0) {
            player1.hand.add(deck.draw());
        } else {
            player2.hand.add(deck.draw());       
        }
	}
		
	for (int i = 0; i < 26; i++) {
		 Card player1Card = player1.flip();
		 Card player2Card = player2.flip();
   System.out.println("Player 1");
	player1Card.describe();
	System.out.println();
	System.out.println("Player 2");
	player2Card.describe();
//	3a)	using the Card describe() method when each card is flipped illustrates the game play.

	
		 
//	2d)	compare the value of each card returned by the two player’s flip methods. Call the incrementScore 
//	method on the player whose card has the higher value.

	player1Card.getValue();
	player2Card.getValue();
	
	if (player1Card.getValue() > player2Card.getValue()) {
		player1.incrementScore();
	} else if (player1Card.getValue() < player2Card.getValue()) {
		player2.incrementScore();
		}
	if (player1.getScore() > player2.getScore()) {
		System.out.println("		Player 1 Wins!");
}	if (player1.getScore() < player2.getScore()) {
		System.out.println("		Player 2 Wins!");
		}
	System.out.println("		Player 1 score is: " + player1.getScore());
	System.out.println("		Player 2 score is: " + player2.getScore());


public class Blackjack implements Game {

  Player player1;
  Player player2;
  Deck deck;
  int playerScore;
  int computerScore;

  public Blackjack() {

    this.player1 = new Player("Human");
    this.player2 = new Player("Computer");
    this.deck = new Deck();
  
  }

  public String welcomeMessage(){
    return "Blackjack! The rules are: best hand wins. Are you ready to play? (y/n)";
  }

  public String round(){

    deck.shuffle();
    deck.deal(player1);
    deck.deal(player1);
    deck.deal(player2);
    deck.deal(player2);

    System.out.println("Player 1 has " + player1.addUpHand() );
    System.out.println("Player 2 has " + player2.addUpHand() );

    if (player1.addUpHand() > player2.addUpHand()) {
      player1.addToScore();
      return player1.giveName() + " wins!";
    }
    else {
      player2.addToScore();
      return player2.giveName() + " wins!";
    }
    
  }

}
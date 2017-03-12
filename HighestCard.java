public class HighestCard implements Game {

  Player player1;
  Player player2;
  Deck deck;

  public HighestCard(){
    this.player1 = new Player("Human");
    this.player2 = new Player("Computer");
    this.deck = new Deck();
  }


  public String welcomeMessage(){
    return "The rules are: highest card wins. Are you ready to play? (y/n)";
  }

  public void round(){

    deck.shuffle();


  }

}
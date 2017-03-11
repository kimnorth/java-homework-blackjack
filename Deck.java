import java.util.ArrayList;

public class Deck {

  private ArrayList<Card> cardDeck;
  
  public Deck() {
    this.cardDeck = new ArrayList<Card>();
  }

  public int getSize(){
    return this.cardDeck.size();
  }

  // public void deal();

  // public void shuffle();

}
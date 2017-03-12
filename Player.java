import java.util.ArrayList;

public class Player {

  private String name;
  private ArrayList<Card> hand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String giveName(){
    return this.name;
  }

  public int giveHandSize(){
    return hand.size();
  }

  public void addToHand(Card card){
    hand.add(card);
  }

  public int addUpHand(){
    int total = 0;
    for (Card card : hand) {
      total += card.giveValue();
    }
    return total;
  }

} 
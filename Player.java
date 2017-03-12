import java.util.ArrayList;

public class Player {

  private String name;
  private ArrayList<Card> hand;
  private int score;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
    this.score = 0;
  }

  public String giveName(){
    return this.name;
  }

  public int getScore(){
    return this.score;
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
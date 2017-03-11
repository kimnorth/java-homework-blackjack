import java.util.ArrayList;

public class User extends Player {

  private String name;
  private ArrayList<Card> hand;

  public User(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String giveName(){
    return this.name;
  }

  public int giveHandSize(){
    return hand.size();
  }

} 
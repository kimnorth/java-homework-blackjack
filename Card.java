public class Card {

  private int faceValue;
  private String suit;
  private String faceCard;

  public Card(int value, String suit, String faceCard){
  
    this.faceValue = value;
    this.suit = suit;
    this.faceCard = faceCard;
  }

  public int giveValue() {
    return this.faceValue;
  }

  public String giveSuit() {
    return this.suit;
  }
}
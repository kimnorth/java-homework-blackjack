public class Card {

  private int faceValue;
  private String suit;

  public Card(int value, String suit){
    this.faceValue = value;
    this.suit = suit;
  }

  public int giveValue(){
    return this.faceValue;
  }



}
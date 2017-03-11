public class Card {

  private FaceValue faceValue;

  public Card(FaceValue value){
  
    this.faceValue = value;
  }

  public int giveValue() {
    int newValue = this.faceValue.toInt();
    return newValue;
  }


}
import java.util.ArrayList;

public class Deck {

  private ArrayList<Card> cardDeck;
  
  public Deck() {
    this.cardDeck = new ArrayList<Card>();
  }

  public int getSize(){
    return this.cardDeck.size();
  }

  public void addCard(Card card) {
    cardDeck.add(card);
  }

  public void addFourCards(Card card){
    for (int i = 0; i < 4; i++) {
      cardDeck.add(card);
    }
  }  

  // public void deal();

  // public void shuffle() {
  //   cardDeck.add(ace * 4);
  //     // Card card = new Card(FaceValue.TWO) * 4;
  //     // Card card = new Card(FaceValue.THREE) * 4;
  //     // Card card = new Card(FaceValue.FOUR) * 4;
  //     // Card card = new Card(FaceValue.FIVE) * 4;
  //     // Card card = new Card(FaceValue.SIX) * 4;
  //     // Card card = new Card(FaceValue.SEVEN) * 4;
  //     // Card card = new Card(FaceValue.EIGHT) * 4;
  //     // Card card = new Card(FaceValue.NINE) * 4;
  //     // Card card = new Card(FaceValue.TEN) * 4;
  //     // Card card = new Card(FaceValue.JACK) * 4;
  //     // Card card = new Card(FaceValue.QUEEN) * 4;
  //     // Card card = new Card(FaceValue.KING) * 4;
  //   }

    Card ace = new Card(FaceValue.ACE);


  }
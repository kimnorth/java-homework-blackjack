import java.util.ArrayList;
import java.util.Random;

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

  public void deal(Player player, Deck deck){

    int remainingCards = deck.getSize();

    Random rn = new Random();
    int randomNum = rn.nextInt(remainingCards + 1); // inclusive of top value

    Card dealtCard = deck.cardDeck.get(randomNum);

    player.addToHand(dealtCard);

  }

  public void shuffle() {

    addFourCards(ace);
    addFourCards(two);
    addFourCards(three);
    addFourCards(four);
    addFourCards(five);
    addFourCards(six);
    addFourCards(seven);
    addFourCards(eight);
    addFourCards(nine);
    addFourCards(ten);
    addFourCards(jack);
    addFourCards(queen);
    addFourCards(king);
    
    }

    Card ace = new Card(FaceValue.ACE);
    Card two = new Card(FaceValue.TWO);
    Card three = new Card(FaceValue.THREE);
    Card four = new Card(FaceValue.FOUR);
    Card five = new Card(FaceValue.FIVE);
    Card six = new Card(FaceValue.SIX);
    Card seven = new Card(FaceValue.SEVEN);
    Card eight = new Card(FaceValue.EIGHT);
    Card nine = new Card(FaceValue.NINE);
    Card ten = new Card(FaceValue.TEN);
    Card jack = new Card(FaceValue.JACK);
    Card queen = new Card(FaceValue.QUEEN);
    Card king = new Card(FaceValue.KING);

  }
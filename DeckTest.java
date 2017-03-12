import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DeckTest {

  Deck deck;
  Card card;
  Player user;

  @Before
  public void before() {
    deck = new Deck();
    card = new Card(FaceValue.KING);
    user = new Player("Player");
  }

  @Test
  public void hasDeckArray() {
    assertEquals( 0, deck.getSize() );
  }

  @Test
  public void hasCardsInDeck() {
    deck.addCard(card);
    assertEquals( 1, deck.getSize() );
  }

  @Test
  public void hasFiftyTwoCardsInDeck() {
    deck.shuffle();
    assertEquals( 52, deck.getSize() );
  }

  @Test
  public void hasFourCardsOfSameType() {
    deck.addFourCards(card);
    assertEquals( 4, deck.getSize() );
  }

  @Test
  public void canDealCards() {
    deck.shuffle();
    deck.deal(user);
    assertEquals( 1, user.giveHandSize() );
  }

  @Test
  public void hasLessCardsAfterDealing() {
    deck.shuffle();
    deck.deal(user);
    assertEquals( 51, deck.getSize() );
  }

}
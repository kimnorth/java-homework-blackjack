import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DeckTest {

  Deck deck;
  Card card;

  @Before
  public void before() {
    deck = new Deck();
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

}
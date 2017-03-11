import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DeckTest {

  Deck deck;

  @Before
  public void before() {
    deck = new Deck();
  }

  @Test
  public void hasDeckArray() {
    assertEquals(0, deck.getSize() );
  }

}
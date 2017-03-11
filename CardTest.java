import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CardTest {

  Card card;
  Card card2;

  @Before
  public void before() {
    card = new Card(FaceValue.TEN);
    card2 = new Card(FaceValue.KING);
  }

  @Test
  public void canReturnFaceValue() {
    assertEquals(10, card.giveValue() );
  }

  @Test
  public void canReturnFaceValueIfKing() {
    assertEquals(10, card2.giveValue());
  }

  

}
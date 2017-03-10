import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(10, "Hearts");
  }

  @Test
  public void canReturnFaceValue(){
    assertEquals( 10, card.giveValue() );
  }

}
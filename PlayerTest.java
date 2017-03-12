import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class PlayerTest {

  Player user;
  Card card;

  @Before
  public void before(){  
    user = new Player("human");
    card = new Card(FaceValue.TEN);
  }
  
  @Test
  public void canGiveName(){
    assertEquals( "human", user.giveName() );
  }

  @Test 
  public void hasHand(){
    assertEquals( 0, user.giveHandSize() );
  }

  @Test
  public void handHasCard(){
    user.addToHand(card);
    assertEquals( 1, user.giveHandSize() );
  }

  @Test
  public void canReturnValueOfHand() {
    user.addToHand(card);
    assertEquals( 10, user.addUpHand() );
  }

  @Test
  public void canReturnValueOfHandIfMultipleCards() {
    user.addToHand(card);
    user.addToHand(card);
    assertEquals( 20, user.addUpHand() );
  }


}
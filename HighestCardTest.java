import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class HighestCardTest {

  HighestCard highestCard;

  @Before
  public void before() {
    highestCard = new HighestCard();
  }

  @Test
  public void hasWelcomeMessage(){
    String asserted = "The rules are: highest card wins. Are you ready to play? (y/n)";
    assertEquals( asserted, highestCard.welcomeMessage() );
  }



}
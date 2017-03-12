import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.mockito.*;
import static org.mockito.Mockito.*;

public class HighestCardTest {

  HighestCard highestCard;
  HighestCard mockHighestCard;

  @Before
  public void before() {
    highestCard = new HighestCard();
    mockHighestCard = Mockito.spy(highestCard);
  }

  @Test
  public void testHasWelcomeMessage(){
    String expected = "The rules are: highest card wins. Are you ready to play? (y/n)";
    assertEquals( expected, highestCard.welcomeMessage() );
  }

  @Test
  public void testHasWinnerStub(){
    String expected = "Human wins!";
    Mockito.when(mockHighestCard.round()).thenReturn("Human wins!");
    String result = mockHighestCard.round();
    assertEquals( expected, highestCard.round() );
  }


}
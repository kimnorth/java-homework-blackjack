import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class HighestCardTest {

  HighestCard highestCard;
  Player player1;
  Player player2;

  @Before
  public void before() {
    highestCard = new HighestCard();
    player1 = new Player("Human");
    player2 = new Player("Computer");
  }

  @Test
  public void hasWelcomeMessage(){
    String expected = "The rules are: highest card wins. Are you ready to play? (y/n)";
    assertEquals( expected, highestCard.welcomeMessage() );
  }

  @Test
  public void hasWinner(){
    String expected = "Human wins!";
    assertEquals( expected, highestCard.round() );
  }


}
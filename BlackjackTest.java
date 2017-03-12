import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.mockito.*;
import static org.mockito.Mockito.*;

public class BlackjackTest {

  Blackjack game;

  @Before
  public void before() {
    game = new Blackjack();
  }

  @Test
  public void testHasWelcomeMessage() {
    String expected = "Blackjack! The rules are: best hand wins. Are you ready to play? (y/n)";
    assertEquals( expected , game.welcomeMessage() );
  }

  @Test
  public void testHasWinner(){
    String expected = "Human wins!";
    assertEquals( expected, game.round() );
  }



}
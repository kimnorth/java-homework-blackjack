import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class UserTest {

  User user;

  @Before
  public void before(){  
    user = new User("human");
  }
  
  @Test
  public void canGiveName(){
    assertEquals( "human", user.giveName() );
  }

  @Test 
  public void hasHand(){
    assertEquals( 0, user.giveHandSize() );
  }

  


}
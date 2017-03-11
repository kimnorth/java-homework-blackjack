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


}
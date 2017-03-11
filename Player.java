import java.util.ArrayList;

public abstract class Player {

  private String name;
  private ArrayList<Card> hand;

  public abstract String giveName();
  public abstract int giveHandSize();

}
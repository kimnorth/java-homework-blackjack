public enum FaceValue {

  ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

  public Integer toInt(){
    switch(this) {
    case ACE: return 1; //  For BlackJack, start as 11. If starting hand contains 11,
    case TWO: return 2; //  if player bust convert back to 1.
    case THREE: return 3;
    case FOUR: return 4;
    case FIVE: return 5;
    case SIX: return 6;
    case SEVEN: return 7;
    case EIGHT: return 8;
    case NINE: return 9;
    case TEN: 
    case JACK: 
    case QUEEN: 
    case KING: return 10;
    default: return null;
    }
  }

}
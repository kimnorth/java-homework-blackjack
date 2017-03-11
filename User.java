public class User implements Player {

  private String name;
  
  public User(String name) {
    this.name = name;
  }

  public String giveName(){
    return this.name;
  }

} 
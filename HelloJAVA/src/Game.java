public class Game {
  private String description;

  public Game() {
    // TODO Auto-generated constructor stub
  }

  public Game(String newDescription) {
    // TODO Auto-generated constructor stub
    this.setDescription(newDescription);
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String toString() {
    // TODO Auto-generated method stub
    return ("Description : " + this.getDescription());
  }

}

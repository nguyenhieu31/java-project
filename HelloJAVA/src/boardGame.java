public class boardGame extends Game {
  private double MinNumberOfPlayer;
  private double MaxNumberOfPlayer;
  private double TimeLimiteToFinish;

  public boardGame() {
  }

  public boardGame(String newDescription, double MinNumberOfPlayer, double MaxNumberOfPlayer,
      double TimeLimiteToFinish) {
    super(newDescription);
    this.MinNumberOfPlayer = MinNumberOfPlayer;
    this.MaxNumberOfPlayer = MaxNumberOfPlayer;
    this.TimeLimiteToFinish = TimeLimiteToFinish;
  }

  public double getMinNumberOfPlayer() {
    return this.MinNumberOfPlayer;
  }

  public double getMaxNumberOfPlayer() {
    return this.MaxNumberOfPlayer;
  }

  public double getTimeLimiteToFinish() {
    return this.TimeLimiteToFinish;
  }

  public void setMaxNumberOfPlayer(double MaxNumberOfPlayer) {
    this.MaxNumberOfPlayer = MaxNumberOfPlayer;
  }

  public void setMinNumberOfPlayer(double MinNumberOfPlayer) {
    this.MinNumberOfPlayer = MinNumberOfPlayer;
  }

  public void setTimeLimiteToFinish(double TimeLimiteToFinish) {
    this.TimeLimiteToFinish = TimeLimiteToFinish;
  }

  @Override
  public String toString() {

    return super.toString() + "\nMin Number Of Player : " + this.getMinNumberOfPlayer() + "\nMax Number Of Player : "
        + this.getMaxNumberOfPlayer() + "\nTime Limite To Finish : " + this.getTimeLimiteToFinish();
  }

  public static void main(String[] args) {
    Game hieu = new boardGame("hello", 10, 10, 10);
    System.out.println(hieu);
  }
}

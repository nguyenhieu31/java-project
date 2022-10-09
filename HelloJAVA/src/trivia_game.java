public class trivia_game extends Game {
  private double ultimateMoneyPrize;
  private double numberOfQuestion;

  trivia_game() {
  }

  trivia_game(String newDescription, double ultimateMoneyPrize, double numberOfQuestion) {
    super(newDescription);
    setUltimateMoneyPrize(ultimateMoneyPrize);
    setNumberOfQuestion(numberOfQuestion);
  }

  void setUltimateMoneyPrize(double ultimateMoneyPrize) {
    this.ultimateMoneyPrize = ultimateMoneyPrize;
  }

  void setNumberOfQuestion(double numberOfQuestion) {
    this.numberOfQuestion = numberOfQuestion;
  }

  public double getultimateMoneyPrize() {
    return this.ultimateMoneyPrize;
  }

  public double getNumberOfQuestion() {
    return this.numberOfQuestion;
  }

  @Override
  public String toString() {
    return super.toString() + " UltimateMoneyPrize: " + this.ultimateMoneyPrize + " NumberOfQuestion: "
        + this.numberOfQuestion;
  }

  public static void main(String[] args) throws Exception {
    Game hieu = new trivia_game("hello", 10, 10);
    System.out.println(hieu);
  }
}
